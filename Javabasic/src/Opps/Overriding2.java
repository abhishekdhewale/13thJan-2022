package Opps;

class Human 
{
	// Overridden method
	public void eat()
	{
		System.out.println("Human is eating");
	}
}
class Boy extends Human
{
	// Overridden method
	public void eat() 
	{
		System.out.println("Boy is eating");
	}
}
public class Overriding2 
{

	public static void main(String[] args) 
	{
		Boy b1=new Boy();
		b1.eat();		
			 
		Human h1=new Boy();
		h1.eat();

	}

}
/*class Human {
	// Overridden method
	public void eat() {
		System.out.println("Human is eating");
	}
}
class Boy extends Human {
	// Overriding method
	public void eat() {
		System.out.println("Boy is eating");
	}
}
class Overriding3 {
	public static void main(String args[]) {
		Boy obj = new Boy();
		obj.eat();
	}
}*/