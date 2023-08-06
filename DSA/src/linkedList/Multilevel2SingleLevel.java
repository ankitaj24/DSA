package linkedList;

public class Multilevel2SingleLevel {
	static class Node {
	    public int data;
	    public Node prev;
	    public Node next;
	    public Node child;
	    Node(int data){
	    	this.data=data;
	    	this.prev=null;
	    	this.next=null;
	    	this.child=null;
	    }
	}
}
