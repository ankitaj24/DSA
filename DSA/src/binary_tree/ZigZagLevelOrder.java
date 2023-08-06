package binary_tree;
import java.util.*;
public class ZigZagLevelOrder {
	static class Node{
		int data;
		Node right;
		Node left;
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	public static ArrayList<Integer> zigZagTraversal(Node root)
	{
		ArrayList<Integer> arr=new ArrayList<>();
        levelOrder(arr,root);
        return arr;
	}
	public static void levelOrder(ArrayList<Integer> arr,Node root){
        if(root==null)
        return;
        ArrayList<Integer> temp=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int level=0;
        while(true) {
        	int size=q.size();
        	if(size==0)
        		break;   
        	level++;
	        while(size>0){
	            Node curr=q.remove(); 
	            if(curr!=null) {
		            temp.add(curr.data);
	                if(curr.left!=null) 
	                q.add(curr.left);
	                if(curr.right!=null) 
	                q.add(curr.right); 
                }           
	            size--;
	        }
	        if(level%2==1) {
		        for(int i=0;i<temp.size();i++) 
		        	arr.add(temp.get(i));		        
	        }else {
	        	for(int i=temp.size()-1;i>=0;i--) {
	        		arr.add(temp.get(i));	
		        }
	        }
	        temp.clear();
        }
    }
	public static void main(String args[]) {
		Node root=new Node(9);
		root.left=new Node(7);
		root.right=new Node(9);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(10);
		root.right.right=new Node(6);
		root.left.left.left=new Node(9);
		root.left.left.right=new Node(7);
		System.out.println(zigZagTraversal(root));
	}
}
