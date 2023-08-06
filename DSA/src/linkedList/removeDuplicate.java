package linkedList;
import java.util.*;

//import linkedList.reverse.ListNode;
public class removeDuplicate {
	class Node
	{
	    int data;
	    Node next;
	    Node(int d) {
	        data = d; 
	        next = null;
	    }
	}
	    //Function to remove duplicates from unsorted linked list.	
	
    public Node removeDuplicates(Node head) 
    {
         HashMap<Integer,Integer> map=new HashMap<>();
         Node temp=head;
         Node prev=null;
         Node check=null;
         while(temp!=null){
             if(map.containsKey(temp.data)){
                 check=temp;
             }
             else{
                 map.put(temp.data,0);
                 if(check!=null) {                	 
                	 prev.next=temp;
                	 check=null;
                 }
                 prev=temp;
             }
             
             temp=temp.next;
         }
         if(check!=null) {
        	 prev.next=null;
         }
         return head;
    }
    public void print(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}
    public static void main(String args[]) {
		removeDuplicate ob=new removeDuplicate();
		Node ll=ob.new Node(2);
		ll.next=ob.new Node(2); 
		ll.next.next=ob.new Node(2);
		//ll.next.next.next=ob.new Node(4);
		//ll.next.next.next.next=ob.new Node(5);
		ob.print(ll);
		ll=ob.removeDuplicates(ll);
		ob.print(ll);
	}
	
}
