package apna_college_conditionals;
import java.util.*;
public class days_of_week {
	void cal(int choice)
	{
		switch(choice) 
		{
			case 1:
				System.out.println("SUNDAY");
				break;
			case 2:
				System.out.println("MONDAY");
				break;
			case 3:
				System.out.println("TUESDAY");
				break;
			case 4:
				System.out.println("WEDNESDAY");
				break;
			case 5:
				System.out.println("THURSDAY");
				break;
			case 6:
				System.out.println("FRIDAY");
				break;
			case 7:
				System.out.println("SATURDAY");
				break;
			default:
				System.out.println("WRONG CHOICE");
		}
	}
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		days_of_week ob=new days_of_week();
		ob.cal(ip.nextInt());
		ip.close();
	}
}
