package returning_passing_ob;

//Class 2
//Main class

public class GFG1 {


 // Main driver method

 public static void main(String args[])

 {


     // Creating object of class1 inside main() method

     ObjectReturnDemo ob1 = new ObjectReturnDemo(2);

     ObjectReturnDemo ob2;


     ob2 = ob1.incrByTen();


     System.out.println("ob1.a: " + ob1.a);

     System.out.println("ob2.a: " + ob2.a);

 }
}