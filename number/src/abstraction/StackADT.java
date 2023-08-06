package abstraction;
import java.util.Stack;

public class StackADT {

	public static void main(String[] args) {
		Stack<Student> obj = new Stack<>();
		storeStudentInStack(obj);
		displayStoreDataFromStack(obj);
	}
	private static void displayStoreDataFromStack(Stack<Student> obj) {
		Student st1 = obj.pop();
		System.out.println(st1.getName());
		System.out.println(st1.getCgpa());
		System.out.println(st1.getRollNo());
		System.out.println(st1.getSex());
		System.out.println();
		
		Student st2 = obj.pop();
		System.out.println(st2.getName());
		System.out.println(st2.getCgpa());
		System.out.println(st2.getRollNo());
		System.out.println(st2.getSex());
		System.out.println();
		
		Student st3 = obj.pop();
		System.out.println(st3.getName());
		System.out.println(st3.getCgpa());
		System.out.println(st3.getRollNo());
		System.out.println(st3.getSex());
		System.out.println();
		
	}
	private static void storeStudentInStack(Stack<Student> obj) {
		Student st1 = new Student("Vinay", "Male", 16, 8);
		obj.push(st1);
		Student st2 = new Student("Ankit", "Male", 17, 10);
		obj.push(st2);
		Student st3 = new Student("Akash", "Male", 18, 9);
		obj.push(st3);
		
	}

}
class Student {
	private String name, sex;
	private int rollNo, cgpa;
	Student(String name, String sex, int rollNo, int cpga){
		this.cgpa = cpga;
		this.sex = sex;
		this.rollNo = rollNo;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String getSex() {
		return sex;
	}
	public int getRollNo() {
		return rollNo;
	}
	public int getCgpa() {
		return cgpa;
	}
}