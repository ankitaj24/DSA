package greedy;
import java.util.*;
public class activity_selection {
	static class Pair implements Comparable<Pair>{
		int st;
		int nd;
		Pair(int st,int nd){
			this.st=st;
			this.nd=nd;
		}
		@Override
		public int compareTo(Pair p2) {
			if(p2.nd==this.nd)
				return this.st-p2.st;
			else {
				return this.nd-p2.nd;
			}
		}
	}
    public static void activitySelection(int start[], int end[], int n)
    {
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++) {
        	pq.add(new Pair(start[i],end[i]));
        }
        int count=1;
        int nd=pq.peek().nd;
        while(!pq.isEmpty()) {
        	System.out.println(pq.peek().st+" "+pq.peek().nd);
        	pq.remove();
        	if(!pq.isEmpty()&&pq.peek().st>nd) {
        		nd=pq.peek().nd;
        		count++;
        	}
        }
        System.out.println(count);
    }
    public static void main(String args[]) {
    	//activity_selection ob=new activity_selection();
    	int start[]={1,2,2,5};
    	int end[]={2,4,2,6};
    	activitySelection(start,end , 4);
    }
}
/*
 * class Pair {
    int first;
    int second;
    Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}

class SortPair implements Comparator<Pair>{

    @Override
    public int compare(Pair a, Pair b) {
        if (a.second<b.second) {
            return -1;
        } else if (a.second > b.second) {
            return 1;
        } else {
            if (a.first<b.first) {
                return -1;
            } else if (a.first > b.first) {
                return 1;
            }
        }
        return 0;
    }

}
private static ArrayList<Pair> sortArray(int[] start, int[] end, int n) {
        ArrayList<Pair> pairs = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            pairs.add(new Pair(start[i], end[i]));
        }
        
        Collections.sort(pairs, new SortPair());
        
        return pairs;
   }
*/
