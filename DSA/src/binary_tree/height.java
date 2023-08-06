package binary_tree;
import java.util.*;
public class height {
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
	static class BinaryTree{
		static int idx=-1,height= 0;
		public static Node buildTree(int nodes[]) {			
			idx++;
			if(nodes[idx]==-1) {
				return null;
			}
			
			Node root=new Node(nodes[idx]);
			root.left=buildTree(nodes);
			root.right=buildTree(nodes);
			
			return root;
			
		}
		
		public static void levelOrder(Node root) {
			if(root==null)
				return;
			Queue<Node> q=new LinkedList<>();
			q.add(root);
			q.add(null);
			
			while(!q.isEmpty()) {
				Node curr=q.remove();
				if(curr==null) {
					System.out.println();
					if(q.isEmpty()) {
						break;
					}
					else {
						q.add(null);
					}
				}
				else {
					System.out.print(curr.data+" ");
					if(curr.left!=null)
						q.add(curr.left);
					if(curr.right!=null)
						q.add(curr.right);
				}
			}			
		}
		public static void height_Node(Node root) {
			if(root==null) {
				return;
			}
			Queue<Node> q=new LinkedList<>();
			q.add(root);
			q.add(null);
			
			while(!q.isEmpty()) {
				Node curr=q.remove();
				if(curr==null) {
					if(!q.isEmpty()) {
						height++;
						q.add(null);
					}
					else {
						height++;
						break;
					}					
				}
				else {
					if(curr.left!=null)
						q.add(curr.left);
					if(curr.right!=null)
						q.add(curr.right);
				}
			}
		}
		public static int height_Node_recursive(Node root) {
			if(root==null)
				return 0;
			int leftHeight=height_Node_recursive(root.left);
			int rightHeight=height_Node_recursive(root.right);
			
			return Math.max(leftHeight, rightHeight)+1;
		}
		
		public static boolean isSubtree(Node root, Node subRoot) {
	        if(subRoot==null)
	        return true;
	        
	        ArrayList<Node> ans=new ArrayList<>();
	        
	        findroot(root,subRoot,ans);
	        
	        for(int i=0;i<ans.size();i++)
	        	System.out.println(ans.get(i).data);

	        return true;
	    }
		
		
		public static void findroot(Node root,Node subroot,ArrayList<Node> ans){
	        if(root==null)
	        return;
	        if(root.data==subroot.data) {
	        	ans.add(root);
	        }
	        findroot(root.left,subroot,ans);
	        findroot(root.right,subroot,ans);

	        /*if(root.left==null&&root.right==null)
	        return;
	        if(root.left==null)
	        return root.right;
	        else    
	        return root.left;*/
	    } 
	}
	public static void main(String args[]) {
		int nodes[]= {1,2,4,-1,-1,5,-1,6,-1,7,-1,-1,3,-1,-1};
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		Collections.reverse(arr);
		System.out.println(arr);
		Node root=BinaryTree.buildTree(nodes);
		System.out.println("Root: "+root.data);
		System.out.println("Level Order: ");
		BinaryTree.levelOrder(root);
		BinaryTree.height_Node(root);
		System.out.println("Height: "+BinaryTree.height);
		System.out.println("Height: "+BinaryTree.height_Node_recursive(root));
		Node subRoot=new Node(2);
		subRoot.left=new Node(3);
		subRoot.right=new Node(5);
		BinaryTree.isSubtree(root,subRoot);
	}
}
/*
public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot==null)
        return true;

        TreeNode findRoot=findroot(root,subRoot);
        //System.out.println(findRoot.val);
        if(findRoot==null)
        return false;
        boolean val=cal(findRoot,subRoot);


        return val;
    }
    public static TreeNode findroot(TreeNode root,TreeNode subroot){
        if(root==null)
        return null;
        if(root.val==subroot.val)
        return root;

        TreeNode left=findroot(root.left,subroot);
        TreeNode right=findroot(root.right,subroot);

        if(left==null&&right==null)
        return null;
        if(left==null)
        return right;
        else    
        return left;
    }
    */
