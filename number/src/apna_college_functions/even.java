package apna_college_functions;
import java.util.*;
public class even {
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the no. : ");
		boolean z=isEven(ip.nextInt());
		if(z==true)
			System.out.println("No is even");
		else
			System.out.println("No is odd");
		ip.close();
	}
	public static boolean isEven(int num) {
		if(num%2==0)
			return true;
		return false;
	}
}
