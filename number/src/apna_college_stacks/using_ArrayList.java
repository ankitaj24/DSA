package apna_college_stacks;
import java.util.*;
public class using_ArrayList {
	static class Stack{
		static ArrayList<Integer> list=new ArrayList<>();
		public static boolean isEmpty() {
			return list.size()==0;
		}
		
		//push
		public static void push(int data) {
			list.add(data);
		}
		
		//pop
		public static int pop() {
			int top=list.get(list.size()-1);
			list.remove(list.size()-1);
			return top;
		}
		
		//peek
		public static int peek() {
			int top=list.get(list.size()-1);
			return top;
		}
	}
	public static void main(String args[]) {
		//Stack s=new Stack();
		Stack.push(1);
		Stack.push(2);
		Stack.push(3);
		while(!Stack.isEmpty()) {
			System.out.println(Stack.peek());
			Stack.pop();
		}		
	}
}
