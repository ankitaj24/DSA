package apna_college_variables_datatype;
import java.util.*;
public class cost {
	void cal(float pencil,float pen,float eraser)
	{
		float totcost=pencil+pen+eraser;
		totcost=totcost+(0.18f *totcost);
		System.out.println("Cost="+totcost);
	}
	public static void main(String args[])
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the price of pencil,pen,eraser respectively: ");
		float pencil=ip.nextFloat();
		float pen=ip.nextFloat();
		float eraser=ip.nextFloat();
		cost ob=new cost();
		ob.cal(pencil, pen, eraser);
		ip.close();
	}
}
