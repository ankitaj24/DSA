package apna_college_bst;


public class validate_bst {
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
	public static boolean isValid(Node root,Node min,Node max) {
		if(root==null)
			return true;
		if(min!=null&&root.data<=min.data)
			return false;
		else if(max!=null&&root.data>=max.data)
			return false;
		return isValid(root.left,min,root)&&isValid(root.right,root,max);
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
		System.out.print(isValid(root,null,null));
	}
}
