package strings;
//O(N)
import java.util.Scanner;


public class valid_palindrome {
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		s=s.toLowerCase();
		String str="",str1="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isAlphabetic(ch)) {
				str=str+ch;
				str1=ch+str1;
			}
		}
		if(str.compareTo(str1)==0)
			System.out.println("true");
		else
			System.out.println("false");
		ip.close();
	}
}
