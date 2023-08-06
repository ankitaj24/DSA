package apna_college_heaps_PQ;
import java.util.*;
public class Connect_n_ropes {
	static class Cost implements Comparable<Cost>{
		int min;
		Cost(int min){
			this.min=min;
		}		
		@Override
		public int compareTo(Cost c2) {
			return this.min-c2.min;
		}
	}
	public static void main(String args[]) {
		int ropes[]= {4,3,2,6};
		PriorityQueue<Cost> pq=new PriorityQueue<>();
		for(int i=0;i<ropes.length;i++) {
			pq.add(new Cost(ropes[i]));
		}
		int sum=0;
		while(pq.size()>1) {
			int min1=pq.remove().min;
			int min2=pq.remove().min;
			sum+=min1+min2;
			pq.add(new Cost(min1+min2));
		}
		System.out.print(sum);
	}
}
