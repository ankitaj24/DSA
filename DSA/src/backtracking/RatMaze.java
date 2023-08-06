package backtracking;
import java.util.*;
public class RatMaze {
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
		int n=4;
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=ip.nextInt();
			}
		}
		boolean vis[][]=new boolean[n][n];
		ArrayList<String> result=new ArrayList<>();
		cal(arr,vis,0,0,"",result);
		System.out.println(result);
		ip.close();
		
	}
	public static void cal(int arr[][],boolean vis[][],int i,int j,String ans,ArrayList<String> result) {
		
		if(i==arr.length-1&&j==arr.length-1) {
			System.out.println("ANS: : "+ans);
			result.add(ans);
			return;
		}
		vis[i][j]=true;
		if(isSafe(arr,vis,i+1,j)) {
			cal(arr,vis,i+1,j,ans+"D",result);			
		}
		if(isSafe(arr,vis,i,j-1)) {
			cal(arr,vis,i,j-1,ans+"L",result);			
		}
		if(isSafe(arr,vis,i,j+1)) {
			cal(arr,vis,i,j+1,ans+"R",result);			
		}
		if(isSafe(arr,vis,i-1,j)) {
			cal(arr,vis,i-1,j,ans+"U",result);			
		}
		vis[i][j]=false;
		
	}
	public static boolean isSafe(int arr[][],boolean vis[][],int i,int j) {
		if(i>=0&&i<arr.length&&j>=0&&j<arr[0].length&&!vis[i][j]&&arr[i][j]==1)
			return true;
		return false;
	}
}
/*
1 0 0 0
1 1 0 1
1 1 0 0
0 1 1 1
*/
