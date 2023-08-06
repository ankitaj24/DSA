package apna_college_patterns;
import java.util.*;
public class number_pyramid {
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n=ip.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
				System.out.print(" ");
			for(int j=i;j>=1;j--)
				System.out.print(i+" ");
			System.out.println();
		}
		ip.close();
	}
}
