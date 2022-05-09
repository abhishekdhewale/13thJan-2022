package Opps;
class ABC {
	public void myMethod() {
		System.out.println("method of ABC class");
	}
}
public class Overriding3 extends ABC
{
	public void myMethod() {
		// This will call the myMethod() of parent class
		super.myMethod();
		System.out.println("Overriding method of Class Overriding4");
	}
	public static void main(String[] args) 
	{
		Overriding3 obj = new Overriding3();
		obj.myMethod();
	}

}
