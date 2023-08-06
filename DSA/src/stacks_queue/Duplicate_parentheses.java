package stacks_queue;
import java.util.*;
public class Duplicate_parentheses {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		String str=new Scanner(System.in).nextLine();
		System.out.println(duplicate(str));
	}
	public static boolean duplicate(String str) {
		Stack<Character> s=new Stack<>();
		int flag=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch!=')') {
				s.push(ch);
				//System.out.println("F"+s+" "+flag);
			}
			else {
				//System.out.println("S"+s);
				while(s.peek()!='(') {
					flag=1;
					s.pop();
				}
				//System.out.println("T"+s);
				s.pop();
				//System.out.println("4"+s+" "+flag);
				if(flag==0) {
					return true;
				}else
					flag=0;
			}
		}
		//System.out.println(s);
		return false;
	}
}//((a+b)+(c+d))
