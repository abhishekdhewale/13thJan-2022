package Opps;

class A
{
	static int a= 10;
	int b= 20;
	double c= 250.20;
}
class B
{
	static int p=30;
	int q=40;
	double r=50.25;
}
class C
{
	static int l=60;
	int m=70;
	double n=15.30;
}
public class Inheritance0
{
   
	public static void main(String[] args) 
	{
		//******Access Static member from class A members******
         System.out.println("Class A static variable:" + A.a);
        //******Access Static member from class B members******
         System.out.println("Class B static variable:" + B.p);
        //******Access Static member from class C members******
         System.out.println("Class C static variable:" + C.l);
         System.out.println("**************************************");
        //Access Non Static member from class A members*****
         A a1=new A();
         System.out.println("Class A Non static variable:" + a1.b);
         System.out.println("Class A Non static variable:" + a1.c);
        //Access Non Static member from class B members*****
         B b1=new B();
         System.out.println("Class B Non static variable:" + b1.q);
         System.out.println("Class B Non static variable:" + b1.r);
         //Access Non Static member from class C members*****
         C c1=new C();
         System.out.println("Class C Non static variable:" + c1.m);
         System.out.println("Class C Non static variable:" + c1.n);
	}

}
