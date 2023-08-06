package apna_college_loops;
import java.util.*;
public class table_print {
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter a num: ");
		int n=ip.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" x "+i+" = "+(n*i));
		}
		ip.close();
	}
}
