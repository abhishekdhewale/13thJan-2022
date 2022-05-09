package Opps;
//Base Class or parent class or Super class
class Parent
{
	void show()
	{
		System.out.println("Parent shoe");
	}
}
//Inherited class or child class or sub class
class child1 extends Parent
{
	// This method overrides show() of Parent
	@Override
	void show()
	{
		System.out.println("Child Show");
	}
}
//Driver Class
public class Overriding4 
{

	public static void main(String[] args) 
	{
		// If a Parent type reference refers to a Parent object, then Parent's show is called
		Parent p1=new Parent();
		p1.show();
		// If a Parent type reference refers to a Child object Child's show() is called. This is called RUN TIME
				// POLYMORPHISM.
        Parent p2=new child1();
        p2.show();
	}

}
