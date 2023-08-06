package strings;
import java.util.*;
public class Permutation {
	public static ArrayList<String> permutation(String S)
    {
        ArrayList<String> ans=new ArrayList<>();
        boolean vis[]=new boolean[S.length()];
        StringBuilder temp=new StringBuilder();
        permutation(S,ans,vis,temp);
        return ans;
    }
	public static void permutation(String s,ArrayList<String> ans,boolean vis[],StringBuilder temp){
        if(temp.length()>=s.length()){
            ans.add(temp.toString());
            return;
        }
        for(int i=0;i<s.length();i++){
        	if(!vis[i]) {
        		vis[i]=true;
        		permutation(s,ans,vis,temp.append(s.charAt(i)));
                temp.deleteCharAt(temp.length()-1);
                vis[i]=false;
        	}
            
        }
    } 
	public static void main(String args[]) {
		System.out.println(permutation("ABC"));
	}
}
