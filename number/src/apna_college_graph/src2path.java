package apna_college_graph;

import java.util.*;
public class src2path {
	static class Edge{
		int src;
		int dest;
		Edge(int src,int dest){
			this.src=src;
			this.dest=dest;
		}
	}
	public static void dfs(ArrayList<ArrayList<Edge>> graph,int src,int dest) {		
		String path="";		
		dfsUtil(graph,src,path,src,dest);
		
	}	
	public static void dfsUtil(ArrayList<ArrayList<Edge>> graph,int curr,String path,int src,int dest) {
		if(curr==dest) {
			System.out.println(path+""+curr);
			return;
		}
		path=path+Integer.toString(curr)+" ";		
		for(int i=0;i<graph.get(curr).size();i++) {
			Edge e=graph.get(curr).get(i);			
			dfsUtil(graph,e.dest,path,src,dest);			
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
		
		Scanner ip=new Scanner(System.in);
		int src=ip.nextInt();
		int dest=ip.nextInt();
		
		
		
		dfs(graph,src,dest);
		ip.close();
	}
}
