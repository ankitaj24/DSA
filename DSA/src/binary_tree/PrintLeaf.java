package binary_tree;


import java.util.*;
public class PrintLeaf {
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
	public static void printLeaf(Node root) {
		if(root==null)
	        return;
	    int level=levels(root);
	    System.out.println(level);
	    ArrayList<Integer> arr=new ArrayList<>();
	    leaf(root,arr,level);
	    System.out.println();
	    System.out.println(arr);
	}
	public static void leaf(Node root,ArrayList<Integer> arr,int level) {
		if(root==null) {
			return;
		}
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		q.add(null);
		int l=1;
		while(!q.isEmpty()) {
			Node curr=q.remove();
			if(curr==null) {
				if(q.isEmpty()) {
					break;
				}
				else {
					System.out.println();
					l++;
					q.add(null);
				}
			}
			else {
				System.out.print(curr.data+" ");
				if(curr.left!=null)
					q.add(curr.left);
				if(curr.right!=null)
					q.add(curr.right);
				if(curr.left==null&&curr.right==null&&l==level)
					arr.add(curr.data);
			}
		}
	}
	public static int levels(Node root){
        if(root==null)
        return 0;
        int leftHeight=levels(root.left);
        int rightHeight=levels(root.right);
        
        return Math.max(leftHeight,rightHeight)+1;
    }
	public static void main(String args[]) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		//root.left.right=new Node(4);
		root.right.left=new Node(5);
		root.right.right=new Node(6);
		//root.left.right.right=new Node(7);
		root.right.left.left=new Node(8);
		root.right.left.right=new Node(9);
		root.right.right.right=new Node(10);
		printLeaf(root);
	}
}
