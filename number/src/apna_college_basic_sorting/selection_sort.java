package apna_college_basic_sorting;
import java.util.*;
public class selection_sort {
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=ip.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=ip.nextInt();
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[min]<arr[j]) {
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		ip.close();
	}
}
