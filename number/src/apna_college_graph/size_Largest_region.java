package apna_college_graph;

public class size_Largest_region {
	public static void main(String args[]) {
		int arr[][]= {{0,0,1,1,0},{0,1,1,1,0},{0,1,0,1,0},{0,0,0,0,1}};
		int vis[][]=new int[arr.length][arr[0].length];
		size(arr,vis,0,0);
		for(int i=0;i<vis.length;i++) {
			for(int j=0;j<vis[0].length;j++) {
				System.out.print(vis[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void size(int arr[][],int vis[][],int row,int col) {
		if(row==arr.length||col==arr[0].length||row<0||col<0) {
			return;	
		}
		if(arr[row][col]==1) {
			vis[row][col]=1;
			if(row-1>=0&&arr[row-1][col]==1) {
				System.out.println("First"+row+" "+col);
				vis[row][col]+=1;
			}
			if(row+1<arr.length&&arr[row+1][col]==1) {
				System.out.println("Second"+row+" "+col);
				vis[row][col]+=1;
			}
			if(col+1<arr[0].length&&arr[row][col+1]==1) {
				System.out.println("Third"+row+" "+col);
				vis[row][col]+=1;
			}
			if(col-1>=0&&arr[row][col-1]==1) {
				System.out.println("Fourth"+row+" "+col);
				vis[row][col]+=1;
			}
			if(row-1>=0&&col-1>=0&&arr[row-1][col-1]==1) {
				System.out.println("Fifth"+row+" "+col);
				vis[row][col]+=1;
			}
			if(row-1>=0&&col+1<arr[0].length&&arr[row-1][col+1]==1) {
				System.out.println("Sixth"+row+" "+col);
				vis[row][col]+=1;
			}
			if(row+1<arr.length&&col-1>0&&arr[row+1][col-1]==1) {
				System.out.println("Seventh"+row+" "+col);
				vis[row][col]+=1;
			}
			if(row+1<arr.length&&col+1<arr[0].length&&arr[row+1][col+1]==1) {
				System.out.println("Eight"+row+" "+col);
				vis[row][col]+=1;
			}
		}
		if(col<arr[0].length-1) {
			size(arr,vis,row,col+1);
		}
		else if(row<arr.length-1) {
			size(arr,vis,row+1,0);
		}
	}
}
