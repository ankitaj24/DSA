package apna_college_graph;
import java.util.*;
public class creation_bfs_dfs {
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
	
	//BFS
	public static void bfs(ArrayList<Edge> graph[]) {
		Queue<Integer> q=new LinkedList<>();
		boolean visited[]=new boolean[graph.length];
		
		q.add(0);
		
		while(!q.isEmpty()) {
			int curr=q.remove();
			if(!visited[curr]) {
				System.out.print(curr+" ");
				visited[curr]=true;
				for(int i=0;i<graph[curr].size();i++) {
					Edge e=graph[curr].get(i);
					q.add(e.dest);
				}
			}
			
		}
		System.out.println();
	
	
	}
	
	
	//DFS
	public static void dfs(ArrayList<Edge> graph[],int curr,boolean visited[]) {
		visited[curr]=true;
		System.out.println(curr+" ");
		
		for(int i=0;i<graph[curr].size();i++) {
			Edge e=graph[curr].get(i);
			if(!visited[e.dest])
			dfs(graph,e.dest,visited);
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
		graph[0].add(new Edge(0,1,5));
		
		graph[1].add(new Edge(1,0,5));
		graph[1].add(new Edge(1,2,1));
		graph[1].add(new Edge(1,3,3));
		
		graph[2].add(new Edge(2,1,3));
		graph[2].add(new Edge(2,3,1));
		graph[2].add(new Edge(2,4,2));
		
		graph[3].add(new Edge(3,1,3));
		graph[3].add(new Edge(3,2,1));
		
		graph[4].add(new Edge(4,2,2));
		
		
		System.out.println("BFS");
		bfs(graph);
		boolean visited[]=new boolean[graph.length];
		System.out.println("DFS: ");
		dfs(graph,0,visited);
		
		
		
		
		
		System.out.print("Neighbours of 0: ");
		//0-neighbours
		for(int i=0;i<graph[0].size();i++) {
			Edge e=graph[0].get(i);//src dest wt
			System.out.print(e.dest+" ");
		}
		
		System.out.println();
		//1-neighbours
		System.out.print("Neighbours of 1: ");
		for(int i=0;i<graph[1].size();i++) {
			Edge e=graph[1].get(i);
			System.out.print(e.dest+" ");
		}
		
		System.out.println();
		//2-neighbours
		System.out.print("Neighbours of 2: ");
		for(int i=0;i<graph[2].size();i++) {
			Edge e=graph[2].get(i);
			System.out.print(e.dest+" ");
		}
		
		System.out.println();
		//3-neighbours
		System.out.print("Neighbours of 3: ");
		for(int i=0;i<graph[3].size();i++) {
			Edge e=graph[3].get(i);
			System.out.print(e.dest+" ");
		}
		
		System.out.println();
		//4-neighbours
		System.out.print("Neighbours of 2: ");
		for(int i=0;i<graph[4].size();i++) {
			Edge e=graph[4].get(i);
			System.out.print(e.dest+" ");
		}
		
	}
}
