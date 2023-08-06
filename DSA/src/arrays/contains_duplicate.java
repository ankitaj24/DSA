package arrays;
import java.util.*;
public class contains_duplicate {
	public static void main(String args[]) {
		try (Scanner ip = new Scanner(System.in)) {
			int arr[]=new int[ip.nextInt()];
			for(int i=0;i<arr.length;i++) {
				arr[i]=ip.nextInt(); 
			}
			HashMap<Integer,Integer> map=new HashMap<>();
			for(int i=0;i<arr.length;i++) {
				if(!map.containsKey(arr[i])) {
					map.put(arr[i], 0);
				}
				else {
					System.out.println("true");
					return;
				}
					
			}
			System.out.println("false");
			ip.close();
		}
	}
}
/*
Arrays.sort(arr);
for(int i=0;i<arr.length;i++)
	System.out.print(arr[i]+" ");
System.out.println();
for(int i=0;i<arr.length-1;i++) {
	System.out.println(arr[i]+" "+arr[i+1]);
	if(arr[i]==arr[i+1]) {
		System.out.println("true");
		return;
	}
}
System.out.println("false");
*/