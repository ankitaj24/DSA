package apna_college_string;
import java.util.*;
public class count_lower_case {
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s=ip.nextLine();
		int count=0;
		char ch=' ';
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			count+=(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?1:0;
		}
		System.out.println("No of lowercase vowel character: "+count);
		ip.close();
	}	
}
