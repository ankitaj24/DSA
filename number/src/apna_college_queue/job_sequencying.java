package apna_college_queue;
import java.util.*;
public class job_sequencying {
	public static void cal(char job_id[],int deadline[],int profit[]) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<profit.length;i++)
			pq.add(profit[i]);
	}
	public static void main(String args[]) {
		char job_id[]= {'a','b','c','d'};
		int deadline[]= {4,1,1,1};
		int profit[]= {20,10,40,30};
		cal(job_id,deadline,profit);
	
	}
}


