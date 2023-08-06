package apna_college_basic_sorting;
import java.util.*;
public class counting_sort {
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=ip.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=ip.nextInt();
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
			largest=Math.max(largest, arr[i]);
		
		int count_arr[]=new int[largest+1];
		//counting the frequency of each elements
		for(int i=0;i<n;i++)
			count_arr[arr[i]]=count_arr[arr[i]]+1;
		//sorting using count array
		int k=0;
		for(int i=count_arr.length-1;i>=0;i--) {
			while(count_arr[i]>0)
			{
				arr[k]=i;
				k++;
				count_arr[i]--;
			}
		}
		
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		ip.close();
	}
}
