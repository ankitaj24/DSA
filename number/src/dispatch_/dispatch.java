package dispatch_;

class Dispatch{
public static void main(String args[])
{
A a=new A();
B b=new B();
A ref;
ref=a;
ref.m1();
ref=b;
ref.m1();
}}
