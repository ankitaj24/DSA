package apna_college_array;
import java.util.*;
public class distinct {
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=ip.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=ip.nextInt();
		distinct ob=new distinct();
		if(ob.cal(arr))
			System.out.println("true");
		else
			System.out.println("false");
		ip.close();
	}
	boolean cal(int arr[]) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					return true;				
			}
		}
		return false;
	}
}
