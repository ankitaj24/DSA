package apna_college_graph;
import java.util.*;
public class flood_fill_algo {
	public static void main(String args[]) {
		int arr[][]= {{0,0,0},{0,1,0}};
		bfs(arr,0,0,2,arr[0][0]);
		arr[0][0]=2;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	static class Pair{
		int i;
		int j;
		Pair(int i,int j){
			this.i=i;
			this.j=j;
		}
	}
	public static boolean isValid(int arr[][],boolean vis[][],int newi,int newj,int i,int j,int val) {
		if(newi>=0&&newi<arr.length&&newj>=0&&newj<arr[0].length&&!vis[newi][newj]&&arr[newi][newj]==val)
			return true;
		return false;
	}
	
	
	public static void bfs(int arr[][],int sr,int sc,int color,int val) {
		boolean vis[][]=new boolean[arr.length][arr[0].length];
		Queue<Pair> q=new LinkedList<>();
		System.out.println(sr+" "+sc+" "+color+" "+val);
		q.add(new Pair(sr,sc));
		
		while(!q.isEmpty()) {
			Pair p=q.remove();
			int i=p.i;
			int j=p.j;
			if(!vis[i][j]) {
				vis[i][j]=true;
				int x[]= {-1,0,1,0};
				int y[]= {0,-1,0,1};
				for(int k=0;k<x.length;k++) {
					int newi=i+x[k];
					int newj=j+y[k];
					System.out.println(i+" "+j+" "+newi+" "+newj);
					System.out.println(isValid(arr,vis,newi,newj,i,j,val));
					if(isValid(arr,vis,newi,newj,i,j,val)) {
						System.out.println("Check"+newi+" "+newj);
						arr[newi][newj]=color;
						arr[i][j]=color;
						q.add(new Pair(newi,newj));
					}
				}
				
			
			}
			
		}
		
	}
}
