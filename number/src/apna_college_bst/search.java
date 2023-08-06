package apna_college_bst;

//import apna_college_bst.build_bst.Node;

public class search {
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
	public static boolean search_node(Node root,int key) {
		if(root==null)
			return false;
		if(root.data==key)
			return true;
		if(key<root.data)
			return search_node(root.left,key);
		else
			return search_node(root.right,key);
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
		int key=7;
		System.out.println(search_node(root,key));
	}
}
