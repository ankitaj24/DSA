package apna_college_array;
import java.util.*;
public class trapping_rainwater {
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the no. of elements: ");
		int n=ip.nextInt();
		int height[]=new int[n];
		int leftmax[]=new int[n];
		int rightmax[]=new int[n];
		for(int i=0;i<n;i++)
			height[i]=ip.nextInt();
		leftmax[0]=height[0];
		rightmax[n-1]=height[n-1];
		for(int i=1;i<n;i++) {
			if(height[i]>leftmax[i-1])
				leftmax[i]=height[i];
			else
				leftmax[i]=leftmax[i-1];
		}
		for(int i=n-2;i>=0;i--)
		{
			if(height[i]>rightmax[i+1])
				rightmax[i]=height[i];
			else
				rightmax[i]=rightmax[i+1];
		}
		int width=1;
		for(int i=0;i<n;i++)
			System.out.print(leftmax[i]+" ");
		System.out.println();
		for(int i=0;i<n;i++)
			System.out.print(rightmax[i]+" ");
		System.out.println();
		int tot=0;
		for(int i=0;i<n;i++)
		{
			int trappedwater=(Math.min(leftmax[i], rightmax[i])-height[i])*width;
			tot=tot+trappedwater;
		}
		System.out.println("Tot: "+tot);
		ip.close();
		
	}
}
