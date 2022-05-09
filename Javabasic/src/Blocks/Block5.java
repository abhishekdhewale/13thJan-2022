package Blocks;

public class Block5
{
    static 
    {
    	System.out.println("Running static block1 of class block5");
    }
    {
    	System.out.println("Running non static block1 of class block5");
    }
    static 
    {
    	System.out.println("Running static block2 of class block5");
    }
    {
    	System.out.println("Running non static block2 of class block5");
    }
	public static void main(String[] args)  
	{
		System.out.println("Program Starts");
		System.out.println("***************");
		Block5 a1= new Block5();
		System.out.println("***************");
		System.out.println("Program Ends");
	}

}
