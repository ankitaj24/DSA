package backtracking;
/*4
1 0 0 0
1 1 0 1
1 1 0 0
0 1 1 1
*/
import java.util.*;
public class rat_in_a_maze {
	public static void main(String args[]) {
		try(Scanner ip=new Scanner(System.in)){
		int n=ip.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				a[i][j]=ip.nextInt();
		}
		//String str="";
		if(a[0][0]==0)
			return;
		ArrayList<String> arr=new ArrayList<String>();
		findPath(a,n,"",0,0,arr,new int[n][n]);
		if(arr.size()>0)
			System.out.println(arr);
		else
			System.out.println("-1");
		}
	}
	public static void findPath(int[][] m, int n,String ans,int i,int j,ArrayList<String> arr,int visited[][]) {
		if(i==n-1&&j==n-1) {			
			arr.add(ans.toString());			
			return;
		}
		
		if(isSafe(m,n,i+1,j,visited)) {
			visited[i][j]=1;
			findPath(m,n,ans+"D",i+1,j,arr,visited);//down
			visited[i][j]=0;
		}
		if(isSafe(m,n,i,j-1,visited)) {
			visited[i][j]=1;
			findPath(m,n,ans+"L",i,j-1,arr,visited);//left
			visited[i][j]=0;
		}
		if(isSafe(m,n,i,j+1,visited)) {
			visited[i][j]=1;
			findPath(m,n,ans+"R",i,j+1,arr,visited);//right
			visited[i][j]=0;
		}
		if(isSafe(m,n,i-1,j,visited)) {
			visited[i][j]=1;
			findPath(m,n,ans+"U",i-1,j,arr,visited);//left
			visited[i][j]=0;
		}      
    }
	public static boolean isSafe(int[][] m, int n,int i,int j,int visited[][]) {
		if((i<n&&i>=0)&&(j<n&&j>=0)&&visited[i][j]==0&&m[i][j]==1) {
			return true;
		}
		return false;
	}
}

/*
 * if(i>n-1||j>n-1||i<0||j<0) {
			ans.deleteCharAt(ans.length()-1);
			return;
		}
	        
		System.out.println(i+" "+j);
		if(i==n-1&&j==n-1) {
			System.out.println(ans);
			
		}
		
		if(m[i][j]==0) { 
			 return;
		 }
*/
