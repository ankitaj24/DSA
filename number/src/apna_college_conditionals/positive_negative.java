package apna_college_conditionals;
import java.util.*;
public class positive_negative {
	void cal(int a)
	{
		if(a>=0)
			System.out.println("POSITIVE NUMBER");
		else
			System.out.println("NEGATIVE NUMBER");
	}
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=ip.nextInt();
		positive_negative ob=new positive_negative();
		ob.cal(a);
		ip.close();
	}
}
