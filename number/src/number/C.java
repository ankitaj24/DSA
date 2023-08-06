package number;

class C extends B
{
	public void methodC(){
		System.out.println("Child C ");
	}
	public static void main(String args[])
	   {
	     C obj = new C();
	     obj.methodA(); //calling super class method
	     obj.methodB(); //calling local method
	     obj.methodC();
	  }
}
