package binary_tree;
import java.util.*;

//import binary_tree.height.BinaryTree;
//import binary_tree.height.Node;
public class LevelOrder {
	/**
	 * Definition for a binary tree node.*/
	 public static class TreeNode {
		  int val;
		  TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
	 
	 static class BinaryTree{
		 static int idx=-1;
		public static TreeNode buildTree(int nodes[]) {			
			idx++;
			if(nodes[idx]==-1) {
				return null;
			}
			
			TreeNode root=new TreeNode(nodes[idx]);
			root.left=buildTree(nodes);
			root.right=buildTree(nodes);
			
			return root;
			
		}
		public static List<List<Integer>> levelOrder(TreeNode root) {
	        if(root==null)
	        return new ArrayList<>();
	        List<Integer> line=new ArrayList<>();
	        List<List<Integer>> result=new ArrayList<>();
	        Queue<TreeNode> q=new LinkedList<>();
	        q.add(root);
	        //line.add(root.val);
	        q.add(null);
	        while(!q.isEmpty()){
	            TreeNode curr=q.remove();
	            if(curr==null){
	            	System.out.println();
	            	result.add(new ArrayList<Integer>(line));
	                if(q.isEmpty()){                    
	                    break;
	                }
	                else{
	                    result.add(new ArrayList<Integer>(line));
	                    q.add(null);
	                    line.clear();
	                }
	            }
	            else{
	            	System.out.print(curr.val+" ");
	                line.add(curr.val);
	                if(curr.left!=null)
	                q.add(curr.left);
	                if(curr.right!=null)
	                q.add(curr.right);
	            }
	        }
	        return result;
	    }
	}    
	public static void main(String args[]) {
		//int nodes[]= {3,9,-1,-1,20,15,-1,-1,7,-1,-1};
		int nodes[]= {1,2,4,-1,-1,5,-1,6,-1,7,-1,-1,3,-1,-1};
		TreeNode root=BinaryTree.buildTree(nodes);
		System.out.println(BinaryTree.levelOrder(root));
	}
}
