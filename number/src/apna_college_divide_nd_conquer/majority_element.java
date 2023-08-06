package apna_college_divide_nd_conquer;

import java.util.Scanner;
public class majority_element {
	public static void mergesort(int arr[],int start,int end)
	{
		//base case
		if(start>=end)
		{
			return;
		}
		int mid=(start+end)/2;
		
		//left side
		mergesort(arr,start,mid);
		
		
		//right side
		mergesort(arr,mid+1,end);
		
		merge(arr,start,end,mid);
	}
	public static void merge(int arr[],int start,int end,int mid) {
		int temp[]=new int[end-start+1];
		int i=start,j=mid+1;
		int k=0;
		while(i<=mid && j<=end) {
			if(arr[i]<arr[j]) {
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
	
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the no. of elements: ");
		int n=ip.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the strings: ");
		for(int i=0;i<n;i++)
			arr[i]=ip.nextInt();
		mergesort(arr,0,n-1);
		print(arr);
		int max=0,count=1,index=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]==arr[i+1])
				count++;			
			else {
				if(count>max) {
					index=i;
					max=count;
				}					
				count=1;
			}
			if(i==n-2) {
				if(count>max) {
					index=i;
					max=count;
				}
			}
				
		}
		if(max>(n/2))
			System.out.println(arr[index]);
		else
			System.out.println("No such element");
		ip.close();
	}
}
