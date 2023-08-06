package apna_college_heaps_PQ;
import java.util.*;
public class Test {
	class Student implements Comparable<Student>{
		int roll;
		String name;
		Student(int roll,String name){
			this.name=name;
			this.roll=roll;
		}
		@Override
		public int compareTo(Student s2) {
			return this.roll-s2.roll; 
		}
	}
	public static void main(String args[]) {
		Test ob=new Test();
		PriorityQueue<Student> pq=new PriorityQueue<>();
		Scanner ip=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			String str=ip.nextLine();
			int roll=ip.nextInt();
			ip.nextLine();
			pq.add(ob.new Student(roll,str));
		}
		while(!pq.isEmpty()) {
			System.out.println(pq.peek().name+" "+pq.peek().roll);
			pq.remove();
		}
		ip.close();
	}
}
