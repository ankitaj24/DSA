package returning_passing_ob;

public class GFG {

    // MAin driver method

    public static void main(String args[])

    {

        

        ObjectPassDemo ob1 = new ObjectPassDemo(100, 22);

        ObjectPassDemo ob2 = new ObjectPassDemo(100, 22);

        ObjectPassDemo ob3 = new ObjectPassDemo(-1, -1);
 

        

        System.out.println("ob1 == ob2: "

                           + ob1.equalTo(ob2));

        System.out.println("ob1 == ob3: "

                           + ob1.equalTo(ob3));

    }
}
