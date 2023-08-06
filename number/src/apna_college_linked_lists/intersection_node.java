package apna_college_linked_lists;

//import apna_college_linked_lists.LinkedList.Node;

public class intersection_node {
	public static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	
	public Node check(Node head1,Node head2) {
		Node temp=head1;
		Node temp2=head2;
		while(temp!=null) {
			//Node temp2=head2.next;
			while(temp2!=null) {
				if(temp.data==temp2.data)
					return temp;
				temp2=temp2.next;
			}
			temp=temp.next;
			temp2=head2;
		}
		return null;
	}
	
	
	public void print(Node head) {
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
		intersection_node ll=new intersection_node();
		
		Node head1,head2;
		head1=new Node(3);
		head1.next=new Node(6);
		head1.next.next=new Node(9);
		head1.next.next.next=new Node(15);
		head1.next.next.next.next=new Node(30);
		
		head2=new Node(10);
		head2.next=new Node(15);
		head2.next.next=new Node(30);
		
//		head1=new Node(1);
//		head2=new Node(4);
//
//		Node newNode =new Node(2);
//		head1.next=newNode;
//		
//		newNode =new Node(5);
//		head2.next=newNode;
//		
//		newNode =new Node(3);
//		head1.next.next=newNode;
//		newNode =new Node(6);
//		head1.next.next.next=newNode;
//		head2.next.next=newNode;
//		
//		newNode =new Node(7);
//		head2.next.next.next=newNode;
//		
//		head2.next.next.next.next=null;
		
		
		
//		head1=new Node(10);
//		head2=new Node(3);
//		
//		Node newNode =new Node(6);
//		head2.next=newNode;
//		
//		newNode=new Node(9);
//		head2.next.next=newNode;
//		
//		newNode=new Node(15);
//		head1.next=newNode;
//		head2.next.next.next=newNode;
//		
//		newNode=new Node(30);
//		head1.next.next=newNode;
//		
//		head1.next.next.next=null;
		ll.print(head1);
		ll.print(head2);
		Node val=ll.check(head1,head2);
		System.out.println(val.data);
	}
}
