package apna_college_2D;
import java.util.*;
public class no_of_elements {
	void input() {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter n and m: ");
		int n=ip.nextInt();
		int m=ip.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				arr[i][j]=ip.nextInt();
		System.out.println("Enter the element whose frequency is to be known: ");
		int no=ip.nextInt();
		ip.close();
		cal(arr,no);
	}
	void cal(int arr[][],int no) {
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==no)
					count++;
			}
		}
		System.out.println("Count of "+no+" : "+count);
	}
	public static void main(String args[])
	{
		no_of_elements ob=new no_of_elements();
		ob.input();
	}
}
