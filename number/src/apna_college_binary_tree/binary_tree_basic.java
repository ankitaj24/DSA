package apna_college_binary_tree;
import java.util.*;
/*			1
 * 		   / \
 *        2   3
 *       / \   \
 *      4   5   6
 */
public class binary_tree_basic {
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
	static class BinaryTree{
		static int idx=-1;
		public static Node buildTree(int nodes[]) {
			idx++;
			if(nodes[idx]==-1) {
				return null;
			}
			
			Node newNode=new Node(nodes[idx]);
			newNode.left=buildTree(nodes);
			newNode.right=buildTree(nodes);
			return newNode;
		}
		
		
		//preorder
		public static void preorder(Node root) {
			if(root==null)
				return;
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
		
		//inorder
		public static void inorder(Node root) {
			if(root==null)
				return;
			inorder(root.left);
			System.out.print(root.data+" ");
			inorder(root.right);
		}
		
		//postorder
		public static void postorder(Node root) {
			if(root==null)
				return;
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+" ");
		}
		
		//levelorder
		public static void levelorder(Node root) {
			if(root==null)
				return;
			Queue<Node> q=new LinkedList<>();
			q.add(root);
			q.add(null);
			while(!q.isEmpty()) {
				Node del=q.remove();
				if(del==null) {
					System.out.println();
					if(!q.isEmpty())
						q.add(null);
					else
						break;
				}
				else {
					System.out.print(del.data+" ");
					if(del.left!=null) {
						q.add(del.left);
					}
					if(del.right!=null) {
						q.add(del.right);
					}
				}
			}			
		}
		
		
		//height(based on nodes)
		public static int height(Node root) {
			if(root==null)
				return 0;
			int lh=height(root.left);
			int rh=height(root.right);
			return Math.max(lh, rh)+1;
		}
		
		
		//count of nodes
		public static int count_nodes(Node root) {
			if(root==null)
				return 0;
			int lh=count_nodes(root.left);
			int rh=count_nodes(root.right);
			return lh+rh+1;
		}
		
		//sum of nodes
		public static int sum(Node root) {
			if(root==null)
				return 0;
			int left_sum=sum(root.left);
			int right_sum=sum(root.right);
			return left_sum+right_sum+root.data;
		}
	}
	public static void main(String args[]) {
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree=new BinaryTree();
		Node root=tree.buildTree(nodes);
		System.out.println("Root: "+root.data);
		System.out.println("****PRE ORDER****");
		tree.preorder(root);
		System.out.println("\n****IN ORDER****");
		tree.inorder(root);
		System.out.println("\n****POST ORDER****");
		BinaryTree.postorder(root);//class.function name
		System.out.println("\n****LEVEL ORDER****");
		tree.levelorder(root);
		System.out.println("Height: "+tree.height(root));
		System.out.println("No of nodes: "+tree.count_nodes(root));
		System.out.println("Sum of nodes: "+tree.sum(root));
	}
}
