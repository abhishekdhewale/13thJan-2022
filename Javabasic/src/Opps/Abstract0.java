package Opps;

abstract class Animal
{
	public abstract void animalsound();
	public void sleep()
	{
		System.out.println("aaa");
	}
}
class Pig extends Animal
{
	public void animalsound()
	{
		System.out.println("The pig says: wee wee");
	}
	
}
class cat extends Animal
{
	public void animalsound()
	{
		System.out.println("The cat says: mau mau");
	}
}
public class Abstract0 
{

	public static void main(String[] args) 
	{
		Pig p1=new Pig();
		p1.animalsound();
		p1.sleep();
		cat c1=new cat();
		c1.animalsound();
		c1.sleep();
	

	}

}
