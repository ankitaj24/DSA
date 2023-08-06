package apna_college_bst;

//import apna_college_bst.print_in_range.Node;
import java.util.*;
public class Root_to_leaf {
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
	public static void root2leaf(Node root,ArrayList<Integer> path) {
		if(root==null)
			return;
		path.add(root.data);
		if(root.left==null&&root.right==null) {
			System.out.println(path);
		}		
		root2leaf(root.left,path);
		root2leaf(root.right,path);
		path.remove(path.size()-1);
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
		root2leaf(root,new ArrayList<>());
	}
}
