package apna_college_bits_manipulation;
import java.util.*;
public class power {
	void power_bit_manipulation(int base,int pow) {
		int ans=1;
		while(pow>0)
		{
			if((pow & 1)!=0) {
				ans=ans*base;				
			}
			base=base*base;
			pow=pow>>1;
		}
		System.out.println(ans);
		
	}
	public static void main(String args[]) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter base nd pow: ");
		int base=ip.nextInt();
		int pow=ip.nextInt();
		power ob=new power();
		ob.power_bit_manipulation(base,pow);
		ip.close();
	}
}
