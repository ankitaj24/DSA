package number;

public class car extends bike{
	@Override
	void run() {
		System.out.println("car is running");
	}

	public static void main(String args[])
	{
		car ob=new car();
		ob.run();
	}
}