package apna_college_linked_lists;

import java.util.Scanner;

//import apna_college_linked_lists.LinkedList.Node;

public class deletion_ {
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
	
	void del(Node head,int m,int n) {
		int M=m;
		int N=n;
		Node temp=head;
		Node temp1=temp;
		while(size>0) {
			if(m!=0)
			{
				System.out.print(temp.data+" ");//+"m="+m);
				temp1=temp;
				temp=temp.next;	
				
				m--;
				size--;
			}
			else if(m==0) {
				if(n!=0) {
					n--;
					temp=temp.next;
					
					//System.out.println("size="+size+" "+"m="+m);
					size--;
					if(size==0)
						temp1.next=null;
					continue;
				}
				else
				{
					temp1.next=temp;
					temp1=temp1.next;
					//System.out.println(temp.data+"@@"+temp1.data);//set=temp1;
					
					//temp=set;
					System.out.print(temp1.data+" ");//+"m="+m);
					temp=temp.next;
					m=M-1;
					n=N;
					size--;
				}
			}
		}
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
		deletion_ ll=new deletion_();
		Scanner ip=new Scanner(System.in);
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(4);
		ll.addLast(5);
		ll.addLast(6);
		ll.addLast(7);
		ll.addLast(8);
		ll.addLast(9);
		ll.addLast(10);
		ll.print();
		System.out.println(size);
		System.out.print("M=");
		int m=ip.nextInt();
		System.out.print("N=");
		int n=ip.nextInt();
		ll.del(head,m,n);
		System.out.println();
		ll.print();
		ip.close();
	}
}
