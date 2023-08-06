package number;
import java.util.*;
public class second_largest_in_array {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int max=Integer.MIN_VALUE;
		int sec_lar=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(max<arr[i]) {
				sec_lar=max;
				max=arr[i];
				//idx1=i;
			}
			else if(sec_lar<arr[i]&&arr[i]<max)
				sec_lar=arr[i];
		}
		System.out.println(sec_lar);
		sc.close();
	}
}
