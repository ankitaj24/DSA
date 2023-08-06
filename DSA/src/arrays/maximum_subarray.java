package arrays;
/*9
-2 1 -3 4 -1 2 1 -5 4*/
//o(n)--->Kadane algo
import java.util.Scanner;
public class maximum_subarray {
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
		int arr[]=new int[ip.nextInt()];
		for(int i=0;i<arr.length;i++) 
			arr[i]=ip.nextInt();
		int max=Integer.MIN_VALUE;
		int sum=max;
		sum=arr[0];
		int max2=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(sum>max)
				max=sum;
			if(max2<arr[i])
				max2=arr[i];
			if(sum+arr[i]>0)
				sum=sum+arr[i];
			else
				sum=0;
		}
		if(sum>max)
			max=sum;
		if(max!=0)
			System.out.println("Max: "+max);
		else
			System.out.println("Max: "+max2);
		ip.close();
	}
}
