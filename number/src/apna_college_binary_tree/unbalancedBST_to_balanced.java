package apna_college_binary_tree;

//import apna_college_binary_tree.binary_tree_2nd_part.Node;
import java.util.*;



public class unbalancedBST_to_balanced {
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
	public static void inorder(Node root,ArrayList<Integer> arr) {
		if(root==null) {
			return;
		}
		inorder(root.left,arr);
		arr.add(root.data);
		inorder(root.right,arr);
		//return arr;
	}
	public static Node balancedbst(Node root) {
		//inorder
		ArrayList<Integer> arr=new ArrayList<>();
		inorder(root,arr);
		
		//sorted inorder -> balanced bst
		root=arr2bst(arr,0,arr.size()-1);
		return root;
	}
	public static Node arr2bst(ArrayList<Integer> arr,int lb,int ub) {
		if(lb>ub)
			return null;
		int mid=(lb+ub)/2;
		Node root=new Node(arr.get(mid));
		root.left=arr2bst(arr,lb,mid-1);
		root.right=arr2bst(arr,mid+1,ub);
		return root;
	}
	//preorder
	public static void preorder(Node root) {
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public static void main(String args[]) {
		Node root=new Node(8);
		root.left=new Node(6);
		root.left.left=new Node(5);
		root.left.left.left=new Node(3);
		root.right=new Node(10);
		root.right.right=new Node(11);
		root.right.right.right=new Node(12);
		root=balancedbst(root);
		preorder(root);
	}	
}
