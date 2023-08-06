package apna_college_backtracking;
//col-1>=0&&sol[row][col-1]!=1&&
public class rat_grid_ways {
	public static void grid_ways(int arr[][],int row,int col,int sol[][]) {
		//base case
		if(row==arr.length-1&&col==arr.length-1) {
			sol[row][col]=1;
			print(sol);
			sol[row][col]=0;
			return;
			
		}
		
		//kaam
		int n=arr.length;
		sol[row][col]=1;
		if(row+1<n&&sol[row+1][col]!=1&&arr[row+1][col]==1) {//for down direction
			//sol[row][col]=1;
			grid_ways(arr,row+1,col,sol);
			//sol[row][col]=0;
		}
		if(col-1>=0&&sol[row][col-1]!=1&&arr[row][col-1]==1) {//for left direction
			//sol[row][col]=1;
			grid_ways(arr,row,col-1,sol);
			//sol[row][col]=0;
		}
		
		if(col+1<=n&&sol[row][col+1]!=1&&arr[row][col+1]==1) {//for right direction
			//sol[row][col]=1;
			grid_ways(arr,row,col+1,sol);
			//sol[row][col]=0;
		}
		if(row-1>=0&&sol[row-1][col]!=1&&arr[row-1][col]==1) {//for up direction
			//sol[row][col]=1;
			grid_ways(arr,row-1,col,sol);
			//sol[row][col]=0;
		}
			sol[row][col]=0;//backtrack
			
		
		
	}
	public static void print(int sol[][]) {
		int n=sol.length;
		System.out.println("------arrrays------");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				System.out.print(sol[i][j]+" ");
			System.out.println();
		}
	}	
	public static void main(String args[]) {
		int arr[][]=   {{1,0,0,0},
						{1,1,0,1},
						{0,1,1,0},
						{0,1,1,1}};
		int n=arr.length;
		int sol[][]=new int[n][n];
		grid_ways(arr,0,0,sol);
	}
	
}
