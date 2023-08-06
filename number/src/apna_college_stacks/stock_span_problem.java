package apna_college_stacks;
import java.util.*;
public class stock_span_problem {
	public static void cal(int stocks[]){
		int span[]=new int[stocks.length];
		span[0]=1;
		Stack<Integer> s=new Stack<>();
		s.push(0);
		for(int i=1;i<span.length;i++) {
			while(!s.isEmpty()&&stocks[i]>stocks[s.peek()]) {
					s.pop();
			}
			span[i]=i-s.peek();
			s.push(i);				
		}
		for(int i=0;i<span.length;i++)
			System.out.print(span[i]+" ");
	}
	public static void main(String args[]) {
		int stocks[]= {100,80,60,70,60,85,100};
		cal(stocks);
	}
}
