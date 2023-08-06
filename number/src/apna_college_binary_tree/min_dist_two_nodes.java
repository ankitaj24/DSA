package apna_college_binary_tree;

//import apna_college_binary_tree.Lowest_common_ancestor.Node;

public class min_dist_two_nodes {
	static class Node {
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	/*			1
	 * 		   / \
	 *        2    3
	 *       / \ /  \
	 *      4  5 6   7
	 */
	public static Node lca_cal(Node root,int n1,int n2) {
		if(root==null||root.data==n1||root.data==n2)
			return root;
		Node leftlca=lca_cal(root.left,n1,n2);
		Node rightlca=lca_cal(root.right,n1,n2);
		if(leftlca==null)
			return rightlca;
		else if(rightlca==null)
			return leftlca;
		
		return root;
		
	}
	public static int min_dist(Node root,int n) {
		if(root==null)
			return -1;
		if(root.data==n)
			return 0;
		int leftmin=min_dist(root.left,n);
		int rightmin=min_dist(root.right,n);
		if(leftmin==-1&&rightmin==-1)
			return -1;
		else if(leftmin==-1)
			return rightmin+1;
		else
			return leftmin+1;
	}
	public static int cal(Node root,int n1,int n2) {
		Node lca=lca_cal(root,n1,n2);
		int dist1=min_dist(lca,n1);
		int dist2=min_dist(lca,n2);
		return dist1+dist2;
	}
	public static void main(String args[]) {
		Node newNode=new Node(1);
		newNode.left=new Node(2);
		newNode.right=new Node(3);
		newNode.left.left=new Node(4);
		newNode.left.right=new Node(5);
		newNode.right.left=new Node(6);
		newNode.right.right=new Node(7);		
		int n1=2;int n2=7;
		System.out.println(cal(newNode,n1,n2));
	}
}

