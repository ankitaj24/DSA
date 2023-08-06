package strings;
import java.util.*;
public class MoveHypens {
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
		String s=ip.nextLine();
		String temp="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='-')
				temp+="-";
		}
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch!='-')
				temp+=ch;
		}
		System.out.println(temp);
		ip.close();
			
	}
}
