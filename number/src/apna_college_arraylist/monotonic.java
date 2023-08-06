package apna_college_arraylist;
import java.util.*;
public class monotonic {
	public static boolean monotonic_check(ArrayList<Integer> list) {
		for(int i=0;i<list.size()-1;i++)
		{
			if(list.get(i)>list.get(i+1))
				return false;
		}
		return true;
	}
	public static void main(String args[]) {
		//Scanner ip=new Scanner(System.in);
		ArrayList<Integer> arr_li=new ArrayList<>();
		arr_li.add(1);
		arr_li.add(3);
		arr_li.add(2);
		arr_li.add(4);
		System.out.println(monotonic_check(arr_li));
//		for(int i=0;i<arr_li.size();i++)
//		{
//			System.out.println(arr_li.get(i)+" ");
//		}
	}
}
