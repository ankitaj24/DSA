package binary_tree;

//import binary_tree.height.Node;

public class InvertTree {
	static class Node{
		int data;
		Node right;
		Node left;
		Node(int data){
			this.data=data;
			this.right=null;
			this.left=null;
		}
	}
	public static void preorder(Node root) {
		if(root==null)
			return;
		System.out.println(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public static void inversion(Node root) {
		if(root==null)
			return;
		Node temp=root.left;
		root.left=root.right;
		root.right=temp;
		inversion(root.left);
		inversion(root.right);
	}
	public static void main(String args[]) {
		Node root=new Node(4);
		root.left=new Node(2);
		root.left.left=new Node(1);
		root.left.right=new Node(3);
		root.right=new Node(7);
		root.right.left=new Node(6);
		root.right.right=new Node(9);
		
		inversion(root);
		preorder(root);
		
	}
}
