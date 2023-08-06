package apna_college_stacks;
import java.util.*;
public class decode {
	public static String decoding(String str) {
		Stack<Character> s=new Stack<>();
		Stack<Integer> no=new Stack<>();
		String st="",itr="";
		char ch;
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			if(Character.isDigit(ch))
				no.push(ch-'0');
			else if(ch!=']')
			{
				s.push(ch);
			}
			else {
				while(!s.isEmpty()&&s.peek()!='[') {
					st=s.pop()+st;	
				}
				s.pop();
				itr=st;
				
				for(int j=2;!no.isEmpty()&&j<=no.peek();j++) {
					st+=itr;
				}
				if(!no.isEmpty())
					no.pop();
				for(int k=0;k<st.length();k++)
					s.push(st.charAt(k));
				st="";
			}
		}
		st="";
		
		while(!s.isEmpty()) {
			st=s.pop()+st;
		}
		return st;
	}
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
		String str=ip.nextLine();		
		System.out.println(decoding(str));
		ip.close();
	}
}