package Opps;

class fourwheeler
{
	//default constructor
	public void wheels()
	{
		System.out.println("I'm Four Wheels");
	}
}
class car extends fourwheeler
{
	//default constructor
	public void type()
	{
		System.out.println("I'm Car");
	}
}
class maruti extends car
{
	//default constructor
	public void company()
	{
		System.out.println("I'm Maruti");
	}
}
public class Inheritance3 
{

	public static void main(String[] args)
	{
      maruti a1=new maruti();
      a1.wheels();
      a1.type();
      a1.company();
     
      System.out.println("***************************");
      
      car s1=new car();
      s1.wheels();
      s1.type();
	}

}
