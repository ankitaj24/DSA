package apna_college_linked_lists;

//import apna_college_linked_lists.LinkedList.Node;

public class palindrome {
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
	
	
	public Node findMid(Node head) {
		Node slow=head;
		Node fast=head;
		
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	
	public boolean check_palindrome() {
		if(head==null||head.next==null){
			//head=head.next;'
			return true;
		}
		//finding mid
		Node mid=findMid(head);
		
		//reverse of only 2nd part
		Node prev=null;
		Node curr=mid;
		Node next;		
			
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		
		Node right=prev;//right half head
		
		
		//checking the values of the right and left sub-nodes
		Node left=head;
		
		while(right!=null) {
			if(right.data!=left.data)
				return false;
			left=left.next;
			right=right.next;
		}
		return true;
	}
		
		//check left half&right half

		
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
		palindrome ll=new palindrome();
		//ll.print();
		ll.addFirst(1);
		//ll.print();
		ll.addFirst(2);
		//ll.print();
		ll.addFirst(1);
		//ll.print();
		ll.addLast(2);
		//ll.print();
		ll.addLast(1);
		//ll.print();
		//ll.add(2, 9);
		//ll.removeFirst();
		//ll.removeLast();
		ll.print();
		System.out.println(ll.check_palindrome());
	}
}
