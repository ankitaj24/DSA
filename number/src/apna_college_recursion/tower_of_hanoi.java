package apna_college_recursion;
import java.util.*;
public class tower_of_hanoi {
	public static void hanoi(int n,String src,String hlp,String des) {
		//base case
		if(n==1) {
			System.out.println("Transfer of disk "+n+" from source "+src+" to "+des);
			return;
		}
		hanoi(n-1,src,des,hlp);
		System.out.println("Transfer of disk "+n+" from source "+src+" to "+des);
		hanoi(n-1,hlp,src,des);
	}
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=ip.nextInt();
		hanoi(n,"S","H","D");
		ip.close();
	}
}
