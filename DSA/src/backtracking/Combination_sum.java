package backtracking;
import java.util.*;
public class Combination_sum {
	public static void main(String args[]) {
			int B=12;
			ArrayList<Integer> A=new ArrayList<>();
			A.add(8);
			A.add(1);
			A.add(8);
			A.add(6);
			A.add(8);
			Collections.sort(A);
	        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
	        ArrayList<Integer> ans=new ArrayList<>();
	        cal(B, A, ans, 0, result);
			System.out.println(result);
	}
	public static void cal(int amt,ArrayList<Integer> arr,ArrayList<Integer> ans,int i,ArrayList<ArrayList<Integer>> result) {
		if(amt==0) {
		    result.add(new ArrayList<>(ans));
			return;
		}
		for (int idx = i; idx < arr.size(); idx++) {
			System.out.println(i+" "+idx);
            if (i < idx && arr.get(idx).equals(arr.get(idx - 1))) {
                continue; // Skip duplicates
            }
            if (arr.get(idx) <= amt) {
                ans.add(arr.get(idx));
                cal(amt - arr.get(idx), arr, ans, idx, result);
                ans.remove(ans.size() - 1);
            }
        }
	}
}
/*
for(int i=0;i<arr.length;i++) {
int sum=0;
cal(arr,arr[i],b,sum,ans,result);
System.out.println(result);
ans.clear();
}*/
/*//base case
System.out.println("Sum: "+sum);
if(sum==b) {
	System.out.println(ans);
	result.add(ans);
	flag=1;
	//ans.clear();
	return;
}else if(sum>b) {
	//ans.clear();
	sum=0;
	return;
}

for(int i=0;i<arr.length;i++) {
	ans.add(arr[i]);
	sum+=arr[i];
	cal(arr,num,b,sum,ans,result);
}*/