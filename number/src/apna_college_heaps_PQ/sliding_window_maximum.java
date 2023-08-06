package apna_college_heaps_PQ;
import java.util.*;
public class sliding_window_maximum {
	static class Max implements Comparable<Max>{
		int num;
		int idx;
		Max(int num,int idx){
			this.num=num;
			this.idx=idx;
		}
		@Override
		public int compareTo(Max o) {
			return o.num-this.num;
		}
		
	}
	public static void main(String args[]) {
		int arr[]= {1,3,-1,3,5,3,6,7};
		int k=3;
		int result[]=new int[arr.length-k+1];
		PriorityQueue<Max> pq=new PriorityQueue<>();
		pq.add(new Max(arr[0],0));
		pq.add(new Max(arr[1],1));
		pq.add(new Max(arr[2],2));
		result[0]=pq.peek().num;				
		for(int i=3;i<arr.length;i++) {
			while(pq.size()>0 && pq.peek().idx <= (i-k)) {
				pq.remove();
			}
			pq.add(new Max(arr[i],i));
			result[i-k+1]=pq.peek().num;
		}
		for(int i=0;i<result.length;i++)
			System.out.print(result[i]+" ");
	}
}
