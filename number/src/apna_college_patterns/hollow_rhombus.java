package apna_college_patterns;
import java.util.*;
public class hollow_rhombus {
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n=ip.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
				System.out.print(" ");
			if(i==1||i==n)
			{
				for(int j=1;j<=n;j++)
					System.out.print("*");
			}
			else
			{
				for(int j=1;j<=n;j++)
				{
					if(j==1||j==n)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
			System.out.println();
			ip.close();
		}
	}
}
