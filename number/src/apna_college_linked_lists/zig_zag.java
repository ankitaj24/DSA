package apna_college_linked_lists;

import apna_college_linked_lists.merge_sort.Node;

public class zig_zag {
	public static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public static Node head;
	public static Node tail;
	public static int size;
	
	//adding element at first
	public void addFirst(int data) {
		//step 1: create new node
		Node newNode=new Node(data);
		size++;
		if(head==null) {
			head=tail=newNode;
			return;
		}		
		
		//step2: newNode next=head		
		newNode.next=head;
		
		//step3: head ko newnode par lao		
		head=newNode;
	}
	//adding element at last
	public void addLast(int data) {
		//step 1: create new node
		Node newNode=new Node(data);
		size++;
		if(head==null) {
			head=tail=newNode;
			return;
		}		
		
		//step2: tail next=newNode		
		tail.next=newNode;
		
		//step3: tail ko newnode par lao		
		tail=newNode;
	}
	
	//finding mid
	public Node mid(Node head) {
		Node slow=head;
		Node fast=head.next;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	
	//merge sort
	public void zigzag(Node head) {
		//base case
		if(head==null||head.next==null)
			return;
		
		//find mid
		Node mid=mid(head);
		
		//left and right calling mergesort
		Node head2=mid.next;
	    mid.next=null;
	    
	    //reverse the 2nd array
	    Node curr=head2;
	    Node prev=null;
	    Node next=null;
	    while(curr!=null) {
	    	next=curr.next;
	    	curr.next=prev;
	    	prev=curr;
	    	curr=next;
	    }
	    head2=prev;
	    Node head1=head;
	    Node left;
		Node right;
		while(head1!=null&&head2!=null) {
			left=head1.next;
			right=head2.next;
			head1.next=head2;
			head2.next=left;
			
			head1=left;
			head2=right;
			
		}
	}
	
	//printing linkedlist
	public void print() {
		if(head==null) {
			System.out.println("Linkedlist is empty");
			return;
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	
	
	public static void main(String args[]) {
		zig_zag ll=new zig_zag();
		ll.addFirst(6);
		ll.addFirst(5);
		ll.addFirst(4);
		ll.addFirst(3);
		ll.addFirst(2);
		ll.addFirst(1);
		//5->4->3->2->1
		ll.print();
		ll.zigzag(ll.head);
		ll.print();
		System.out.println("SIZE: "+size);
	}
}
