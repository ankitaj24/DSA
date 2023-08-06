package apna_college_linked_lists;

//import apna_college_linked_lists.LinkedList.Node;

public class doubly_ll {
	public static class Node{
		int data;
		Node next;
		Node prev;
		public Node(int data) {
			this.data=data;
			this.next=null;
			this.prev=null;
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
		head.prev=newNode;
		newNode.prev=null;
		
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
		newNode.prev=tail;
		tail.next=newNode;
		
		//step3: tail ko newnode par lao		
		tail=newNode;
	}
	
	
	
	//remove of first node
	public int removeFirst() {
		//value to be deleted
		if(size==0)
		{
			System.out.println("Linkedlist is empty");
			return Integer.MIN_VALUE;
		}else if(size==1) {
			int val=head.data;
			head=tail=null;
			size--;
			return val;
		}
		int val=head.data;
		head=head.next;
		head.prev=null;
		size--;
		return val;
	}
	
	//remove of last node
	public int removeLast() {
		if(size==0)
		{
			System.out.println("Linkedlist is empty");
			return Integer.MIN_VALUE;
		}else if(size==1) {
			int val=tail.data;
			head=tail=null;
			size--;
			return val;
		}
		int val=tail.data;
		tail=tail.prev;
		tail.next=null;
		
		return val;
	}	
		
	
	//printing
	public void print() {
		if(head==null) {
			System.out.println("Linkedlist is empty");
			return;
		}
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"<->");
			temp=temp.next;
		}
		System.out.print("null"+"<->");
		temp=tail;
		while(temp!=null) {
			System.out.print(temp.data+"<->");
			temp=temp.prev;
		}
		System.out.println("null");
	}
	public static void main(String args[]) {
		doubly_ll ll=new doubly_ll();
		//ll.print();
		ll.addFirst(3);
		//ll.print();
		ll.addFirst(2);
		//ll.print();
		ll.addFirst(1);
		//ll.print();
		ll.addLast(4);
		//ll.removeLast();
		//ll.print();
		ll.addLast(5);
		//ll.print();
		//ll.add(2, 9);
		ll.removeFirst();
		ll.removeLast();
		ll.print();
		System.out.println("SIZE: "+size);
	}
}
