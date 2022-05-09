package Opps;

class animal2
{
	public void move()
	{
		System.out.println("Animals can move");
	}
}
class dog1 extends animal2
{
	public void move()
	{
		// This will call the move method() of parent class
		super.move();
		System.out.println("Dogs can walk and run");
	}
}
public class Overriding1 
{

	public static void main(String[] args)
	{
		animal2 a1=new dog1();
		a1.move();

	}

}
