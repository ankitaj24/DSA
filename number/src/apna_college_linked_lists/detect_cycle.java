package apna_college_linked_lists;

public class detect_cycle {
	public static class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public static Node head;
	public static Node tail;
	public static int size=0;
	
	public void addFirst(int data) {
		//create node
		Node newNode=new Node(data);
		if(head==null) {
			head=tail=newNode;
			size++;
			return;
		}
		newNode.next=head;
		head=newNode;
		size++;
		return;
	}
	public boolean isCycle(Node head) {
		Node prev;
		Node slow=head;
		Node fast=head;
		while(fast!=null&&fast.next!=null) {
			prev=slow;
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				if(head==slow)
				System.out.println(prev.data);
				else
				System.out.println(slow.data);
				return true;
			}
		}
		return false;
	}
	
	public void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	public static void main(String args[]) {
		detect_cycle ll=new detect_cycle();
		head=new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		head.next.next.next=head.next;
//		ll.addFirst(5);
//		ll.addFirst(4);
//		ll.addFirst(9);
//		ll.addFirst(2);
//		ll.addFirst(1);
		System.out.println(ll.isCycle(ll.head));
		//ll.print();
	}
}
