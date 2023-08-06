package arrays;
//O(n)
import java.util.*;
public class reverse {
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
		int arr[]=new int[ip.nextInt()];
		for(int i=0;i<arr.length;i++) 
			arr[i]=ip.nextInt();
		for(int i=0;i<arr.length/2;i++) {
			arr[i]=arr[i]^arr[arr.length-1-i];
			arr[arr.length-1-i]=arr[i]^arr[arr.length-1-i];
			arr[i]=arr[i]^arr[arr.length-1-i];
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");			
		}
		ip.close();
	}
}
