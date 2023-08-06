package number;
/*
 * 19
1 2 2 3 3 3 4 4 5 5 5 5 6 6 6 7 8 9 10
 */

import java.util.*;
import java.util.*;
public class test {
	class Pair implements Comparable<Pair>{
		int key;
		int val;
		public Pair(int key,int val){
			this.key=key;
			this.val=val;
		}
		
		@Override
		public int compareTo(Pair o) {
			return o.val-this.val;
		}		
	}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(int i:map.keySet()) {
        	new Pair(i,map.get(i));
        }
        //System.out.println(pq);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
