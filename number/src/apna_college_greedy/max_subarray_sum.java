package apna_college_greedy;

public class max_subarray_sum {
	public static int ans=Integer.MAX_VALUE;
	public static void solve(int arr[],int n,int k,int index,int sum,int maxsum) {
		//base condition
		if(k==1) {
			maxsum=Math.max(maxsum, sum);
			sum=0;
			for(int i=index;i<n;i++) {
				sum=sum+arr[i];
			}
			//System.out.print("****"+sum);
			maxsum=Math.max(maxsum, sum);
			//System.out.print(" "+maxsum);
			ans=Math.min(ans, maxsum);
			System.out.println(" "+ans);
			return;
		}
		
		sum=0;
		for(int i=index;i<n;i++) {
			sum=sum+arr[i];
			//System.out.print("("+arr[i]+" "+sum+")");
			maxsum=Math.max(maxsum,sum);
			//System.out.println(" "+maxsum);
			solve(arr,n,k-1,i+1,sum,maxsum);
		}
	}
	public static void main(String args[]) {
		int arr[]= {1,2,3,4};
		int k=3;
		int n=4;
		solve(arr,n,k,0,0,0);
		//System.out.println(ans);
	}
}
