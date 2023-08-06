package apna_college_graph;

import java.util.*;


public class min_depth {
	static class Edge{
		int src;
		int dest;
		int wt;
		Edge(int src,int dest,int wt){
			this.src=src;
			this.dest=dest;
			this.wt=wt;
		}
	}
	
	static class Pair implements Comparable<Pair>{
		int n;
		int path;
		Pair(int n,int path){
			this.n=n;
			this.path=path;
		}
		@Override
		public int compareTo(Pair p2) {
			return this.path-p2.path;
		}
	}
	public static void dijkstra(ArrayList<Edge> graph[],int src,HashMap<Integer,Integer> leaf) {
		int dist[]=new int[graph.length];
		boolean vis[]=new boolean[graph.length];
		for(int i=0;i<dist.length;i++) {
			if(i!=src)
				dist[i]=Integer.MAX_VALUE;
		}
		PriorityQueue<Pair> pq=new PriorityQueue<>();
		pq.add(new Pair(src,0));
		
		while(!pq.isEmpty()) {
			Pair curr=pq.poll();
			vis[curr.n]=true;
			if(graph[curr.n].size()==0) {
					leaf.put(curr.n, dist[curr.n]);
			}
			for(int i=0;i<graph[curr.n].size();i++) {
				Edge e=graph[curr.n].get(i);
				if(!vis[e.dest]) {
					if(dist[curr.n]+e.wt<dist[e.dest]) {
						dist[e.dest]=dist[curr.n]+e.wt;
					}
					pq.add(new Pair(e.dest,dist[e.dest]));	
				}
			}			
		}		
	}
	
	
	public static void main(String args[]) {
		int noOfVertex=8;
		@SuppressWarnings("unchecked")
		ArrayList<Edge> graph[]=new ArrayList[noOfVertex];//array of arraylists
		HashMap<Integer,Integer> leaf=new HashMap<>();
		
		for(int i=0;i<noOfVertex;i++) {
			graph[i]=new ArrayList<>();
		}
		
		graph[0].add(new Edge(0,1,1));
		graph[0].add(new Edge(0,2,1));
		
		graph[1].add(new Edge(1,3,1));
		
		graph[2].add(new Edge(2,4,1));
		
		graph[3].add(new Edge(3,5,1));
		
		graph[4].add(new Edge(4,5,1));
		graph[4].add(new Edge(4,7,1));
		
		graph[5].add(new Edge(5,6,1));
		
		dijkstra(graph,0,leaf);
				
		System.out.println(leaf);
		
		int min=Integer.MAX_VALUE;
		int key=-1;
		for(int i:leaf.keySet()) {
			int val=leaf.get(i);
			if(val<min) {
				min=val;
				key=i;
			}
		}
		System.out.println(key+" "+min);
	}
}
