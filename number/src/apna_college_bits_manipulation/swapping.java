package apna_college_bits_manipulation;
import java.util.*;
public class swapping {
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the 2 nos: ");
		int a=ip.nextInt();
		int b=ip.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a="+a+" b="+b);
		ip.close();
	}
}
