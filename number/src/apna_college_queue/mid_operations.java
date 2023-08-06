package apna_college_queue;
import java.util.*;
public class mid_operations {
	public static void main(String args[]) {
		Stack<Integer> s=new Stack<>();
		Deque<Integer> q=new LinkedList<>();
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		for(int i=1;i<=n;i++) {
			s.push(ip.nextInt());
		}
		int idx=-1;
		if(n%2!=0)
		idx=(n+1)/2;//odd number
		else
		idx=n/2;//even number
		while(n>idx&&!s.isEmpty()) {
			q.add(s.pop());
			n--;
		}
		if(!s.isEmpty())
		s.pop();
		while(!q.isEmpty()) {
			s.push(q.removeLast());
		}
		System.out.println(s);
		ip.close();
	}
}
