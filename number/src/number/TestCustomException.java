package number;

public class TestCustomException {
	public static void main(String[] s) {
		try {
			throw new MyCustomException();
		}
		catch(MyCustomException ex)
		{
			System.out.println("CAUGHT THE EXCEPTION");
		}
		System.out.println("rest of the code");
	}
}
class MyCustomException extends Exception{
	
}
