package apna_college_linked_lists;

public class iterative_search {
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
	
	//iterative search
	public boolean search(int data) {
		if(size==0) {
			return false;
		}
		Node temp=head;
		while(temp!=null) {
			if(temp.data==data)
				return true;
			temp=temp.next;
		}
		return false;
	}
	
	//print
	public void print() {
		if(size==0) {
			System.out.println("EMPTY");
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
		iterative_search ll=new iterative_search();
		ll.addFirst(5);
		ll.addFirst(4);
		ll.addFirst(3);
		ll.addFirst(2);
		ll.addFirst(1);
		ll.print();
		System.out.println(ll.search(0));
	}
}
