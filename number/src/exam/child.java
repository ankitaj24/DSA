package exam;

public class child extends parent{
	public void name() {
		System.out.println("Tanusri Roy");
	}
	public static void branch() {
		System.out.println("CS");
	}
	public static void main(String args[]) {
		parent ob=new child();
		ob.name();
		ob.branch();
		child ob1=new child();
		ob1.name();
		ob1.branch();
		parent ob2=new parent();
		ob2.name();
		ob2.branch();
	}
}
