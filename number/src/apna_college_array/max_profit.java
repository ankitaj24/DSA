package apna_college_array;
import java.util.*;
public class max_profit {
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=ip.nextInt();
		int prices[]=new int[n];
		for(int i=0;i<n;i++)
		prices[i]=ip.nextInt();
		int ans=cal(prices);
		System.out.println("MAX PROFIT: "+ans);
		ip.close();
	}
	public static int cal(int prices[]) {
		int max=0;
		int price=prices[0];
		int sum=0;
		for(int j=1;j<prices.length;j++)
		{
			if(prices[j]>price)
			{
				sum=prices[j]-price;
				if(sum>max)
					max=sum;
				
			}
			else
				price=prices[j];
			
		}		
		return max;
	}
}
