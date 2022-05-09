package Opps;

class animal 
{
	public void move()
	{
		System.out.println("Animals can move");
	}
}

class dog extends animal
{
	public void move()
	{
		System.out.println("Dogs can walk and run");
	}
	public void bark()
	{
		System.out.println("Dogs can bark");
	}
}
public class Overriding0 
{

	public static void main(String[] args) 
	{
		animal a1=new animal();// Animal reference and object
		a1.move();
		dog d1=new dog(); // Animal reference but Dog object
		d1.bark();// runs the method in Dog class
        d1.move();// runs the method in Dog class
        System.out.println("*******************************");
        animal a2=new dog();
        a2.move();// you will get dog class move(), bark()
      //a1.bark(); // a1 compile time error since b's reference type Animal doesn't
      
	}

}

