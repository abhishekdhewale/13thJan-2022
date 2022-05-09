package Blocks;

public class Block3
{
      //Non Static block or IIB
	int age;
	static
	{
		System.out.println("Running non static block1 of class block3");
	}
	static 
	{
		System.out.println("Running non static block2 of class block3");
	}
	
	{
		 age =12;
		System.out.println("age:" + age);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main() Starts");
        Block3 a1= new Block3();
        System.out.println("**************");
        Block3 a2= new Block3();
        a2.age=13;
        System.out.println("Age:" + a2.age);
        System.out.println("Program Starts");
        Block3 a3= new Block3();
        System.out.println("Age:" + a3.age);
        Block3 a4= new Block3();
        System.out.println("Age:" +a4.age);
        System.out.println("Program Ends");
        
	}

}
