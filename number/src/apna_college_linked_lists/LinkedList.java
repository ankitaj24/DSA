package apna_college_linked_lists;
//import java.util.*;
public class LinkedList {
	
	//************CREATION OF NODE********************
	
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
	
	
	//************ADDITION OD NODE*****************
	
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
	
	
	//add element in the middle
	public void add(int index,int data) {
		if(index==0)
		{
			addFirst(data);
			return;
		}
		Node newNode=new Node(data);
		size++;
		Node temp=head;
		int i=0;
		while(i<index-1) {
			temp=temp.next;
			i++;
		}
	    //i=index-1 i.e. temp->previous
		newNode.next=temp.next;
		temp.next=newNode;
	}
	
	
	//***********REMOVAL OF NODES**************
	
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
		int i=0;
		Node temp=head;
		while(i<size-2) {
			temp=temp.next;
			i++;
		}
		int val=temp.next.data;//(tail.data)
		temp.next=null;
		tail=temp;
		size--;
		return val;
	}
	
		
	
	//************PRINTING OF LINKEDLIST**********
		
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
		LinkedList ll=new LinkedList();
		//ll.print();
		ll.addFirst(3);
		//ll.print();
		ll.addFirst(2);
		//ll.print();
		ll.addFirst(1);
		//ll.print();
		ll.addLast(4);
		//ll.print();
		ll.addLast(5);
		//ll.print();
		//ll.add(2, 9);
		//ll.removeFirst();
		ll.removeLast();
		ll.print();
		System.out.println("SIZE: "+size);
	}
}

