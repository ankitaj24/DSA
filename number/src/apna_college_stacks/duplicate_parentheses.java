package apna_college_stacks;

import java.util.Stack;

public class duplicate_parentheses {
	public static boolean cal(String str) {
		Stack<Character> s=new Stack<>();
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch!=')')
				s.push(ch);
			else {
				//System.out.println(s);
				count=0;
				while(s.peek()!='(')
				{	s.pop();
					count++;
				}
				s.pop();
				//System.out.println(s);
				if(count==0)
					return true;
			}
		}
		return false;
	}
	public static void main(String args[]) {
		String str="(((a+b)))";
		System.out.println(cal(str));
	}
}
