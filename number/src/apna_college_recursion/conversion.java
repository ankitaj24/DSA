package apna_college_recursion;
import java.util.*;
public class conversion {
	public static void convert(int n) {
		//base case
		if(n==0)
			return;
		
		//kaam
		convert(n/10);
		int d=n%10;
		if(d==0)
			System.out.print("zero"+" ");
		else if(d==1)
			System.out.print("one"+" ");
		else if(d==2)
			System.out.print("two"+" ");
		else if(d==3)
			System.out.print("three"+" ");
		else if(d==4)
			System.out.print("four"+" ");
		else if(d==5)
			System.out.print("five"+" ");
		else if(d==6)
			System.out.print("six"+" ");
		else if(d==7)
			System.out.print("seven"+" ");
		else if(d==8)
			System.out.print("eight"+" ");
		else if(d==9)
			System.out.print("nine"+" ");
		
	}
	public static void main(String args[])
	{
		int n=new Scanner(System.in).nextInt();
		convert(n);
		//new Scanner(System.in).close();
	}
}
