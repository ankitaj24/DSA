package arrays;
//O(n)
import java.util.*;
public class max_min {
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
		int arr[]=new int[ip.nextInt()];
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
			arr[i]=ip.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
		}
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
		ip.close();
	}
}
