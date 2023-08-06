package number;

import java.util.Scanner;

public class switch_case {
	void input() {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter 1 for sum, 2 for subtraction: ");
		int n=ip.nextInt();
		int a=ip.nextInt();
		int b=ip.nextInt();
		cal(n,a,b);
	}
	void cal(int n,int a,int b) {
		int sum=0,diff=0;
		switch(n) {
			case 1:
				sum=a+b;
				System.out.println(sum);
				break;
			case 2:
				diff=a-b;
				System.out.println(diff);
				break;
			default:
				System.out.println("Wrong input");
				break;
		}
	}
	public static void main(String args[]) {
		switch_case ob=new switch_case();
		ob.input();
		
	}
}
