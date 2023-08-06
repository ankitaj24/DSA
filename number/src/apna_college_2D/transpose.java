/*3
2 3 4
9 4 1
7 6 0*/
package apna_college_2D;
import java.util.*;
public class transpose {
	void input() {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter n and m: ");
		int n=ip.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				arr[i][j]=ip.nextInt();
		ip.close();
		cal(arr);
	}
	void cal(int arr[][]) {
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<=i;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}
	public static void main(String args[]) {
		transpose ob=new transpose();
		ob.input();
	}
}
