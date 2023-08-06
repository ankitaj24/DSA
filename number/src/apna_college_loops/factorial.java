package apna_college_loops;
import java.util.*;
public class factorial {
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter a num: ");
		int n=ip.nextInt();
		int fact=1;
		for(int i=2;i<=n;i++)
			fact=fact*i;
		System.out.println("FACTORIAL: "+fact);
		ip.close();
	}
}
