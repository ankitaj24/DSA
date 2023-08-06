package apna_college_patterns;
import java.util.*;
public class inverted_half_pyramid {
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n=ip.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		ip.close();
	}
}
