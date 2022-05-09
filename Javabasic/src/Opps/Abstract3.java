package Opps;

abstract class shape
{
	abstract void draw();
}
class rectangle extends shape
{
	protected void draw()
	{
		System.out.println("Drawing rectangle");
	}
}
class circle extends shape
{
	public void draw()
	{
		System.out.println("Drwaing circle");
	}
}
public class Abstract3 
{

	public static void main(String[] args) 
	{
		shape s1=new rectangle();
		s1.draw();
		shape s2=new circle();
		s2.draw();
		circle c1=new circle();
		c1.draw();
	}

}
