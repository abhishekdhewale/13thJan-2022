package Opps;

// Super class or Parent class
class vehicle
{
	public void wheels()
	{
		System.out.println("I'm vehicle and I have wheels");
	}
}
//Child or Sub class of vehicle class
class bike extends vehicle
{
	public void countwhl()
	{
		System.out.println("I'm bike and I have two wheels");
	}
}
//Child or Sub class of vehicle class
class car1 extends vehicle
{
	public void countwhlc()
	{
		System.out.println("I'm car and I have four wheels");
	}
}
//Child or Sub class of vehicle class
class scooter extends vehicle
{
	public void countwhls()
	{
		System.out.println("I'm scooter and I have two wheels");
	}
}
public class Inheritance4 
{

	public static void main(String[] args) 
	{
      bike a1=new bike();
      a1.wheels();
      a1.countwhl();
      System.out.println("*************************");
      car1 s1=new car1();
      s1.wheels();
      s1.countwhlc();
      System.out.println("***************************");
      scooter z1=new scooter();
      z1.wheels();
      z1.countwhls();
      
      
      
      
	}

}
