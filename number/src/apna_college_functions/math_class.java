package apna_college_functions;
import java.util.*;
public class math_class {
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the 2 nums: ");
		int a=ip.nextInt();
		int b=ip.nextInt();
		
		//finding out the minimum num
		
		int min=Math.min(a, b);
		System.out.println("MIN: "+min);
		
		//finding out the maximum num
		
		int max=Math.max(a, b);
		System.out.println("MAX: "+max);
		
		//finding sqrt
		
		double sqrt=Math.sqrt(b);
		System.out.println("SQRT: "+sqrt);
		
		//finding power
		
		double pow=Math.pow(b,a);
		System.out.println("POWER: "+pow);
		
		//finding abs
		
		double abs=Math.abs(a);
		System.out.println("ABS: "+abs);
		
		ip.close();
		
	}
}
