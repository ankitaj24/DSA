package apna_college_backtracking;

public class keypad_combo {
	final static char L[][]={{},
							{},
							{'a','b','c'},//for 2
							{'d','e','f'},//for 3
							{'g','h','i'},//for 4
							{'j','k','l'},//for 5
							{'m','n','o'},//for 6
							{'p','q','r','s'},//for 7
							{'t','u','v'},//for 8
							{'w','x','y','z'}};//for 9
	public static void cal(String str,int len,String ans,int pos) {
		
		//base case
		if(pos==len) {
			System.out.println(ans);
		}
		else {
			char ch[]=L[Character.getNumericValue(str.charAt(pos))];
			for(int i=0;i<ch.length;i++) {
				cal(str,len,ans+ch[i],pos+1);
			}
		}
	}
	public static void main(String args[]){
		String s="23";
		int n=s.length();
		if(n==0)
			System.out.println("null");
		else
		cal(s,n,"",0);
	}
}
