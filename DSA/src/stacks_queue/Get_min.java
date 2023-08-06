package stacks_queue;
import java.util.*;
public class Get_min {
	public static void main(String args[]) {
		try(Scanner ip=new Scanner(System.in)){
		Stack<Integer> s=new Stack<>();
		int min=Integer.MAX_VALUE;
		int choice;
		do{
			System.out.println("Enter 1 for push, 2 for pop, 3 for getMin, 4 for exit: ");
			choice=ip.nextInt();			
			switch(choice) {
				case 1:
					System.out.println("Enter the value to be pushed: ");
					int val=ip.nextInt();
					if(s.size()==0) {					
						s.push(val);
						min=val;
					}
					else {
						if(val>=min) {
							s.push(val);
						}
						else {
							int dummy_val=(2*val)-min;
							s.push(dummy_val);
							min=val;
						}
					}
					System.out.println(s);
					break;
				case 2:
					if(s.size()==0) {					
						System.out.println("Underflow");
					}
					else {
						int del=s.pop();
						
						if(del>=min) {
							System.out.println("Deleted value: "+del);
						}
						else if(del<min) {
							System.out.println("Deleted value: "+(2*min-del));
							min=2*min-del;
						}
					}
					break;
				case 3:
					System.out.println(getMin(min,s));
					break;
				}
			}while(choice!=4);
		}
	}
	public static int getMin(int min,Stack<Integer> s) {
		if(s.size()==0)
			return -1;
		return min;
	}
}
