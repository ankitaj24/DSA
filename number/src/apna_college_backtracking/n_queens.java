package apna_college_backtracking;

public class n_queens {
	public static boolean isSafe(int arr[][],int row,int col) {
		for(int i=row-1;i>=0;i--) {
			if(arr[i][col]==1)
				return false;
		}
		for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--) {
			if(arr[i][j]==1)
				return false;
		}
		for(int i=row-1,j=col+1;i>=0&&j<arr.length;i--,j++) {
			if(arr[i][j]==1)
				return false;
		}
		
		return true;
	}
	public static void knight(int arr[][],int row) {
		//base
		if(row==arr.length) {
			print(arr);
			return;
		}			
		//kaam
		for(int i=0;i<arr.length;i++) {
			if(isSafe(arr,row,i)==true) {
				arr[row][i]=1;
				knight(arr,row+1);
				arr[row][i]=0;
			}
		}
	}
	public static void print(int arr[][]) {
		System.out.println("----chess board----");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}
	public static void main(String args[]) {
		int arr[][]=new int[4][4];
		knight(arr,0);
	}
}
