package returning_passing_ob;


class ObjectReturnDemo {

    int a;
 

    // Constructor

    ObjectReturnDemo(int i) {
    	a = i;
	}
 

    // Method returns an object

    ObjectReturnDemo incrByTen()

    {

        ObjectReturnDemo temp

            = new ObjectReturnDemo(a + 10);

        return temp;

    }
}
 
