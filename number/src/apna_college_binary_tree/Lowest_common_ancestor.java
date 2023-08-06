package apna_college_binary_tree;

//import apna_college_binary_tree.binary_tree_2nd_part.Node;
import java.util.*;
public class Lowest_common_ancestor {
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
	public static boolean getPath(Node root,int n,ArrayList<Node> path) {
		if(root==null)
			return false;
		path.add(root);
		if(root.data==n)
			return true;
		boolean foundLeft=getPath(root.left,n,path);
		boolean foundRight=getPath(root.right,n,path);
		if(foundLeft||foundRight)
			return true;
		path.remove(path.size()-1);
		return false;
	}
	
	public static Node lca(Node root,int n1,int n2) {
		ArrayList<Node> path1=new ArrayList<>();
		ArrayList<Node> path2=new ArrayList<>();
		getPath(root,n1,path1);
		getPath(root,n2,path2);
		
		//last common ancestor
		int i=0;
		for(i=0;i<path1.size()&&i<path2.size();i++) {
			if(path1.get(i)!=path2.get(i)) {
				break;
			}
		}
		
		return path1.get(i-1);
	}
	
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
	public static void main(String args[]) {
		Node newNode=new Node(1);
		newNode.left=new Node(2);
		newNode.right=new Node(3);
		newNode.left.left=new Node(4);
		newNode.left.right=new Node(5);
		newNode.right.left=new Node(6);
		newNode.right.right=new Node(7);		
		int n1=6;int n2=7;
		System.out.println(lca(newNode,n1,n2).data);//1st approach: O(n)(T.c) O(n)(S.c)
		System.out.println(lca_cal(newNode,n1,n2).data);//2nd approach: O(n)(T.c) O(1)(S.c)
	}
}
