package apna_college_recursion;
//import java.util.*;
public class occurrence {
	public static void occurrence(int arr[],int index,int target)
	{
		//base case
		if(index==arr.length)
			return;
		
		//kaam
		if(arr[index]==target)
			System.out.print(index+" ");
		occurrence(arr,index+1,target);
		
	}
	public static void main(String args[])
	{
		int arr[]= {3,2,4,5,6,2,7,2,2};
		occurrence(arr,0,2);
	}
}
