package apna_college_binary_tree;

public class Kth_ancestor {
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
	public static int ancestor(Node root,int val,int k) {
		if(root==null)
			return -1;
		if(root.data==val)
			return 0;
		int left=ancestor(root.left,val,k);
		int right=ancestor(root.right,val,k);
		
		if(left==-1&&right==-1)
			return -1;
		
		int max=Math.max(left, right);
		if(max+1==k)
			System.out.println(root.data);
		return max+1;
	}
	public static void main(String args[]) {
		/*			1
		 * 		   / \
		 *        2   3
		 *       / \   \
		 *      4   5   6
		 *      */
		 Node newNode=new Node(1);
		newNode.left=new Node(2);
		newNode.right=new Node(3);
		newNode.left.left=new Node(4);
		newNode.left.right=new Node(5);
		newNode.right.left=new Node(6);
		newNode.right.right=new Node(7);	
		int k=2,val=5;
		ancestor(newNode,val,k);
	}
}
