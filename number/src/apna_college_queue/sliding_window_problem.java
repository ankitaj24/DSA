package apna_college_queue;
import java.util.*;
//1 2 3 1 4 5 2 3 6
public class sliding_window_problem {
	public static void cal(int arr[],int k) {
		Deque<Integer> q=new LinkedList<>();
		int i=0,j=0,count=0;
		int n=arr.length;
		int ans[]=new int[arr.length-(k-1)];
		while(j<=n-1) {
			if(q.isEmpty())
				q.addFirst(j);
			else {
				while(!q.isEmpty()&&arr[j]>arr[q.peekLast()]) {
					q.removeLast();
					//System.out.println("1");
				}
				q.add(j);
			}
			//System.out.println(q);
			if(j-i+1<k)
				j++;
			else if(j-i+1==k) {
				//answer
				//System.out.println(q);
				ans[count]=arr[q.peek()];
				//System.out.println(q.pop());
				count++;
				if(i==q.peek())
					q.removeFirst();
				j++;
				i++;
			}
				
		}		
		for(i=0;i<ans.length;i++)
			System.out.print(ans[i]+" ");
	}
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=ip.nextInt();
		}
		int k=ip.nextInt();
		cal(arr,k);
		ip.close();
	}
}
