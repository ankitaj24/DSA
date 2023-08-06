package apna_college_greedy;

public class kth_largest_odd {
	public static int cal(int l,int r,int k) {
		int i;
		for(i=r;i>=l&&k>0;i--) {
			//System.out.println(i+" "+k);
			if(Math.abs(i)%2==1) 
				k--;
		}
		if(k==0)
			return ++i;
		else
			return 0;
	}
	public static void main(String args[]) {
		System.out.println(cal(-10,10,8));
	}
}
