package apna_college_bst;


public class print_in_range {
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
	public static void printInRange(Node root,int n1,int n2) {
		if(root==null) {
			return;
		}
		if(n1<root.data&&n2<root.data)
			printInRange(root.left,n1,n2);
		else if(n1>root.data&&root.data>n2)
			printInRange(root.right,n1,n2);
		else if(n1<=root.data&&root.data<=n2) {
			printInRange(root.left,n1,n2);
			System.out.print(root.data+" ");
			printInRange(root.right,n1,n2);
		}
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
		int n1=3,n2=10;
		printInRange(root,n1,n2);
	}
}
