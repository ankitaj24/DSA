package linked_list;
public class LinkedList {
		Node head;
		static class Node{
			int data;
			Node next;
			Node(int d)
			{
				data=d;
				next=null;
			}
			
		}
		
		//method to insert the new node
		public static LinkedList insert(LinkedList list,int data)
		{
		
			//create new node with given data
			Node new_node=new Node(data);
			
			//if the linked list is empty,
			//then make the new node as head
			if(list.head==null) {
				list.head=new_node;
			}
			else {
				//else traverse till the last node
				//and insert the new_node there
				Node last=list.head;
				while(last.next!=null) {
					last=last.next;
				}
				
				//insert the new_node at the last node
				last.next=new_node;
			}
			
			//return the list by head
			return list;
		}
		//to print the linkedlist
		public static void printList(LinkedList list)
		{
			Node currNode=list.head;
			System.out.println("LinkedList: ");
			
			//traverse through the linked list
			while(currNode!=null)
			{
				//print data at current node
				System.out.print(currNode.data +" ");
				
				//go to next node
				currNode=currNode.next;
			}
		}
		
		public static void main(String args[]) {
			LinkedList list=new LinkedList();
			
			//INSERTION
			
			list=insert(list,1);
			list=insert(list,2);
			list=insert(list,3);
			list=insert(list,4);
			list=insert(list,5);
			list=insert(list,6);
			list=insert(list,7);
			list=insert(list,8);
			
			//print the linked list
			printList(list);
			
		}
}