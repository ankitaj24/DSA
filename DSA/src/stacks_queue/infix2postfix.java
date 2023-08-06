package stacks_queue;
import java.util.*;
//((A+B)–C*(D/E))+F
public class infix2postfix {
	public static String infixToPostfix(String exp) {
	    Stack<Character> s=new Stack<>();
	    String ans="";
	    for(int i=0;i<exp.length();i++) {
	    	char ch=exp.charAt(i);	    	
	    	if(ch=='(') {	    		
	    		s.push(ch);
	    	}
	    	else if(ch==')') {	    		
	    		while(!s.isEmpty()&&s.peek()!='(') {
	    			ans=ans+s.pop();
	    		}
	    		s.pop();
	    	}
	    	else if(ch=='^') {
	    		while(!s.isEmpty()&&(s.peek()=='^')) {
	    			ans=ans+s.pop();
	    		}
	    		s.push(ch);
	    	}
	    	else if(ch=='/') {
	    		while(!s.isEmpty()&&(s.peek()=='^'||s.peek()=='*'||s.peek()=='/')) {
	    			ans=ans+s.pop();
	    		}
	    		s.push(ch);
	    	}
	    	else if(ch=='*') {	    		
	    		while(!s.isEmpty()&&(s.peek()=='^'||s.peek()=='/'||s.peek()=='*')) {
	    			ans=ans+s.pop();
	    		}
	    		s.push(ch);
	    	}
	    	else if(ch=='+') {	    		
	    		while(!s.isEmpty()&&(s.peek()=='^'||s.peek()=='/'||s.peek()=='*'||s.peek()=='-'||s.peek()=='+') ){
	    			ans=ans+s.pop();
	    		}
	    		s.push(ch);
	    	}
	    	else if(ch=='-') {	    		
	    		while(!s.isEmpty()&&(s.peek()=='^'||s.peek()=='/'||s.peek()=='*'||s.peek()=='+'||s.peek()=='-') ){
	    			ans=ans+s.pop();
	    		}
	    		s.push(ch);
	    	}
	    	else {	    		
	    		ans=ans+ch;
	    	}
	    	//System.out.println(ans+"        "+ch+"      "+s);
	    }
	    while(!s.isEmpty())
	    	ans=ans+s.pop();
	    return ans;
    }
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the string: ");
		//String s=ip.nextLine();
		System.out.println(infixToPostfix("(a*b)-(c*d)+(e/f)"));
		ip.close();
	}
}
