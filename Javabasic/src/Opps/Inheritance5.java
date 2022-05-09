package Opps;

//super class/ parent class / base class
class Grandfather 
{
	 Grandfather()
	 {
		 System.out.println("I am class grandfather constructor");
	 }
	 void myhome()
	 {
		 System.out.println("I am home of grandfather");
	 }
}

//subclass / child class / derived class
class father extends Grandfather
{
	father(double d)
	{
		super();// if we dont wirte this dn java compiler will write by default super()
		System.out.println("I am class Father constructor");
	}
	void mycar()
	{
		System.out.println("I am car of Father");
	}
}

class child extends father
{
	child(int i)
	{
		super(25.25);
		System.out.println("I am class of child constructor");
	}
	void mybike()
	{
		System.out.println("I am bike of child");
	}
}
public class Inheritance5 
{

	public static void main(String[] args) 
	{
		child c1=new child(20);//home,car,bike
		c1.myhome();
		c1.mycar();
		c1.mybike();
		System.out.println("***********************");
		// creating an object or instance of child most class and referred by its parent
		father f1=c1;//Father f2 = new Child1(21); home, car but bike will not be visible/accessible to father
		f1.mycar();
		f1.myhome();
		System.out.println("*********************************");
		// creating an object or instance of child most class and referred by its parent
		Grandfather g1=f1;//Grandfather g2=new Child1(20); home but car & bike will not be visible/accessible to Grandfather
		g1.myhome();
		System.out.println("*****************************");
		Grandfather g2=new father(25.25);
		g2.myhome();
		
		
		
	}

}


