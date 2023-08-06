package apna_college_graph;
import java.util.*;
public class Undirected_cycle_detection {
	static class Edge{
		int src;
		int dest;
		Edge(int src,int dest){
			this.src=src;
			this.dest=dest;
		}
	}
	
	
	public static boolean dfs(ArrayList<Edge> graph[]) {
		boolean vis[]=new boolean[graph.length];
		for(int i=0;i<graph.length;i++) {
			if(!vis[i]) {
				if(dfsUtil(graph,i,-1,vis))
					return true;
			}
		}
		return false;
	}
	
	public static boolean dfsUtil(ArrayList<Edge> graph[],int src,int parent,boolean vis[]) {
		vis[src]=true;
		for(int i=0;i<graph[src].size();i++) {
			Edge e=graph[src].get(i);
			if(vis[e.dest]==true&&e.dest!=parent) {
				return true;
			}
			else if(!vis[e.dest]){
				if(dfsUtil(graph,e.dest,src,vis))
					return true;
			}
		}
		return false;
	}
	
	
	
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		int v=7;
		ArrayList<Edge> graph[]=new ArrayList[v];
		for(int i=0;i<graph.length;i++) {
			graph[i]=new ArrayList<>();
		}
		graph[0].add(new Edge(0,1));
		graph[0].add(new Edge(0,2));
		
		graph[1].add(new Edge(1,0));
		graph[1].add(new Edge(1,3));
		
		
		graph[2].add(new Edge(2,0));
		graph[2].add(new Edge(2,4));
		
		graph[3].add(new Edge(3,1));
		//graph[3].add(new Edge(3,4));
		graph[3].add(new Edge(3,5));
		
		graph[4].add(new Edge(4,2));
		//graph[4].add(new Edge(4,3));
		//graph[4].add(new Edge(4,5));
		
		graph[5].add(new Edge(5,3));
		//graph[5].add(new Edge(5,4));
		graph[5].add(new Edge(5,6));
		
		graph[6].add(new Edge(6,5));
		System.out.println(dfs(graph));
	}
}
