package pseudocodes;
import java.util.*;
public class test2 {
	public static void main(String args[]) {
		try (Scanner ip = new Scanner(System.in)) {
			String s=ip.nextLine();
			HashMap<Character,Integer> map=new HashMap<>(s.length());
			for(int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				map.put(ch,map.getOrDefault(ch, 0)+1);
			}
			//System.out.println(map);
			int count=0;
			String result="";
			for(int i=0;i<s.length();i++) {
				char ch=(char)(i+'0');
				if(map.containsKey(ch)) {
					count++;
					result+=map.get(ch);
				}else {
					result+="0";
				}
			}
			if(s.equals(result)) {
				System.out.println(count);
			}else
				System.out.println("0");
			System.out.println(result);
			String strn="      ANKIT        ";
			strn=strn.trim();
			System.out.println(strn);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
/*
String s=ip.nextLine();
StringTokenizer str=new StringTokenizer(s,"A,B,C");
StringTokenizer str1=new StringTokenizer(s,"0,1");
int ans=Integer.parseInt(str.nextToken());
while(str1.hasMoreTokens()) {
	int op=Integer.parseInt(str.nextToken());
	String tbh=str1.nextToken();
	if(tbh.equals("A")) {
		ans=ans&op;
	}else if(tbh.equals("B")) {
		ans=ans|op;
	}else {
		ans=ans^op;
	}				
}
System.out.println(ans);
*/
