package apna_college_binary_tree;

//import apna_college_bst.mirror_bst.Node;

public class sorted_array_to_bst {
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
	public static Node arr2bst(int arr[],int lb,int ub) {
		if(lb>ub)
			return null;
		int mid=(lb+ub)/2;
		Node root=new Node(arr[mid]);
		root.left=arr2bst(arr,lb,mid-1);
		root.right=arr2bst(arr,mid+1,ub);
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
		int arr[]= {3,5,6,8,10,11,12};
		//Node root=null;
		Node root=arr2bst(arr,0,arr.length-1);
		inorder(root);
	}
}
