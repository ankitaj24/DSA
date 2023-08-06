package strings;
import java.util.*;
public class remove_consecutive_characters {
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
			String s=ip.nextLine();
			String str="";
			int count=1;
			for(int i=0;i<s.length()-1;i++) {
				char ch=s.charAt(i);
				char chr=s.charAt(i+1);
				//System.out.println(s+" "+ch+" "+chr+" "+count);
				if(ch==chr) {
					count++;
				}
				else {
					str=str+s.charAt(i);
					count=1;
				}
			}
			if(count>=1)
				str=str+s.charAt(s.length()-1);
			System.out.println(str);
			ip.close();
		
	}
}
