package Opps;
//Super class or Parent class
class  A1
{
	A1()
	{
		
	}
	static int a=10;
	int b=20;
	double c=20.20;
}
// Sub class or Parent class
class B1 extends A1
{
	B1()
	{
		super ();
	}
	
	static int p=30;
	int q=40;
	double r=30.30;
}
//Sub class or Child class
class C1 extends B1
{
	C1()
	{
		super();
	}
	
	static int l=50;
	int m=60;
	double n=60.60;
}

public class Inheritance1
{

	public static void main(String[] args) 
	{
		//******Access static member from A class members*****
		System.out.println("Class A static variable:" + A1.a);
		//******Access static member from B class members*****
		System.out.println("Class A static variable:" + B1.p);
		//******Access static member from C class members*****
		System.out.println("Class A static variable:" + C1.l);
		
		System.out.println("*****************************");
		C1 s1=new C1();
		System.out.println("With Class C1 refer:" + s1.m);
		System.out.println("With Class C1 refer:" + s1.n);
		System.out.println("With Class C1 refer:" + s1.q);
		System.out.println("With Class C1 refer:" + s1.r);
		System.out.println("With Class C1 refer:" + s1.b);
		System.out.println("With Class C1 refer:" + s1.c);
		
		System.out.println("***********************");
		B1 d1=new B1();
		System.out.println("With Class B1 refer:" + d1.q);
		System.out.println("With Class B1 refer:" + d1.r);
		System.out.println("With Class B1refer:" + d1.b);
		System.out.println("With Class B1 refer:" + d1.c);
		
		
	}

}
