package apna_college_binary_tree;

//import apna_college_binary_tree.binary_tree_2nd_part.Node;

public class Kth_level {
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
	public static void printKthnodes(Node root,int levels,int k) {
		if(root==null)
			return;
		if(levels==k) {
			System.out.print(root.data+" ");
			return;
		}
		printKthnodes(root.left,levels+1,k);
		printKthnodes(root.right,levels+1,k);
	}
	public static void main(String args[]) {
		Node newNode=new Node(1);
		newNode.left=new Node(2);
		newNode.right=new Node(3);
		newNode.left.left=new Node(4);
		newNode.left.right=new Node(5);
		newNode.right.left=new Node(6);
		newNode.right.right=new Node(7);		
		printKthnodes(newNode,1,3);
	}
}
