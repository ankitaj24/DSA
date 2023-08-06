package apna_college_array;
import java.util.*;
public class rotation {
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=ip.nextInt();
		int arr[]=new int[n];
		System.out.println("Target element: ");
		int tar=ip.nextInt();
		for(int i=0;i<n;i++)
			arr[i]=ip.nextInt();
		pivot(arr,tar);
		ip.close();
	}
	public static void pivot(int arr[],int tar) {
		int k=0;
		while(k<arr.length-1) {
			if(arr[k]>arr[k+1])
				break;
			k++;
		}
		int flag=binarysearch(arr,0,k,tar);
		if(flag!=-1)
			System.out.println(flag);
		else
			System.out.println(binarysearch(arr,k,arr.length-1,tar));
		
	}
	public static int binarysearch(int arr[],int start,int end,int tar)
	{
		int flag=-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==tar)
				return mid;
			else if(arr[mid]<tar)
				start=mid+1;
			else if(arr[mid]>tar)
				end=mid-1;
		}
		
		return flag;
	}
}
