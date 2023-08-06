package apna_college_graph;
import java.util.*;
public class creation_ArrayList_Edge {
	static class Edge{
		int src;
		int dest;
		Edge(int src,int dest){
			this.src=src;
			this.dest=dest;
		}
	}
	public static void dfs(ArrayList<ArrayList<Edge>> graph) {
		boolean vis[]=new boolean[graph.size()];
		for(int i=0;i<graph.size();i++) {
			if(!vis[i])
				dfsUtil(graph,i,vis);
		}
	}
	
	public static void dfsUtil(ArrayList<ArrayList<Edge>> graph,int curr,boolean vis[]) {
		vis[curr]=true;
		System.out.print(curr+" ");
		for(int i=0;i<graph.get(curr).size();i++) {
			Edge e=graph.get(curr).get(i);
			if(!vis[e.dest]) {
				dfsUtil(graph,e.dest,vis);
			}
		}
	}
	
	
	public static void main(String args[]) {
		int V=6;
		ArrayList<ArrayList<Edge>> graph=new ArrayList<>(V);
		for(int i=0;i<V;i++) 
			graph.add(i,new ArrayList<Edge>());
		
		
		graph.get(0).add(new Edge(0,3));
		
		graph.get(2).add(new Edge(2,3));
		
		graph.get(3).add(new Edge(3,1));
		
		graph.get(4).add(new Edge(4,0));
		graph.get(4).add(new Edge(4,1));
		
		graph.get(5).add(new Edge(5,0));
		graph.get(5).add(new Edge(5,2));
		
		dfs(graph);
		
	}
}
