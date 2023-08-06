package linkedList;

public class reverse {
	public class ListNode {		
		int val;
	    ListNode next;
	    ListNode() {}
	    ListNode(int val) { 
	    	this.val = val; 
    	}
	    ListNode(int val, ListNode next) {
	    	this.val = val; this.next = next; 
    	}
	    
	}
	public ListNode reverse_(ListNode head) {
		ListNode prev=null;
		ListNode curr=head;
		ListNode temp;
		while(curr!=null) {
			temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		return prev;
	}
	public void print(ListNode head) {
		ListNode temp=head;
		while(temp!=null) {
			System.out.print(temp.val+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	public static void main(String args[]) {
		reverse ob=new reverse();
		ListNode ll=ob.new ListNode(1);
		ll.next=ob.new ListNode(2); 
		ll.next.next=ob.new ListNode(3);
		ll.next.next.next=ob.new ListNode(4);
		ll.next.next.next.next=ob.new ListNode(5);
		ob.print(ll);
		ll=ob.reverse_(ll);
		ob.print(ll);
	}
}
