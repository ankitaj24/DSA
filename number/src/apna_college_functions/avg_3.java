package apna_college_functions;
import java.util.*;
public class avg_3 {
	public static void input() {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the 3 nos: ");
		int a=ip.nextInt();
		int b=ip.nextInt();
		int c=ip.nextInt();
		avg(a,b,c);
		ip.close();
	}
	public static void avg(int num1,int num2,int num3)
	{
		int avg=(num1+num2+num3)/3;
		System.out.println("Average of 3 nos: "+avg);
	}
	public static void main(String args[])
	{
		input();
	}
}
