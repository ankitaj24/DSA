 package apna_college_linked_lists;
//import java.util.LinkedList;

//import apna_college_linked_lists.LinkedList.Node;

//import apna_college_linked_lists.LinkedList.Node;

public class swap {
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
	
	//swap
	public void swap(int x,int y) {
		if(x>y) {
			int pxo=x;
			x=y;
			y=pxo;
		}
		Node px=head;
		Node prevx=null;
		while(px!=null&&px.data!=x) {
			prevx=px;
			px=px.next;
		}
		Node py=head;
		Node prevy=null;
		while(py!=null&&py.data!=y) {
			prevy=py;
			py=py.next;
		}
		
		if(py==null||px==null)
			return;
		
		if(prevx!=null)
			prevx.next=py;
		else
			head=py;

		if(prevy!=null)
			prevy.next=px;
		else
			head=px;
		
		
		Node temp=py.next;
		py.next=px.next;
		prevy.next=px;
		px.next=temp;
	}
	
	public void print() {
		if(head==null) {
			System.out.println("Linkedlist is empty");
			return;
		}
		Node px=head;
		while(px!=null) {
			System.out.print(px.data+"->");
			px=px.next;
		}
		System.out.println("null");
	}
	
	public static void main(String args[]) {
		swap ll=new swap();
		ll.addFirst(4);
		ll.addFirst(3);
		ll.addFirst(2);
		ll.addFirst(1);
		ll.print();
		ll.swap(4,3);
		ll.print();
		
	}
}






/*System.out.println(i+" "+px.data);
			if(i==x-1) {
				px1=px;
				System.out.println(px1.data+"*");
				swap=px1.next;
				System.out.println(swap.data+"s*");
			}
			if(i==y-1) {
				px2=px;
				System.out.println(px2.data+"**");
				px1.next=px2.next;
				px2.next=swap;
				px1.next.next=px2;
				System.out.println(swap.data+"***"+swap.next.data);
				System.out.println(px1.data+"***"+px1.next.data);
				System.out.println(px2.data+"***"+px2.next.data);
				if(y==size) {
					tail=px2.next;
					tail.next=null;
				}
				if(x==1) {
					
				}
				return;
				//break;
				
			}
//			if(i==1)
//			{
//				i++;
//				continue;
//			}
			px=px.next;
			i++;
			*/
