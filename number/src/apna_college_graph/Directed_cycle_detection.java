package apna_college_graph;

import java.util.ArrayList;

//import apna_college_graph.creation_bfs_dfs.Edge;

public class Directed_cycle_detection {
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
	
	public static void dfs(ArrayList<Edge> graph[]) {
		boolean vis[]=new boolean[graph.length];
		boolean stack[]=new boolean[graph.length];
		for(int i=0;i<graph.length;i++) {
			if(!vis[i]) {
				if(dfsUtil(graph,vis,stack,i)) {
					System.out.println("true");
					return;
				}
			}
		}
		System.out.println("false");
	}
	
	
	public static boolean dfsUtil(ArrayList<Edge> graph[],boolean vis[],boolean stack[],int curr) {
		System.out.println(curr);
		vis[curr]=true;
		stack[curr]=true;
		for(int i=0;i<graph[curr].size();i++) {
			Edge e=graph[curr].get(i);
			if(stack[e.dest])
				return true;
			if(!vis[e.dest]&&dfsUtil(graph,vis,stack,e.dest)) {
				return true;
			}
		}
		stack[curr]=false;
		return false;
	}
	
	public static void main(String args[]) {
		int noOfVertex=4;
		@SuppressWarnings("unchecked")
		ArrayList<Edge> graph[]=new ArrayList[4];//array of arraylists
		
		for(int i=0;i<noOfVertex;i++) {
			graph[i]=new ArrayList<>();
		}
		//null--->new ArrayList
		graph[0].add(new Edge(0,2,1));
		
		graph[1].add(new Edge(1,0,1));		
		
		graph[2].add(new Edge(2,3,1));		
		
		graph[3].add(new Edge(3,0,1));
		
		dfs(graph);
	}
}
