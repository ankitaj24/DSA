package apna_college_graph;

import java.util.*;



public class OliverGame {
	
	public static boolean away(int start,ArrayList<ArrayList<Integer>> adj,int king,int target) {
		int v=adj.size();
		boolean vis[]=new boolean[v];
		Queue<Integer> q=new LinkedList<>();
		
		if(start==target)
			return true;
		
		q.add(start);
		
		while(!q.isEmpty()) {			
			int curr=q.remove();
			if(!vis[curr]) {
				vis[curr]=true;
				for(int i=0;i<adj.get(curr).size();i++) {
					int dest=adj.get(curr).get(i);
					if(dest==target)
						return true;
					if(dest>curr) {
						q.add(dest);
					}
				}
			}
		}
		return false;
	}
	
	public static boolean towards(int start,ArrayList<ArrayList<Integer>> adj,int king,int target) {
		int v=adj.size();
		boolean vis[]=new boolean[v];
		Queue<Integer> q=new LinkedList<>();
		
		if(start==target)
			return true;
		
		q.add(start);
		
		while(!q.isEmpty()) {			
			int curr=q.remove();
			if(curr==king&&king!=target)
				return false;
			if(!vis[curr]) {
				vis[curr]=true;
				for(int i=0;i<adj.get(curr).size();i++) {
					int dest=adj.get(curr).get(i);
					if(dest==target)
						return true;
					if(dest<curr) {
						q.add(dest);
					}
				}
			}
		}
		return false;
	}
	
	
	
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
		int n;
		System.out.println("Enter n: ");
		n=ip.nextInt();
		ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
		for(int i=0;i<n;i++) {
			adj.add(new ArrayList<Integer>());			
		}
		for(int i=0;i<n-1;i++) {
			int u=ip.nextInt()-1;
			int v=ip.nextInt()-1;
			adj.get(u).add(v);
			adj.get(v).add(u);
		}
		int q=ip.nextInt();
		int query[][]=new int[q][3];
		for(int i=0;i<q;i++) {
			query[i][0]=ip.nextInt();
			query[i][1]=ip.nextInt()-1;
			query[i][2]=ip.nextInt()-1;
		}
		for(int i=0;i<q;i++) {
			if(query[i][0]==0)
				System.out.println(towards(query[i][2],adj,0,query[i][1]));
			else
				System.out.println(away(query[i][2],adj,0,query[i][1]));
		}
		ip.close();
	}
}
