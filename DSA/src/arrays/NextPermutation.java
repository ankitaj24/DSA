package arrays;

import java.util.Arrays;

//import java.util.*;
public class NextPermutation {
	public void nextPermutation(int[] nums) {
		int n=nums.length;
		if(nums.length==1) {
			for(int i=0;i<nums.length;i++)
				System.out.println(nums[i]);
			return;
		}else if(nums.length==2) {
			nums[0]=nums[0]^nums[1];
			nums[1]=nums[0]^nums[1];
			nums[0]=nums[0]^nums[1];
			for(int i=0;i<nums.length;i++)
				System.out.print(nums[i]+" ");
			return;
		}
		int idx=-1;
		for(int i=n-1;i>0;i--) {
			if(nums[i]>nums[i-1]) {
				idx=i-1;
				break;
			}
		}
		if(idx==-1) {
			Arrays.sort(nums);
			for(int i=0;i<nums.length;i++)
				System.out.print(nums[i]+" ");
			return;
		}else {
			for(int i=n-1;i>=idx+1;i--) {
				if(nums[i]>nums[idx]) {
					nums[i]=nums[i]^nums[idx];
					nums[idx]=nums[i]^nums[idx];
					nums[i]=nums[i]^nums[idx];
					break;
				}
			}
			Arrays.sort(nums,idx+1,n);
			for(int i=0;i<nums.length;i++)
				System.out.print(nums[i]+" ");
		}
	}
	public static void main(String args[]) {
		NextPermutation ob=new NextPermutation();
		//Scanner ip=new Scanner(System.in);
		int arr[]= {2,5,7,3,1,2,0,0};
		ob.nextPermutation(arr);
	}
}
/*
class Solution {
    public void nextPermutation(int[] nums) {
        String strn="",s="";
        for(int i=0;i<nums.length;i++){
            strn=strn+Integer.toString(nums[i]);
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            s=s+Integer.toString(nums[i]);
        }
        System.out.println("%%%%"+strn);
        int flag=0;
        permutation(s,"",flag,strn);
    }
    public static void permutation(String s,String ans,int flag,String strn){
        //base case
        //System.out.println(flag);
        if(s.length()==0){           
            //if(ans.compareTo(strn)==0){
            System.out.println(ans);
            return;
        }

        //kaam
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String str=s.substring(0,i)+s.substring(i+1);            
            permutation(str,ans+ch,flag,strn);                       
        }
        //return 0;
    }
}
*/
