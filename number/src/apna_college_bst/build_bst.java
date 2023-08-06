package apna_college_bst;

public class build_bst {
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
	public static Node insert(Node root,int val) {
		if(root==null) {
			root=new Node(val);
			return root;
		}
		if(val<root.data)
			root.left=insert(root.left,val);
		else if(val>root.data)
			root.right=insert(root.right,val);
		return root;
	}
	public static void inorder(Node root) {
		if(root==null)
			return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public static void main(String args[]) {
		int arr[]= {5,1,3,4,2,7};
		Node root=null;
		for(int i=0;i<arr.length;i++)
			root=insert(root,arr[i]);
		inorder(root);
	}
}
