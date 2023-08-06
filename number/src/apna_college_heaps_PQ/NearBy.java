package apna_college_heaps_PQ;
import java.util.*;
public class NearBy {
	static class Pair implements Comparable<Pair>{
		int idx;
		int dist;
		Pair(int idx,int dist){
			this.dist=dist;
			this.idx=idx;
		}
		@Override
		public int compareTo(Pair p2) {
			return this.dist-p2.dist;
		}
		
	}
	public static void main(String args[]) {
		PriorityQueue<Pair> pq=new PriorityQueue<>();
		int arr[][]= {{3,3},{5,-1},{-2,4}};
		for(int i=0;i<arr.length;i++) {
			pq.add(new Pair(i,arr[i][0]*arr[i][0]+arr[i][1]*arr[i][1]));
		}
		int k=2;
		while(k>0) {
			System.out.println("C"+pq.peek().idx);
			pq.remove();
			--k;
		}
	}
}
