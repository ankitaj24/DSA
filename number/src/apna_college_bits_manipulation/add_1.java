package apna_college_bits_manipulation;
import java.util.*;
public class add_1 {
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter n: ");
		int a=ip.nextInt();
		System.out.println((-(~a)));
		ip.close();
	}
}
