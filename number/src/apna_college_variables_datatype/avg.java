package apna_college_variables_datatype;
import java.util.*;
public class avg {
	void cal(int a,int b,int c) {
		double avg=(double)(a+b+c)/3;
		System.out.println("Average="+avg);
	}
	public static void main(String args[])
	{
		avg ob=new avg();
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the 3 numbers: ");
		int a=ip.nextInt();
		int b=ip.nextInt();
		int c=ip.nextInt();
		ob.cal(a,b,c);
		ip.close();
	}
}
