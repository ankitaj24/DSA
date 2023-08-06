package apna_college_linked_lists;



public class remove_node_from_end {
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
	
	public void remove(int n) {
		//calculate of size
		int sz=0;
		Node temp=head;
		//int i=0;
		while(temp!=null) {
			temp=temp.next;
			sz++;
		}
		if(n==sz) {
			head=head.next;//remove first operation
		}
		System.out.println("sz="+sz);
		int i=1;
		int iTofind=size-n;
		Node prev=head;
		while(i<iTofind) {
			prev=prev.next;
			i++;
		}
		prev.next=prev.next.next;
		return;
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
		remove_node_from_end ll=new remove_node_from_end();
		ll.addFirst(5);
		ll.addFirst(4);
		ll.addFirst(3);
		ll.addFirst(2);
		ll.addFirst(1);
		
		ll.print();
		ll.remove(3);
		ll.print();
		//System.out.println(ll.search(0));
	}
}
