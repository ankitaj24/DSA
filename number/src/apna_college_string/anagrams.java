package apna_college_string;
import java.util.*;
public class anagrams {
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=ip.nextLine();
		System.out.println("Enter the 2nd string: ");
		String s1=ip.nextLine();
		int flag=0;
		if(s.length()==s1.length())
		{
			for(int i=0;i<s.length();i++)
			{
				flag=0;
				char ch=s.charAt(i);
				for(int j=0;j<s1.length();j++)
				{
					char chr=s1.charAt(j);
					if(ch==chr)
					{
						flag=1;
						break;
					}
				}
				if(flag==0)
				{
					System.out.println("NOT ANAGRAM");
					break;
				}
			}
			if(flag==1)
				System.out.println("ANAGRAM");
			
		}
		else
			System.out.println("NOT ANAGRAM");
		ip.close();
	}
}
