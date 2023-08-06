package apna_college_functions;
import java.util.*;
public class sum_of_digits {
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the no. : ");
		int num=ip.nextInt();
		System.out.println("Sum of Digit: "+sum(num));
		ip.close();
	}
	public static int sum(int num) {
		int sod=0;
		while(num>0) {
			sod=sod+(num%10);
			num=num/10;
		}
		return sod;
					
	}
}
