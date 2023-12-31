package apna_college_binary_tree;

import apna_college_binary_tree.binary_tree_2nd_part.Node;

public class find_subTree {
	public static boolean isIdentical(Node node,Node subroot) {
		if(node==null&&subroot==null)
			return true;
		else if(node==null||subroot==null||node.data!=subroot.data)
			return false;
		if(!isIdentical(node.left,subroot.left))
			return false;
		if(!isIdentical(node.right,subroot.right))
			return false;
		return true;
	}
	public static boolean issubTree(Node root,Node subroot) {
		if(root==null)
			return false;
		if(root.data==subroot.data)
		{
			if(isIdentical(root,subroot))
				return true;			
		}
		return issubTree(root.left,subroot)||issubTree(root.right,subroot);
	}
	public static void main(String args[]) {
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
		root.right.right=new Node(7);	
		//root.right.right.left=new Node(8);
		Node subroot=new Node(3);
		subroot.left=new Node(6);
		subroot.right=new Node(7);
		System.out.println(issubTree(root,subroot));
	}
}
