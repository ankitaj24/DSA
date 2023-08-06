package apna_college_binary_tree;

import java.util.*;

public class merge_bst {
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
	public static void inorder(Node root,ArrayList<Integer> arr){
		if(root==null)
			return;
		inorder(root.left,arr);
		arr.add(root.data);
		inorder(root.right,arr);
	}
	public static ArrayList<Integer> merge_arr(ArrayList<Integer> arr1,ArrayList<Integer> arr2) {
		ArrayList<Integer> result=new ArrayList<>();
		int i=0,j=0;
		while(i<arr1.size()&&j<arr2.size()) {
			if(arr1.get(i)<arr2.get(j)) {
				result.add(arr1.get(i));
				i++;
			}
			else {
				result.add(arr2.get(j));
				j++;
			}
		}
		while(i<arr1.size()) {			
			result.add(arr1.get(i));
			i++;			
		}
		while(j<arr2.size()) {			
			result.add(arr2.get(j));
			j++;		
		}
		return result;
	}
	public static Node createBST(ArrayList<Integer> arr,int lb,int ub) {
		if(lb>ub)
			return null;
		int mid=(lb+ub)/2;
		Node root=new Node(arr.get(mid));
		root.left=createBST(arr,lb,mid-1);
		root.right=createBST(arr,mid+1,ub);
		return root;		
	}
	public static void preorder(Node root) {
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public static void inorder(Node root) {
		if(root==null)
			return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public static Node merge(Node root1,Node root2) {
		ArrayList<Integer> arr1=new ArrayList<>();
		inorder(root1,arr1);
		ArrayList<Integer> arr2=new ArrayList<>();
		inorder(root2,arr2);
		//System.out.println(arr1+" "+arr2);
		ArrayList<Integer> result=merge_arr(arr1,arr2);
		System.out.println(arr1+" "+arr2+" "+result);
		Node root=createBST(result,0,result.size()-1);
		return root;
	}
	public static void main(String args[]) {
		Node root1=new Node(5);
		root1.left=new Node(3);
		root1.right=new Node(8);
		Node root2=new Node(4);
		root2.left=new Node(2);
		root2.right=new Node(9);
		Node root=merge(root1,root2);
		preorder(root);
		System.out.println();
		inorder(root);
	}
}
