package binary_tree;
//import java.util.*;
public class SumTree {
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
	public static void sum(Node root) {
		if(root==null)
			return;
		int num=root.data;
		root.data=doSum(root)-num;
		System.out.print(root.data+" ");
		sum=0;
		sum(root.left);
		sum(root.right);
	}
	static int sum=0;
	public static int doSum(Node root) {
		if(root==null)
			return 0;
		sum+=root.data;
		doSum(root.left);
		doSum(root.right);
		return sum;
	}
	public static void preorder(Node root) {
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public static void main(String args[]) {
		Node root=new Node(10);
		root.left=new Node(2);
		root.right=new Node(6);
		root.left.left=new Node(8);
		root.left.right=new Node(4);
		root.right.left=new Node(7);
		root.right.right=new Node(8);
		preorder(root);
		System.out.println();
		sum(root);
		System.out.println();
		preorder(root);
	}
}
