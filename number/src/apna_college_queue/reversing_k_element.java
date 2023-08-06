package apna_college_queue;
import java.util.Queue;
import java.util.LinkedList;
import java.util.*;
//10 20 30 40 50 60 70 80 90 100
public class reversing_k_element {
	public static void cal(int k) {
		Scanner ip=new Scanner(System.in);
		Queue<Integer> q=new LinkedList<>();
		Stack<Integer> temp=new Stack<>();
		int n=ip.nextInt();
		while(n>0) {
			q.add(ip.nextInt());
			n--;
		}
		for(int i=1;i<=k;i++) {
			temp.push(q.remove());
		}
		for(int i=1;i<=k;i++) {
			q.add(temp.pop());
		}
		for(int i=k+1;i<=q.size();i++) {
			q.add(q.remove());
		}
		System.out.println(q);
		System.out.println(temp);
		ip.close();
	}
	public static void main(String args[]) {
		//int k=5;
		cal(3);
	}
}
