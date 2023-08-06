package apna_college_loops;
import java.util.*;
public class num2 {
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the number of integers you want to enter: ");
		int n=ip.nextInt();
		int num,sum_e=0,sum_o=0;
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter a num: ");
			num=ip.nextInt();
			if(num%2==0)
				sum_e=sum_e+num;
			else
				sum_o=sum_o+num;
		}
		System.out.println("SUM OF EVEN NUMBERS ENTERED: "+sum_e);
		System.out.println("SUM OF ODD NUMBERS ENTERED: "+sum_o);
		ip.close();
	}
}
