package apna_college_graph;
import java.util.*;
public class RottenOranges {
	static class Pair{
		int x;
		int y;	
		Pair(int x,int y){
			this.x=x;
			this.y=y;
		}
	}
	
	
	public static void main(String args[]) {
		int arr[][]= {{2,1,1},{1,1,0},{0,1,1}};
		bfs(arr);
	}
	
	public static boolean isValid(int[][] arr,int x,int y) {
		if(x>=0&&x<arr.length&&y>=0&&y<arr[0].length)
			return true;
		return false;
	}
	
	
	
	public static int bfs(int arr[][]) {
		int fresh=0,time=0;
		Queue<Pair> q=new LinkedList<>();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==2) {
					q.add(new Pair(i,j));
				}
				else if(arr[i][j]==1)
					fresh++;
			}
		}
		if(fresh==0)
			return 0;
		if(q.isEmpty())
			return 0;
		
		while(!q.isEmpty()) {
			int flag=0;
			int size=q.size();
			while(size>0) {
				Pair p=q.remove();
				System.out.println(p.x+" "+p.y);
				if(isValid(arr,p.x-1,p.y)&&arr[p.x-1][p.y]==1) {
					arr[p.x-1][p.y]=2;
					q.add(new Pair(p.x-1,p.y));
					fresh--;
					flag++;
				}
				if(isValid(arr,p.x+1,p.y)&&arr[p.x+1][p.y]==1) {
					arr[p.x+1][p.y]=2;
					q.add(new Pair(p.x+1,p.y));
					fresh--;
					flag++;
				}
				if(isValid(arr,p.x,p.y+1)&&arr[p.x][p.y+1]==1) {
					arr[p.x][p.y+1]=2;
					q.add(new Pair(p.x,p.y+1));
					fresh--;
					flag++;
				}
				if(isValid(arr,p.x,p.y-1)&&arr[p.x][p.y-1]==1) {
					arr[p.x][p.y-1]=2;
					q.add(new Pair(p.x,p.y-1));
					fresh--;
					flag++;
				}
				size--;
			}
			if(flag!=0)
				time++;
			while(!q.isEmpty()) {
				Pair p2=q.remove();
				System.out.println(p2.x+" "+p2.y);
			}
			System.out.println("*****");
		}
		System.out.println(time+"***"+fresh);
		if(fresh!=0)
			return -1;
		return time;
	}
}
/*
 * //base case	
		int flag=0;
		if(arr[i][j]==2) {
			//vis[i][j]=true;
			if(i>=1&&j<arr[0].length&&arr[i-1][j]==1){//&&vis[i-1][j]==false) {
				arr[i-1][j]=2;
				//vis[i-1][j]=true;
				flag=1;
			}
			if(i<arr.length-1&&j<arr[0].length&&arr[i+1][j]==1){//&&vis[i+1][j]==true) {
				arr[i+1][j]=2;
				//vis[i+1][j]=true;
				flag=1;
			}
			if(i<arr.length&&j>=1&&arr[i][j-1]==1) {//&&vis[i][j-1]==true) {
				arr[i][j-1]=2;
				//vis[i][j-1]=true;
				flag=1;
			}
			if(i<arr.length&&j<arr[0].length-1&&arr[i][j+1]==1) {//&&vis[i][j+1]==true) {
				arr[i][j+1]=2;
				//vis[i][j+1]=true;
				flag=1;
			}
			if(flag==1) {
				ans++;
				System.out.println(i+" "+j);
				System.out.println(ans);
			}
		}
		if(i==arr.length&&j==arr[0].length)
			System.out.println(ans+"&");
		if(j<arr[0].length-1)
			bfs(arr,i,j+1,ans);//,vis);
		else if(i<arr.length-1) {
			bfs(arr,i+1,0,ans);//,vis);
		}
		*/
