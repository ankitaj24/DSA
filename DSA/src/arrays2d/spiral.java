package arrays2d;

import java.util.*;

public class spiral {
	public static void main(String args[]) {
		Scanner ip = new Scanner(System.in);	
		int m=ip.nextInt();
		int n=ip.nextInt();
		int matrix[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j]=ip.nextInt();
			}
		}
		ArrayList<Integer> list=new ArrayList<>();
		//System.out.println(list);
		int r1=0,r2=m-1,c1=0,c2=n-1;
		
		while(r1<=r2&&c1<=c2){
			for(int i=c1;i<=c2;i++) {				
				list.add(matrix[r1][i]);
				
			}
			r1++;
			for(int i=r1;i<=r2;i++) {				
				list.add(matrix[i][c2]);
				
			}
			c2--;
			if(r1<=r2) {
				for(int i=c2;i>=c1;i--) {				
					list.add(matrix[r2][i]);
					
				}
				r2--;
			}
			if(c1<=c2) {
				for(int i=r2;i>=r1;i--) {
					list.add(matrix[i][c1]);
					
				}
				c1++;
			}
			
		}
		System.out.println(list);
		ip.close();
	}
}
