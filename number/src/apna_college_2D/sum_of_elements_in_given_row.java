package apna_college_2D;
import java.util.*;
public class sum_of_elements_in_given_row {
	void input() {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter n and m: ");
		int n=ip.nextInt();
		int m=ip.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				arr[i][j]=ip.nextInt();
		System.out.println("Enter the row whose sum is to be known: ");
		int row_no=ip.nextInt();
		ip.close();
		cal(arr,row_no);
	}
	void cal(int arr[][],int row_no) {
		int sum=0;
		for(int j=0;j<arr[0].length;j++) 
			sum+=arr[row_no-1][j];
		System.out.println("Sum: "+sum);
	}
	public static void main(String args[]) {
		sum_of_elements_in_given_row ob=new sum_of_elements_in_given_row();
		ob.input();
	}
}
