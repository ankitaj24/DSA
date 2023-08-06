package apna_college_arraylist;
import java.util.*;
public class lonely_no {
	public static void main(String args[]) {
		ArrayList<Integer> list=new ArrayList<>();
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		for(int i=0;i<n;i++) {
			int a=ip.nextInt();
			list.add(a);
		}
		Collections.sort(list);
		System.out.println(list);
		if(n!=1) {
		for(int i=0;i<list.size();i++) {
			int x=list.get(i);
			int flag=0;
			if(i==0){
				int z=list.get(i+1);
				if(x==z||z==x-1||z==x+1)
					flag=1;
			}
			else if(i==n-1) {
				int y=list.get(i-1);
				if(x==y||y==x-1||y==x+1)
					flag=1;
			}
			else if(i-1>=0&&i+1<n){
				int y=list.get(i-1);
				int z=list.get(i+1);
				if(x==y||x==z||y==x-1||z==x-1||y==x+1||z==x+1)
					flag=1;
			}
			if(flag==0)
				System.out.println(x+" ");
		}}
		else
			System.out.println(list.get(0));
		ip.close();
	}
}
