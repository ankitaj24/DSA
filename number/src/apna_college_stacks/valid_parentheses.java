package apna_college_stacks;
import java.util.*;
public class valid_parentheses {
	public static boolean cal(String str) {
		Stack<Character> s=new Stack<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='('||ch=='['||ch=='{')
				s.push(ch);
			else {
				if(!s.isEmpty()&&((ch==')'&&s.peek()=='(')||(ch==']'&&s.peek()=='[')||(ch=='}'&&s.peek()=='{')))
				s.pop();
				else
					return false;
			}
		}
		if(s.empty())
			return true;
		else
			return false;
		//System.out.println(s);
	}
	public static void main(String args[]) {
		String str="((){}[])";
		System.out.println(cal(str));
	}
	
}
