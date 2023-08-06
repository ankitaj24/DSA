package apna_college_divide_nd_conquer;
import java.util.*;
public class merge_sort {
	public static void mergesort(String arr[],int start,int end)
	{
		//base case
		if(start>=end)
			return;
		int mid=(start+end)/2;
		
		//left side
		mergesort(arr,start,mid);
		
		//right side
		mergesort(arr,mid+1,end);
		
		merge(arr,start,end,mid);
	}
	public static void merge(String arr[],int start,int end,int mid) {
		String temp[]=new String[end-start+1];
		int i=start,j=mid+1;
		int k=0;
		while(i<=mid && j<=end) {
			if(arr[i].compareTo(arr[j])<0) {
				temp[k]=arr[i];
				i++;
				k++;
			}
			else {
				temp[k]=arr[j];
				k++;
				j++;
			}
		}
		while(i<=mid)
			temp[k++]=arr[i++];
		while(j<=end)
			temp[k++]=arr[j++];
		
		for(k=0,i=start;k<temp.length;k++,i++) {
			arr[i]=temp[k];
		}
	}
	public static void print(String arr[]) {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the no. of elements: ");
		int n=ip.nextInt();
		ip.nextLine();
		String arr[]=new String[n];
		System.out.println("Enter the strings: ");
		for(int i=0;i<n;i++)
			arr[i]=ip.nextLine();
		mergesort(arr,0,n-1);
		print(arr);
		ip.close();
	}
}
