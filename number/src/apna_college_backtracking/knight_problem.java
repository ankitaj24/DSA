package apna_college_backtracking;

public class knight_problem {
//	public static boolean isSafe(int arr[][],int row,int col) {
//		if(row<0||row>=arr.length||col<0||col>=arr.length||arr[row][col]>=0)
//			return false;
//		
//		return true;
//	}
	public static void knight(int arr[][],int row,int col,int move) {
		
		//if(isSafe(arr,row,col)==true) {
			//System.out.println("1");
			//base cond.
			if(row<0||row>=arr.length||col<0||col>=arr.length||arr[row][col]>=0) {
				return;
			}else if(move==((arr.length*arr.length)-1)) {
				arr[row][col]=move;
				print(arr);
				//arr[row][col]=-1;
				return;
			}
		    
			
			//kaam		
			arr[row][col]=move;			
			knight(arr,row+2,col+1,move+1);//1
			knight(arr,row+1,col+2,move+1);//2
			knight(arr,row-1,col+2,move+1);//3
			knight(arr,row-2,col+1,move+1);//4
			knight(arr,row-2,col-1,move+1);//5
			knight(arr,row-1,col-2,move+1);//6
			knight(arr,row+1,col-2,move+1);//7
			knight(arr,row+2,col-1,move+1);//8			
			arr[row][col]=-1;
//		}
//		else
//			return;
			
		//}
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
		int n=8;
		int arr[][]=new int[n][n];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++)
				arr[i][j]=-1;
		}
		knight(arr,0,0,0);
	}
}
