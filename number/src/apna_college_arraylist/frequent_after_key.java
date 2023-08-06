package apna_college_arraylist;
import java.util.*;
public class frequent_after_key {
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		int n=ip.nextInt();
		for(int i=0;i<n;i++) {
			int a=ip.nextInt();
			list.add(a);
		}
		System.out.println(list);
		int key=ip.nextInt();
		int max=Integer.MIN_VALUE;
		int no=0;
		int result[]=new int[1000];
		for(int i=0;i<n-1;i++) {
			int x=list.get(i);
			if(x==key) {
				int y=list.get(i+1);
				result[y-1]++;
			}
		}
		for(int i=0;i<1000;i++)
		{
			if(result[i]>max) {
				max=result[i];
				no=i+1;
			}
		}
		
		if(no==0)
			System.out.println("null");
		else
			System.out.println(no);
		ip.close();
	}
}
