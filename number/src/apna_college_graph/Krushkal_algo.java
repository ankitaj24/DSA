package apna_college_graph;
import java.util.*;
public class Krushkal_algo {
	static class Edge implements Comparable<Edge>{
		int src;
		int dest;		
		int cost;
		Edge(int src,int dest,int cost){
			this.src=src;
			this.dest=dest;
			this.cost=cost;
		}
		public int compareTo(Edge e2) {
			return this.cost-e2.cost;
		}
	}
	
	
	static int v=7;
	static int par[]=new int[v];
	static int rank[]=new int[v];
	public static void init() {
		for(int i=0;i<par.length;i++) {
			par[i]=i;
		}
	}
	public static int find(int a) {//finding the parent of a
		if(par[a]==a)
			return par[a];
		return par[a]=find(par[a]);
	}
	public static void krushkal(ArrayList<Edge> graph,int v){
		init();
		Collections.sort(graph);
		int mstCost=0;
		for(int i=0;i<v-1;i++) {			
			Edge e2=graph.get(i);
			int parA=find(e2.src);
			int parB=find(e2.dest);
			if(parA!=parB) {
				union(e2.src,e2.dest);
				mstCost+=e2.cost;
			}			
		}
		System.out.println("MST: "+mstCost);		
	}
	
	
	
	
	public static void union(int a,int b) {//joining of a & b
		int parA=find(a);
		int parB=find(b);
		if(rank[parA]==rank[parB]) {
			par[parB]=parA;
			rank[parA]++;
		}
		else if(rank[parA]>rank[parB]) {
			par[parB]=parA;
		}
		else {
			par[parA]=parB;
		}
	}
	public static void main(String args[]) {
		v=4;
		//int E=5;
		ArrayList<Edge> graph=new ArrayList<>(v);
		
		graph.add(new Edge(0,1,10));
		graph.add(new Edge(0,2,15));
		graph.add(new Edge(0,3,30));
		
		graph.add(new Edge(1,3,40));
		
		graph.add(new Edge(2,3,50));
		krushkal(graph,v);
	}
}
