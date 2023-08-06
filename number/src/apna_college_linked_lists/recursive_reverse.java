package apna_college_linked_lists;


public class recursive_reverse {
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
	
	public Node helper(Node head) {
		if(head==null||head.next==null)
			return head;
		Node newHead=helper(head.next);
		head.next.next=head;
		head.next=null;
		return newHead;
	}
	
	
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
		recursive_reverse ll=new recursive_reverse();
		ll.addFirst(5);
		ll.addFirst(4);
		ll.addFirst(3);
		ll.addFirst(2);
		ll.addFirst(1);
		ll.print();
		ll.head=ll.helper(ll.head);
		ll.print();
		//System.out.println(ll.search(0));
	}
}
