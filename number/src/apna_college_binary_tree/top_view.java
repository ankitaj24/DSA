package apna_college_binary_tree;

//import apna_college_binary_tree.binary_tree_2nd_part.Node;
import java.util.*;
public class top_view {
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
	static class Info{
		Node node;
		int hd;//(horizontal_distance)
		Info(Node node,int hd){
			this.node=node;
			this.hd=hd;
		}
	}
	public static void topView(Node root) {
		//level order
		Queue<Info> q=new LinkedList<>();
		HashMap<Integer,Node> map=new HashMap<>();
		int min=0,max=0;
		
		q.add(new Info(root,0));
		q.add(null);
		
		while(!q.isEmpty()) {
			Info curr=q.remove();
			if(curr==null) {
				if(q.isEmpty()) {
					break;					
				}
				else
					q.add(null);
			}else {
				if(!map.containsKey(curr.hd))
					map.put(curr.hd, curr.node);
				if(curr.node.left!=null) {
					q.add(new Info(curr.node.left,curr.hd-1));
					min=Math.min(min, curr.hd-1);
				}
				if(curr.node.right!=null) {
					q.add(new Info(curr.node.right,curr.hd+1));
					max=Math.max(max, curr.hd+1);
				}
			}			
		}
		for(int i=min;i<=max;i++) {
			System.out.print(map.get(i).data+" ");
		}
	}
	public static void main(String args[]) {		
		Node newNode=new Node(1);
		newNode.left=new Node(2);
		newNode.right=new Node(3);
		newNode.left.left=new Node(4);
		newNode.left.right=new Node(5);
		newNode.right.left=new Node(6);
		newNode.right.right=new Node(7);	
		topView(newNode);
	}
}
