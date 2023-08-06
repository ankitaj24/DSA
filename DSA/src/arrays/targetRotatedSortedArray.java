package arrays;

public class targetRotatedSortedArray {
	public static void main(String args[]) {
		int arr[]= {4,5,6,7,0,1,2};
		int target=0;
		int si=0;
		int ei=arr.length-1,mid;
		while(si<=ei) {
			mid=si+((ei-si)/2);
			if(arr[mid]==target) {
				System.out.println("Successful");
				return;
			}
			//in case of duplicates elements
			if(arr[si]==arr[mid]&&arr[mid]==arr[ei]){
				si+=1;
				ei-=1;
				continue;
			}
			//otherwise
			//lie on line 1
			if(arr[si]<=arr[mid]) {
				//case 1: if target is less than mid value and greater than arr[si]
				if(arr[si]<=target&&target<=arr[mid])
					ei=mid-1;
				else
					si=mid+1;				
			}
			else {
				//case 1: if target lies in between the mid and the arr[ei]
				if(arr[mid]<=target&&target<=arr[ei])
					si=mid+1;
				else
					ei=mid-1;
			}
		}
		System.out.println("Not successful");
	}
}
