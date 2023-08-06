package backtracking;
import java.util.*;
public class StepsKnight {
	public static int minStepToReachTarget(int KnightPos[], int TargetPos[], int N){
        int arr[][]=new int[N][N];
        int posRow=KnightPos[0]-1;
        int posCol=KnightPos[1]-1;
        int tarRow=TargetPos[0]-1;
        int tarCol=TargetPos[1]-1;
        return cal(arr,posRow,posCol,tarRow,tarCol);
    }
    static class Pair{
		int i;
		int j;
		Pair(int i,int j){
			this.i=i;
			this.j=j;
		}
	}
	public static int cal(int arr[][],int i,int j,int tarRow,int tarCol) {
		boolean vis[][]=new boolean[arr.length][arr.length];
		if(i==tarRow&&j==tarCol) {
			return 0;
		}
		Queue<Pair> q=new LinkedList<>();
		int step=0;
		q.add(new Pair(i,j));
		while(!q.isEmpty()) {
			int size=q.size();
			step++;
			while(size>0) {
			    //main loop start
				Pair p=q.remove();
				if(!vis[p.i][p.j]) {					
					vis[p.i][p.j]=true;
					int newx[]= {1,-1,1,-1,-2,2,-2,2};
					int newy[]= {-2,-2,2,2,-1,-1,1,1};
					for(int k=0;k<newx.length;k++) {
						int newi=p.i+newx[k];
						int newj=p.j+newy[k];
						
						if(newi==tarRow&&newj==tarCol){
							return step;
						}
						if(isSafe(arr,vis,newi,newj)) {
							q.add(new Pair(newi,newj));
						}
					}
				}
				//main loop ends
				size--;
			}
		}
		return -1;
	}
	public static boolean isSafe(int arr[][],boolean vis[][],int i,int j) {
		if(i>=0&&i<arr.length&&j>=0&&j<arr.length&&!vis[i][j]) {
			return true;	
		}
		return false;
	}
	public static void main(String args[]) {
		int KnightPos[]= {4,5};
		int TargetPos[]= {1,1};
		System.out.println(minStepToReachTarget(KnightPos,TargetPos,6));
	}
}
