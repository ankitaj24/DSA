package binary_tree;
import java.util.*;
public class KthAncestor {
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
	public static boolean find(Node root,int node,ArrayList<Integer> arr)
    {
		if(root==null) {
			return false;
		}
        if(root.data==node) {
        	arr.add(node);
        	return true;
        }
        arr.add(root.data);
        if(!(find(root.left,node,arr)||find(root.right,node,arr))) {
        	arr.remove(arr.size()-1);
        	return false;
        }
        return true;
        
    }
	public static void main(String args[]) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.left.right.left=new Node(8);
		root.left.right.left.right=new Node(9);
		root.right=new Node(3);
		root.right.left=new Node(6);
		root.right.right=new Node(7);
		int k=1;
		ArrayList<Integer> arr=new ArrayList<>();
		System.out.println(find(root,3,arr));
		System.out.println(arr);
		if(arr.size()-1>=k) {
			System.out.println("Kth ancestor: "+arr.get(arr.size()-1-k));
			return;
		}
		System.out.println("Kth ancestor: -1");
	}
}
