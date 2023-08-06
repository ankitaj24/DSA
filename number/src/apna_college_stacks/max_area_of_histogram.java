package apna_college_stacks;

import java.util.Stack;
//area=next smaller right-next smaller left-1
public class max_area_of_histogram {
	public static void maxarea(int arr[]) {
		int max=0;
		int nsr[]=new int[arr.length];
		int nsl[]=new int[arr.length];
		Stack<Integer> s=new Stack<>();
		
		
		//next smaller right
		for(int i=arr.length-1;i>=0;i--) {
			while(!s.isEmpty()&&arr[s.peek()]>=arr[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				nsr[i]=arr.length;
				s.push(i);
			}
			else {
				nsr[i]=s.peek();
				s.push(i);
			}
		}
		
		//next smaller left
		s=new Stack<>();
		for(int i=0;i<arr.length;i++) {
			while(!s.isEmpty()&&arr[s.peek()]>=arr[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				nsl[i]=-1;
				s.push(i);
			}
			else {
				nsl[i]=s.peek();
				s.push(i);
			}
		}
		
		// cal max area
		for(int i=0;i<arr.length;i++) {
			int width=nsr[i]-nsl[i]-1;
			int height=arr[i];
			int area=height*width;
			max=Math.max(max, area);
		}
		System.out.print("max="+max);
	}
	public static void main(String args[]) {
		int arr[]= {2,1,5,6,2,3};
		
		//for cal next smaller right
		maxarea(arr);
	}
}
