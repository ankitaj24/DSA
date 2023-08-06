package apna_college_recursion;
import java.util.*;
public class contagious_substring {
	static int count=0;
	public static void substring(String s,int start,int end) {
		if(start == s.length() && end== s.length())
		{
				return;
		}
		else
		{
			if(end==s.length()+1) {
				substring(s,start+1,start+1);
			}
			else
			{
				if(start!=end)
				{
					System.out.println(s.substring(start,end));
					if((s.substring(start,end)).charAt(0)==(s.substring(start,end)).charAt((s.substring(start,end).length()-1)))
							count++;
				}
				substring(s,start,end+1);
			}
		}
		
	}
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s=ip.nextLine();
		substring(s,0,1);
		System.out.println(count);
		ip.close();
	}
}
