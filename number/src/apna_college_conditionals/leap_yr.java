package apna_college_conditionals;
import java.util.*;
public class leap_yr {
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		int yr=ip.nextInt();
		if(((yr%4==0)&&(yr%100!=0))||(yr%400==0))
			System.out.println("LEAP");
		else
			System.out.println("NOT LEAP");
		ip.close();
	}
}
