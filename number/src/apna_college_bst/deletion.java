package apna_college_bst;

//import apna_college_bst.search.Node;

//import apna_college_bst.search.Node;

public class deletion {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	public static Node delete(Node root,int key) {
		if(root==null)
			return null;
		if(root.data==key)
		{
			//case one: deletion of leaf node
			if(root.left==null&&root.right==null)
				return null;
			
			//case two: deletion of node which has single child
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			
			//case three: deletion of node having two children
			Node IS=findInorderSuccessor(root.right);//inorder successor is leftmost node in the right subtree
			root.data=IS.data;
			root.right=delete(root.right,IS.data);
			
		}
		else if(key<root.data)
			root.left= delete(root.left,key);
		else
			root.right= delete(root.right,key);
		
		return root;
	}
	
	public static Node findInorderSuccessor(Node root){
		while(root.left!=null) {
			root=root.left;
		}
		return root;
	}
	public static void inorder(Node root) {
		if(root==null)
			return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
		//System.out.println();
	}
	public static void main(String args[]) {
		Node root=new Node(8);
		root.left=new Node(5);
		root.left.left=new Node(3);
		root.left.right=new Node(6);
		root.left.left.left=new Node(1);
		root.left.left.right=new Node(4);
		root.right=new Node(10);
		root.right.right=new Node(11);
		root.right.right.right=new Node(14);
		int key=8;
		inorder(root);
		delete(root,key);
		System.out.println();
		inorder(root);
	}
}
