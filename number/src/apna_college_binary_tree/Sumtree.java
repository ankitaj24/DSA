package apna_college_binary_tree;

public class Sumtree {
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
	public static int sumTree(Node root) {
		if(root==null)
			return 0;
		int leftsum=sumTree(root.left);//return the value overridden of left subtrees
		int rightsum=sumTree(root.right);//return the value overridden of right subtrees
		int data=root.data;//value to be overridden
		int newLeft=root.left==null?0:root.left.data;
		int newRight=root.right==null?0:root.right.data;
		root.data=leftsum+newLeft+rightsum+newRight;
		return data;//returning the value i.e. overridden
		
	}
	public static void preorder(Node root) {
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public static void main(String args[]) {
		/*			1
		 * 		   / \
		 *        2   3
		 *       / \   \
		 *      4   5   6
		 *      */
		 Node newNode=new Node(1);
		newNode.left=new Node(2);
		newNode.right=new Node(3);
		newNode.left.left=new Node(4);
		newNode.left.right=new Node(5);
		newNode.right.left=new Node(6);
		newNode.right.right=new Node(7);
		sumTree(newNode);
		preorder(newNode);
	}
}
