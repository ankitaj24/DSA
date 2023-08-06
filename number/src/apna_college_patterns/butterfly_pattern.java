package apna_college_patterns;
import java.util.*;
public class butterfly_pattern {
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n=ip.nextInt();
		for(int i=1;i<=2*n;i++)
		{
			if(i==n||i==n+1)
			{
				for(int j=1;j<=2*n;j++)
					System.out.print("*");
			}
			else if(i<n)
			{	
				for(int j=1;j<=i;j++)
					System.out.print("*");
				for(int j=2*n-1;j>=(2*i);j--)
					System.out.print(" ");
				for(int j=1;j<=i;j++)
					System.out.print("*");
			}
			else if(i>n+1)
			{
				for(int j=(2*n)-i+1;j>=1;j--)
					System.out.print("*");
				for(int j=(2*n);j<2*(i-1);j++)
					System.out.print(" ");
				for(int j=(2*n)-i+1;j>=1;j--)
					System.out.print("*");
			}
			
			System.out.println();
		}
		ip.close();
	}
}
