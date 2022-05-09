package Blocks;

public class Block4
{
   //Static block for SIB.
	static
	{
		System.out.println("Running static block1 of class block4");
	}
	// Non Static block for IIB. 
	{
		System.out.println("Running non static block2 of class block4");
	}
	public static void main(String[] args)
	{
		System.out.println("Program Starts");
        System.out.println("Welcome to Java");
        Block4 a1= new Block4();
        System.out.println("Welcome to Java Automation");
        System.out.println("Program Ends");
	}

}
