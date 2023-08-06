package apna_college_divide_nd_conquer;

public class inversion_count {
	public static int mergesort(int arr[],int si,int ei) {
		//base case
		int count=0;
		//kaam
		if(si<ei) {
			int mid=si+((ei-si)/2);
			count+= mergesort(arr,si,mid);
			count+= mergesort(arr,mid+1,ei);
			count+=merge(arr,si,mid,ei);
		}
		return count;
	}
	public static int merge(int arr[],int si,int mid,int ei) {
		int count=0;
		int temp[]=new int[ei-si+1];
		int i=si,j=mid+1,k=0;
		while(i<=mid&&j<=ei) {
			if(arr[i]<=arr[j]) {
				temp[k++]=arr[i++];			
			}
			else {
				temp[k++]=arr[j++];
				count+=(mid+1-i);
			}
		}
		while(i<=mid)
			temp[k++]=arr[i++];
		while(j<=ei)
			temp[k++]=arr[j++];
		
		for(k=0,i=si;i<=ei;k++,i++) {
			arr[i]=temp[k];
		}
		
		return count;
	}
	public static void main(String args[]) {
		int arr[]={5,3,2,4,1};
		System.out.println(mergesort(arr,0,arr.length-1));
	}
}
