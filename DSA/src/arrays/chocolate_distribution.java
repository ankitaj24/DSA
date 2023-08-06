package arrays;
import java.util.*;
/*
 * 17
	12 4 7 9 2 23 25 41 30 40 28 42 30 44 48 43 50
 */
public class chocolate_distribution {
	public static void main(String args[]) {
		try(Scanner ip=new Scanner(System.in)){
			int arr[]=new int[ip.nextInt()];
			for(int i=0;i<arr.length;i++)
				arr[i]=ip.nextInt();
			Arrays.sort(arr);			
			int m=ip.nextInt();
			int diff=0;
			int min=Integer.MAX_VALUE;
			for(int i=0;i<=arr.length-m;i++) {
				diff=arr[i+m-1]-arr[i];
				if(diff<min)
					min=diff;
			}
			System.out.println("Minimum diff.: "+min);
		}
	}
}
