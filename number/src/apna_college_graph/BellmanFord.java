package apna_college_graph;

import java.util.ArrayList;

//import apna_college_graph.creation_bfs_dfs.Edge;

public class BellmanFord {
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
	
	public static void bfs(ArrayList<Edge> graph[],int src) {
		int dist[]=new int[graph.length];
		for(int i=0;i<dist.length;i++) {
			if(i==src)
				dist[i]=0;
			else
				dist[i]=Integer.MAX_VALUE;
		}
		//Time complexity for whole BellmanFord: O((V-1)*E)
		for(int iterator=0;iterator<graph.length-1;iterator++) {//BellmanFord algo runs for V-1 times
			//Time complexity for inner two loops is O(E)
			for(int i=0;i<graph.length;i++) {
				for(int j=0;j<graph[i].size();j++) {
					Edge e=graph[i].get(j);
					int u=e.src;
					int v=e.dest;
					int wt=e.wt;
					if(dist[u]!=Integer.MAX_VALUE&&dist[u]+wt<dist[v]) {
						dist[v]=dist[u]+wt;
					}
				}
			}
		}
		for(int i=0;i<dist.length;i++) {
			System.out.println(src+" "+i+" "+dist[i]);
		}
	}	
	
	public static void main(String args[]) {
		int noOfVertex=5;
		@SuppressWarnings("unchecked")
		ArrayList<Edge> graph[]=new ArrayList[noOfVertex];//array of arraylists
		
		for(int i=0;i<noOfVertex;i++) {
			graph[i]=new ArrayList<>();
		}
		//null--->new ArrayList
		graph[0].add(new Edge(0,1,2));
		graph[0].add(new Edge(0,2,4));		
		
		graph[1].add(new Edge(1,2,-4));		
		
		graph[2].add(new Edge(2,3,2));		
		
		graph[3].add(new Edge(3,4,4));
		
		graph[4].add(new Edge(4,1,-1));
		
		bfs(graph,0);
	}
}
