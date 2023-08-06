package apna_college_graph;

import java.util.*;

public class PrimsAlgo {
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
		int vertex;
		int cost;
		Pair(int vertex,int cost){
			this.vertex=vertex;
			this.cost=cost;
		}
		@Override
		public int compareTo(Pair p2) {
			return this.cost-p2.cost;
		}
	}
	
	
	public static void prims(ArrayList<Edge> graph[]) {
		boolean vis[]=new boolean[graph.length];
		PriorityQueue<Pair> pq=new PriorityQueue<>();
		pq.add(new Pair(0,0));
		
		int finalMinCost=0;
		
		while(!pq.isEmpty()) {
			Pair curr=pq.poll();
			if(!vis[curr.vertex]) {
				vis[curr.vertex]=true;
				finalMinCost+=curr.cost;				
				for(int i=0;i<graph[curr.vertex].size();i++) {
					Edge e=graph[curr.vertex].get(i);
					pq.add(new Pair(e.dest,e.wt));
				}
			}
		}
		System.out.println(finalMinCost);
	}
	
	
	public static void main(String args[]) {
		int noOfVertex=4;
		@SuppressWarnings("unchecked")
		ArrayList<Edge> graph[]=new ArrayList[noOfVertex];//array of arraylists
		
		for(int i=0;i<noOfVertex;i++) {
			graph[i]=new ArrayList<>();
		}
		//null--->new ArrayList
		graph[0].add(new Edge(0,1,10));
		graph[0].add(new Edge(0,3,30));
		graph[0].add(new Edge(0,2,15));
		
		graph[1].add(new Edge(1,0,10));
		graph[1].add(new Edge(1,3,40));
		
		graph[2].add(new Edge(2,0,15));
		graph[2].add(new Edge(2,3,50));
		
		graph[3].add(new Edge(3,0,30));
		graph[3].add(new Edge(3,1,40));
		graph[3].add(new Edge(3,2,50));
		
		prims(graph);
	}
}
