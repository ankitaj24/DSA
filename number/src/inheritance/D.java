package inheritance;

class D extends A
{
   public void disp()
   {
	System.out.println("D");
   }
   public static void main(String args[]){

	D obj = new D();
	obj.disp();
   }
}
