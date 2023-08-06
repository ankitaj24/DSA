package apna_college_binary_tree;

//import apna_college_binary_tree.binary_tree_basic.Node;
/*			1
 * 		   / \
 *        2    3
 *       / \ /  \
 *      4  5 6   7
 */
public class binary_tree_2nd_part {
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
	public static int height(Node root) {
		if(root==null)
			return 0;
		int lh=height(root.left);
		int rh=height(root.right);
		return Math.max(lh, rh)+1;
	}
	
	//to calculate diameter-O(n2)
	public static int diameter2(Node root) {
		if(root==null)
			return 0;
		int leftDiam=diameter2(root.left);
		int rightDiam=diameter2(root.right);
		int lh=height(root.left);
		int rh=height(root.left);
		int selfDiam=lh+rh+1;
		return Math.max(selfDiam,Math.max(rightDiam, leftDiam));
	}
	
	
	//to calculate diameter-O(n)
	static class Info{
		int diam;
		int ht;
		Info(int diam,int ht){
			this.diam=diam;
			this.ht=ht;
		}
	}
	public static Info diameter(Node root) {
		if(root==null)
			return new Info(0,0);
		Info leftInfo=diameter(root.left);
		Info rightInfo=diameter(root.right);
		int diam=Math.max(Math.max(leftInfo.diam, rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
		int ht=Math.max(leftInfo.ht, rightInfo.ht)+1;
		return new Info(diam,ht);
	}
	public static void main(String args[]) {
		Node newNode=new Node(1);
		newNode.left=new Node(2);
		newNode.right=new Node(3);
		newNode.left.left=new Node(4);
		newNode.left.right=new Node(5);
		newNode.right.left=new Node(6);
		newNode.right.right=new Node(7);		
		System.out.println(height(newNode)+" "+diameter(newNode).ht);
		System.out.println(diameter(newNode).diam);
	}
}
