package apna_college_functions;
import java.util.*;
public class palindrome {
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the no. : ");
		int num=ip.nextInt();
		if(isPalindrome(num))
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");
		ip.close();
	}
	public static boolean isPalindrome(int num) {
		int actnum=num;
		int rev=0;
		while(num>0) {
			rev=(rev*10)+(num%10);
			num=num/10;
		}
		if(actnum==rev)
			return true;
		return false;
					
	}
}
