package apna_college_basic_sorting;
import java.util.*;
public class insertion_sort {
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=ip.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=ip.nextInt();
		for(int i=0;i<n;i++) {
			int curr=arr[i];
			int prev=i-1;
			while(prev>=0 && arr[prev]<curr) {
				arr[prev+1]=arr[prev];
						prev--;
			}
			arr[prev+1]=curr;
		}
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		ip.close();
	}
}
