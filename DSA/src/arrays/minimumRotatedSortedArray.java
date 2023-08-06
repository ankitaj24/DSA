package arrays;

public class minimumRotatedSortedArray {
	public static void main(String args[]) {
		//int arr[]= {4,5,6,7,0,1,2};
		int arr[]= {2,1};
		int si=0,ei=arr.length-1,mid;
		int min=Integer.MAX_VALUE;
		while(si<=ei) {
			mid=si+((ei-si)/2);
			//lie on the right side of the array
			if(arr[si]<=arr[mid]) {
				min=Math.min(arr[si], min);
				si=mid+1;
			}
			//lie on the left side
			else {
				min=Math.min(arr[mid], min);
				ei=mid-1;
			}
		}
		System.out.println("Min: "+min);
	}
}
