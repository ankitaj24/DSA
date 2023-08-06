package apna_college_graph;
import java.util.*;
public class largest_regionOf1 {
	static int count;
	public static void main(String args[]) {
		//int arr[][]= {{0,0},{0,0}};
		int arr[][]= {{0,1,0,0},{0,1,0,1},{1,1,0,1},{0,1,0,1}};		
		boolean vis[][]=new boolean[arr.length][arr[0].length];
		ArrayList<Integer> ans=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(!vis[i][j]&&arr[i][j]==1) {
					count=1;
					dfs(arr,vis,i,j);					
					ans.add(count);
				}
			}
		}
		if(ans.size()!=0){
    		Collections.sort(ans,Collections.reverseOrder());
    		System.out.println(ans.get(0)); 
		}else
		System.out.println("0");
	}
	public static boolean isValid(int i,int j,int arr[][],boolean vis[][]) {
		if(i>=0&&i<arr.length&&j>=0&&j<arr[0].length&&!vis[i][j]&&arr[i][j]==1)
			return true;
		return false;
	}
	public static void dfs(int arr[][],boolean vis[][],int i,int j) {
		if(arr[i][j]==0)
			return;
		vis[i][j]=true;
		int x[]= {-1,-1,0,1,1,1,0,-1};
		int y[]= {0,-1,-1,-1,0,1,1,1};
		for(int k=0;k<x.length;k++) {
			int newi=i+x[k];
			int newj=j+y[k];
			if(isValid(newi,newj,arr,vis)) {
				count++;
				dfs(arr,vis,newi,newj);				
			}
		}
	}
}
