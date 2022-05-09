package Blocks;

public class Block2 
{
	//static block1 or SIB.
  static 
  {
	  System.out.println("Running static Block1 of class block2");
  }
 // static block2 or SIB.
  static 
  {
	  System.out.println("Running static Block2 of class block2");
  }
	public static void main(String[] args) 
	{
		System.out.println("Main() Starts");
		System.out.println("I am main Block2 class");
		System.out.println("Main() Ends");
		
	}

}
