package apna_college_stacks;

import apna_college_linked_lists.LinkedList.Node;
import java.util.Stack;
public class palindrome_ll {
	public static class Node{
		char data;
		Node next;
		Node(char data){
			this.data=data;
			this.next=null;
		}
	}
	public static Node head;
	public static Node tail;
	public static int size;
	
	//adding element at last
	public void addLast(char data) {
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
	public boolean palindrome(Node head) {
		Node temp=head;
		Stack<Character> s=new Stack<>();
		while(temp!=null) {
			s.push(temp.data);
			temp=temp.next;
		}
		temp=head;
		while(temp!=null) {
			char ch=s.pop();
			if(temp.data!=ch)
				return false;
			temp=temp.next;
		}
		System.out.println(s);
		return true;
	}
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
		palindrome_ll ll=new palindrome_ll();
		ll.addLast('a');
		ll.addLast('b');
		ll.addLast('c');
		//ll.addLast('d');
		ll.addLast('b');
		ll.addLast('a');
		ll.print();
		System.out.println(ll.palindrome(head));
	}
}
