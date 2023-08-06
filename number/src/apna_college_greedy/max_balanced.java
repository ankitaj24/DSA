package apna_college_greedy;
//LRRRRLLRLLRL=3
//LRLLRRLRRL=4
public class max_balanced {
	public static int cal(String str) {
		int countL=0,countR=0,ans=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='L') 
				countL++;
			else if(ch=='R')
				countR++;
			
			if(countL==countR) {
				ans++;
				countL=0;
				countR=0;
			}
		}
		return ans;
	}
	public static void main(String args[]) {
		System.out.println(cal("RLRRLLRLRL"));
	}
}
