package number;
import java.util.*;
class Solution {
	    /*static class Pair implements Comparable<Pair>{
	        int key;
	        int count;
	        Pair(int key, int count){
	            this.key=key;
	            this.count=count;
	        }
	        public int compareTo(Pair p2){
	        	
	            return p2.key-this.key;
	        }
	    }
	   public static int[] kLargest(int[] arr, int n, int k) {
	        HashMap<Integer,Integer> map=new HashMap<>();
	        for(int i=0;i<arr.length;i++){
	            int num=arr[i];
	            map.put(num,map.getOrDefault(num,0)+1);            
	        }
	        PriorityQueue<Pair> pq=new PriorityQueue<>();
	        for(int i:map.keySet()){
	            pq.add(new Pair(i,map.get(i)));
	        }
	        int ans[]=new int[k];int i=0;
	        while(!pq.isEmpty()) {
	        	Pair p=pq.poll();
	        	ans[i]=p.key;
	        	i++;
	        	if(i==k)
	        		break;
	        }
	        for(i=0;i<k;i++)
	        	System.out.println(ans[i]+" ");
	        if(i==0)
	        return null;
	        return ans;
	    }*/
	static long minCost(long arr[], int n) 
    {
        long cost=0;
        PriorityQueue<Long> pq=new PriorityQueue<>();
        if(n==0)
        return 0;
        if(n==1)
        return arr[0];
        
        for(int i=0;i<arr.length;i++)
        pq.add(arr[i]);
        
        long num=0,num1=0;
        while(pq.size()>=2) {
        	num=pq.remove();
        	num1=pq.remove();
        	cost+=num+num1;
        	System.out.println("Num: "+num+" "+num1);
        	System.out.println("Sum: "+(num+num1));
        	pq.add(num1+num);
        }
        System.out.println(pq);
        return cost;
    }
	
	
    public static void main(String args[]) {
    	//int arr[]= {4,1,-1,2,-1,2,3};
    	//kLargest(arr,7,4);
    	long arr[]= {25,99,78,104};
    	int n=4;
    	System.out.println("Cost: "+minCost(arr,4));
    }
}


