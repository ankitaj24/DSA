package apna_college_linked_lists;

//import apna_college_linked_lists.LinkedList.Node;

public class merge_sort {
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
	public Node mergesort(Node head) {
		//base case
		if(head==null||head.next==null)
			return head;
		
		//find mid
		Node mid=mid(head);
		
		//left and right calling mergesort
		Node rightHead=mid.next;
	    mid.next=null;
	    Node newLeft=mergesort(head);
	    Node newRight=mergesort(rightHead);
		
		//merge
	    return merge(newLeft,newRight);
	}
	
	public Node merge(Node head1,Node head2) {
		Node mergedLL=new Node(-1);
		Node temp=mergedLL;
		while(head1!=null&&head2!=null) {
			if(head1.data<=head2.data) {
				temp.next=head1;
				temp=temp.next;
				head1=head1.next;
			}else {
				temp.next=head2;
				temp=temp.next;
				head2=head2.next;
			}
		}
		while(head1!=null) {
			temp.next=head1;
			temp=temp.next;
			head1=head1.next;
		}
		while(head2!=null) {
			temp.next=head2;
			temp=temp.next;
			head2=head2.next;
		}
		return mergedLL.next;
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
		merge_sort ll=new merge_sort();
		ll.addFirst(1);
		ll.addFirst(2);
		ll.addFirst(3);
		ll.addFirst(4);
		ll.addFirst(5);
		//5->4->3->2->1
		ll.print();
		ll.head=ll.mergesort(ll.head);
		ll.print();
		System.out.println("SIZE: "+size);
	}

	
}
