package apna_college_recursion;
import java.util.*;
public class length_of_string {
	public static int length(String s) {
		//base case
		if(s.length()==0)
			return 0;
		
		//kaam
		return length(s.substring(1)) +1;
	}
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		System.out.print(length(s));
		ip.close();
		}
}
