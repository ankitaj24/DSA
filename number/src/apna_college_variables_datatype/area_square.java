package apna_college_variables_datatype;
import java.util.*;
public class area_square {
	void cal(int s)
	{
		System.out.println("Area="+s*s);
	}
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the side: ");
		int s=ip.nextInt();
		area_square ob=new area_square();
		ob.cal(s);
		ip.close();
	}
}
