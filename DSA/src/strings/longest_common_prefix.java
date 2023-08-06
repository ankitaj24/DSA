package strings;
import java.util.*;
/*
 * 3
	flower
	flow
	flight
 */
public class longest_common_prefix {	
    static class Node{
        Node[] children=new Node[26];
        boolean eow;
        int count=0;
        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }
    public static Node root=new Node();
    public static String insert(String s,int key){
        String ans="";
        if(key==1) {
        	Node curr=root;        
	        for(int i=0;i<s.length();i++){
	            int idx=s.charAt(i)-'a';
	            if(curr.children[idx]==null){
	                curr.children[idx]=new Node();
	                curr.count++;
	                //System.out.println(curr.count);
	            }
	            curr=curr.children[idx];
	        }
	        curr.eow=true;
	        return s;
        }
        else {
        	Node curr=root;
        	for(int i=0;i<s.length();i++) {
        		int idx=s.charAt(i)-'a';
        		//System.out.println(curr.count);
        		if(curr.count>1)
                    return ans;
        		if(curr.children[idx]==null||curr.eow==true) {
        			curr.count++;
        			return ans;
        		}
        		ans=ans+s.charAt(i);
        		curr=curr.children[idx];
        	}
        	curr.eow=true;
        }
        return ans;
        
    }
    public String longestCommonPrefix(String[] strs) {
        //StringTokenizer str=new StringTokenizer(" ");
        int tokenNo=1;
        String ans="";
        for(int i=0;i<strs.length;i++) {
        	String z=strs[i];
        	//System.out.println(z);
        	ans=insert(z,tokenNo);
        	//System.out.println(z+" "+ans);
        	++tokenNo;
        	if(ans.equals("")) {
        		return "";        		
        	}        	
        }
        return ans;
    }
    public static void main(String args[]) {
    	//Scanner ip=new Scanner(System.in);
    	String strs[]= {"aabc","aacb","aab"};
    	longest_common_prefix ob=new longest_common_prefix();
    	System.out.println("ans: "+ob.longestCommonPrefix(strs));
    }
}

