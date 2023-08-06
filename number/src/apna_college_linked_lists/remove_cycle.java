package apna_college_linked_lists;

//import apna_college_linked_lists.detect_cycle.Node;

public class remove_cycle {
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
		Node slow=head;
		Node fast=head;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				return true;
			}
		}
		return false;
	}
	
	public void removeCycle() {
		//detect cycle
		Node slow=head;
		Node fast=head;
		boolean flag=false;
		Node prev=null;
		while(fast!=null&&fast.next!=null) {
			prev=slow;
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				flag=true;
				break;
			}
		}
		if(flag!=true)
			return;
		if(slow==head) {
			prev.next=null;
		}
		else {
			slow=head;
			prev=null;
			while(slow!=fast) {
				slow=slow.next;
				prev=fast;
				fast=fast.next;
			}
			
			//remove cycle
			prev.next=null;
		}
	}
	
	public void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	@SuppressWarnings("static-access")
	public static void main(String args[]) {
		remove_cycle ll=new remove_cycle();
		head=new Node(1);
		Node temp=new Node(2);
		head.next=temp;
		head.next.next=new Node(3);
		head.next.next.next=temp;
		System.out.println(ll.isCycle(ll.head));
		ll.removeCycle();
		ll.print();
		System.out.println(ll.isCycle(ll.head));
	}
}
