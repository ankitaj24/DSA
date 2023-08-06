package strings;
import java.util.*;
public class FirstNonRepeatingChar {
	public static void main(String args[]) {
		//String A="aabcbdcecf";
		String A="tcpmxaixsswjelbswxytyhbwjinuhxhvpwaybmdhndafszoghpyzdahiqsgluufqcekjk";
		String ans="";
		ans=ans+A.charAt(0);
		int arr[]=new int[26];
		Queue<Character> q=new LinkedList<>();
		q.add(A.charAt(0));
		arr[A.charAt(0)-'a']++;
		for(int i=1;i<A.length();i++) {
			char ch=A.charAt(i);
			arr[ch-'a']++;
			if(!q.isEmpty()&&q.peek()==ch) {
				q.remove();
			}
			else if(arr[ch-'a']<=1){				
				q.add(ch);
			}			
			while(!q.isEmpty()&&arr[q.peek()-'a']>1) {
				q.remove();
			}
			if(!q.isEmpty())
				ans=ans+q.peek();
			else
				ans=ans+"#";			
		}
		System.out.println(ans);
	}
}
/*
 * String ans="";
		Stack<Character> s=new Stack<>();
		ans=ans+A.charAt(0);
		s.push(A.charAt(0));
		for(int i=1;i<A.length();i++){
		    char ch=A.charAt(i);
		    int flag=0;
		    if(!s.isEmpty()&&s.peek()=='#') {
		    	ans=ans+ch;
		    	s.pop();
		    	s.push(ch);
		    }
		    else {
		        while(!s.isEmpty()&&s.peek()==ch) {
		        	flag=1;
		        	s.pop();
		        }
		        if(s.isEmpty()) {
		        	ans=ans+"#";
		        	s.push('#');
		        }
		        else {
		        	ans=ans+s.peek();
		        	if(flag!=1) {
		            	char chr=s.pop();
		            	s.push(ch);
		            	s.push(chr);
		        	}
		        }
		    }
		}
		System.out.println("Final ans:"+ans);*/
