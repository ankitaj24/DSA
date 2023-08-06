package strings;
import java.util.*;
public class valid_parentheses {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s=scanner.nextLine();		
		Stack<Character> st=new Stack<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(!st.isEmpty()&&ch==']'&&st.peek()=='[') {
				st.pop();
			}
			else if(!st.isEmpty()&&ch==')'&&st.peek()=='(') {
				st.pop();
			}
			else if(!st.isEmpty()&&ch=='}'&&st.peek()=='{') {
				st.pop();
			}			
			else {
				st.push(ch);
			}
		}
		if(st.isEmpty())
			System.out.println("true");
		else
			System.out.println("false");
		scanner.close();
	}
}
