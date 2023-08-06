package arrays2d;
import java.util.*;
public class set_matrix_zero {
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
		int x=1,y=1;
		for(int i=0;i<n;i++) {
			if(matrix[0][i]==0)
				x=0;			
		}
		for(int i=0;i<m;i++) {
			if(matrix[i][0]==0)
				y=0;
		}
		for(int i=1;i<m;i++) {
			for(int j=1;j<n;j++) {
				if(matrix[i][j]==0) {
					matrix[i][0]=0;
					matrix[0][j]=0;
				}
			}
		}
		for(int i=1;i<m;i++) {
			if(matrix[i][0]==0) {
				for(int j=0;j<n;j++) {
					matrix[i][j]=0;
				}
			}
		}
		for(int i=1;i<n;i++) {
			if(matrix[0][i]==0) {
				for(int j=1;j<m;j++) {
					matrix[j][i]=0;
				}
			}
		}
		if(x==0) {//first row is zero
			for(int i=0;i<n;i++)
				matrix[0][i]=0;
		}
		if(y==0) {//first coloumn is zero
			for(int i=0;i<m;i++)
				matrix[i][0]=0;
		}
		System.out.print("[");
		for(int i=0;i<m;i++) {
			System.out.print("[");
			for(int j=0;j<n;j++) {
				if(j!=n-1)
					System.out.print(matrix[i][j]+",");
				else
					System.out.print(matrix[i][j]);
			}
			System.out.print("]");
			if(i!=m-1)
				System.out.print(",");			
		}
		System.out.print("]");
		ip.close();
	}
}
