package apna_college_graph;
import java.util.*;
public class Shortest_src2dest {
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int m=ip.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=ip.nextInt();
			}
		}
		int x=ip.nextInt();
		int y=ip.nextInt();
		System.out.println(dijkstra(arr,x,y));
		ip.close();
	}
	static class Pair{
		int i;
		int j;
		int dist;
		Pair(int i,int j,int dist){
			this.i=i;
			this.j=j;
			this.dist=dist;
		}
	}
	public static boolean isSafe(int dist[][],int A[][],int newi,int newj,int i,int j,int currDist){
        if(newi>=0&&newi<A.length&&newj>=0&&newj<A[0].length&&A[newi][newj]==1&&dist[i][j]+currDist<dist[newi][newj])
        return true;
        return false;
    }
	public static int dijkstra(int arr[][],int X,int Y) {
		int dist[][]=new int[arr.length][arr[0].length];
		for(int i=0;i<dist.length;i++) {
			for(int j=0;j<dist[0].length;j++) {
				if(i==0&&j==0)
					dist[i][j]=0;
				else
					dist[i][j]=Integer.MAX_VALUE;
			}
		}
		Queue<Pair> q=new LinkedList<>();
		q.add(new Pair(0,0,0));
		int i2[]={-1,0,1,0};
        int j2[]={0,-1,0,1};
		while(!q.isEmpty()) {
			Pair curr=q.remove();			
			for(int k=0;k<4;k++){
	            int newi=curr.i+i2[k];
	            int newj=curr.j+j2[k];
	            if(isSafe(dist,arr,newi,newj,curr.i,curr.j,curr.dist)){
	            	dist[newi][newj]=curr.dist+1;
	                q.add(new Pair(newi,newj,curr.dist+1));
	            }
	        }
		}
		if(dist[X][Y]==Integer.MAX_VALUE)
	        return -1;
			return dist[X][Y];
	}
}
/*
3 4
1 0 0 0
1 1 0 1
0 1 1 1
Ans: 5
*/
/*
11 10
1 1 1 1 1 1 1 0 1 0
0 1 1 1 1 1 0 1 1 0
1 1 0 1 0 1 1 1 1 1
1 1 1 0 0 1 1 0 1 1
1 0 1 1 1 1 1 1 1 1
1 1 1 0 0 1 0 1 0 1
1 1 0 1 1 0 1 1 1 1
0 1 1 0 1 1 1 1 1 1
1 0 1 1 0 1 0 1 1 0
1 1 1 1 1 1 0 1 0 0
1 1 1 1 0 0 1 1 1 1
10 2
Ans: 14
*/