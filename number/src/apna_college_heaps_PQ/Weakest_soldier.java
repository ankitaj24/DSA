package apna_college_heaps_PQ;
import java.util.*;
public class Weakest_soldier {
	static class Soldiers implements Comparable<Soldiers>{
		int idx;
		int strenght;
		Soldiers(int idx,int strength){
			this.idx=idx;
			this.strenght=strength;
		}
		@Override
		public int compareTo(Soldiers o) {
			if((this.strenght-o.strenght)==0)
				return this.idx-o.idx;
			else
				return this.strenght-o.strenght;
		}
		
	}
	public static void main(String args[]) {
		int soldiers[][]= {{1,0,0,0},
						   {1,1,1,1},
						   {1,0,0,0},
						   {1,0,0,0}};
		
		int k=2;//ans row0 and row2
		PriorityQueue<Soldiers> pq=new PriorityQueue<>();
		for(int i=0;i<soldiers.length;i++) {
			int strength=0;
			for(int j=0;j<soldiers[0].length;j++) {
				if(soldiers[i][j]==1)
					strength++;
			}
			pq.add(new Soldiers(i,strength));
		}
		for(int i=1;i<=k;i++) {
			System.out.println("row"+pq.remove().idx);
		}
	}
}
