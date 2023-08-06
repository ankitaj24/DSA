package apna_college_stacks;
import java.util.Stack;
import java.util.*;
public class simplify_path {
	public void cal(String path) {
		String token[]=path.split("/+");
		Stack<String> s=new Stack<>();
		for(int i=0;i<token.length;i++) 
		{
			if(token[i].equals("..")==true)
				s.pop();
			else if(token[i].length()!=0&&!token[i].equals(".")&&!token[i].equals(".."))
				s.push(token[i]);
			
				
		}
		if(s.isEmpty()==true)
			System.out.print("/");
		else{
			String st="";		
			while(!s.isEmpty()) {
				st="/"+s.pop()+st;
			}
			System.out.print(st);
		}
		
	}
	public static void main(String args[]) {
		simplify_path ob=new simplify_path();
		Scanner ip=new Scanner(System.in);
		ob.cal(ip.nextLine());
		//System.out.println();
		//ob.cal("/a/..");
		ip.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
