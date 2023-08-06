package apna_college_queue;
import java.util.*;
public class connect_n_ropes_minimum_cost {
	public static void cal(int cost[]) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();//default:use as min heap 
		if(cost.length==1) {
			System.out.println(cost[0]);
			return;
		}else if(cost.length==2) {
			System.out.println(cost[0]+cost[1]);
			return;
		}
		for(int i=0;i<cost.length;i++)
			pq.add(cost[i]);
		int sum=0;
		while(pq.size()>=2) {
			int min1=pq.poll();//remove function for removing smallest element
			int min2=pq.poll();//remove function for removing second smallest element
			sum=sum+(min1+min2);
			pq.add(min1+min2);
		}
		System.out.println("Sum="+sum);
		
	}
	public static void main(String arg[]) {
		int cost[]= {4,3,2,6};
		cal(cost);
	}
}
