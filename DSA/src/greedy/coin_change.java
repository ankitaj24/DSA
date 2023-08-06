package greedy;
import java.util.*;
public class coin_change {
	static int min=Integer.MAX_VALUE;
	public static void main(String args[]) {
		//int amt=23;
		//int arr[]= {5,4,2};
		int amt=3;
		int arr[]= {2};
		ArrayList<Integer> ans=new ArrayList<>();
		cal(amt,arr,ans,0);
		System.out.println("Min: "+min);
	}
	public static void cal(int amt,int arr[],ArrayList<Integer> ans,int i) {
		if(amt==0) {
			System.out.println(ans);
			min=Math.min(min, ans.size());
			return;
		}
		if(i==arr.length) {
			return;
		}			
		if(arr[i]<=amt) {
			ans.add(arr[i]);
			cal(amt-arr[i],arr,ans,i);
			ans.remove(ans.get(ans.size()-1));
		}		
		cal(amt,arr,ans,i+1);	
	}
}