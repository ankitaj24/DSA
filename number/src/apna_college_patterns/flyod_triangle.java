package apna_college_patterns;
import java.util.*;
public class flyod_triangle {
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n=ip.nextInt();
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(count<10)
					System.out.print(count+++"  ");
				else
					System.out.print(count+++" ");
			}
				System.out.println();
		}
		ip.close();
	}
}
