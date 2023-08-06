package apna_college_linked_lists;
import java.util.LinkedList;
import java.util.Scanner;
public class Deletion {
	
	void del(LinkedList<Integer> ll,int m,int n) {
		int M=m;
		int N=n;
		for(int i=0;i<ll.size();i++) {
			if(m!=0)
			{
				System.out.print(ll.get(i)+"->");
				m--;
			}
			else if(m==0) {
				if(n!=0) {
					n--;
					continue;
				}
				else
				{
					System.out.print(ll.get(i)+"->");
					m=M-1;
					n=N;
				}
			}
			
		}
		System.out.println("null");
	}
	
	
	public static void main(String args[]) {
		LinkedList<Integer> ll=new LinkedList<>();
		Deletion ob=new Deletion();
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
		System.out.println(ll);
		System.out.print("M=");
		int m=ip.nextInt();
		System.out.print("N=");
		int n=ip.nextInt();
		ob.del(ll,m,n);
		ip.close();
	}
}
