package apna_college_graph;

import java.util.*;

//import apna_college_graph.creation_bfs_dfs.Edge;

public class Dijkstra {
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
	
	//DFS
	public static void dfs(ArrayList<Edge> graph[],int curr,boolean visited[]) {
		visited[curr]=true;
		System.out.print(curr+" ");
		
		for(int i=0;i<graph[curr].size();i++) {
			Edge e=graph[curr].get(i);
			if(!visited[e.dest])
			dfs(graph,e.dest,visited);
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
	
	public static void dijkstra(ArrayList<Edge> graph[],int src) {
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
			for(int i=0;i<graph[curr.n].size();i++) {
				Edge e=graph[curr.n].get(i);
				int u=e.src;
				int v=e.dest;
				int wt=e.wt;
				if(!vis[e.dest]) {
					if(dist[u]+wt<dist[v]) {
						dist[v]=dist[u]+wt;
					}						
					pq.add(new Pair(e.dest,dist[v]));
					
				}
				
			}
		}
		System.out.println();
		for(int i=0;i<dist.length;i++) {
			System.out.println(src+" "+i+" "+dist[i]);
		}
			
	}
	
	
	
	
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		ArrayList<Edge> graph[]=new ArrayList[6];//array of arraylists
		
		for(int i=0;i<6;i++) {
			graph[i]=new ArrayList<>();
		}
		//null--->new ArrayList
		graph[0].add(new Edge(0,1,2));
		graph[0].add(new Edge(0,2,4));
		
		
		graph[1].add(new Edge(1,2,1));
		graph[1].add(new Edge(1,3,7));
		
		
		graph[2].add(new Edge(2,4,3));
		
		graph[3].add(new Edge(3,5,1));
		
		
		graph[4].add(new Edge(4,3,2));
		graph[4].add(new Edge(4,5,5));
		
		boolean visited[]=new boolean[graph.length];
		dfs(graph,0,visited);
		
		dijkstra(graph,0);
	}
}
