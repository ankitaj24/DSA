package apna_college_arraylist;
import java.util.*;
public class beautiful_arraylist {
	public static ArrayList<Integer> beautiful(int n) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		for(int i=2;i<=n;i++) {
			ArrayList<Integer> temp=new ArrayList<>();
			for(int k=0;k<list.size();k++) {
				int e=list.get(k);
				//System.out.println("e1="+e);
				if(2*e<=n)
					temp.add(2*e);
			}
			for(Integer e:list) {
				//System.out.println("e2="+e);
				if(2*e-1<=n)
					temp.add(2*e-1);
			}
			//System.out.println("temp="+temp);
			//System.out.println("list="+list);
			list=temp;//copying elements of temp to list 
			//System.out.println("list="+list);
				
		}
		return list;
		
	}
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
		int n=ip.nextInt();
		//ArrayList<Integer> list=new ArrayList<>();
		//int arr[]=new int[n];
		//String s="";
		//for(int i=0;i<n;i++)
			//list.add(i+1);
		//System.out.println(list);
		System.out.print(beautiful(n));
		ip.close();
	}
}
