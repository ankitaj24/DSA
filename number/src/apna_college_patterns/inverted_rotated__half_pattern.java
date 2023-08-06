package apna_college_patterns;
import java.util.*;
public class inverted_rotated__half_pattern {
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n=ip.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		ip.close();
	}
}
