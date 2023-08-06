package number;

class Student{
    int id;
    String name;
    int age;
    Student
    (int i, String n){
        id=i;
        name=n;
    }
    Student(int i,String n,int a){
        id=i;
        name=n;
        age=a;
    
    }
    void display(){
        System.out.println(id+""+name+""+age);
    }


    public static void main(String[] args){
        Student sa = new Student(50, "satish");
        Student s = new Student(100,"ajit", 25);
        sa.display();
        s.display();
    }

}