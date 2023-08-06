package apna_college_queue;
/*1->10->100
 * |  |_>101
 * |_>11->110
 *     |_>111
 */
import java.util.*;
public class dec_to_bin {
	public static void cal(int n) {
		Queue<Integer> q=new LinkedList<>();
		StringBuilder sb=new StringBuilder();
		q.add(1);
		int count=1;
		System.out.print(q.peek()+" ");
		while(count<=n-1) {
			int no=q.remove();
			sb.append(no);
			System.out.print(sb.append("0")+" ");
			q.add(Integer.parseInt(sb.toString()));
			++count;
			if(count<n) {
				sb.setLength(0);
				sb.append(no);
				System.out.print(sb.append("1")+" ");
				q.add(Integer.parseInt(sb.toString()));
				sb.setLength(0);
				count++;
			}
		}
	}
	public static void main(String args[]) {
		cal(9);
	}
}
