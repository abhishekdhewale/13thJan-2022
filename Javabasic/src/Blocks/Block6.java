package Blocks;

public class Block6
{
      //age and salary
	static int age;
	long salary;
	static{
         age=24;
	}
	
	{
		salary=25000;
	}
	public static void main(String[] args)
	{
	  System.out.println("Program Starts");
	  System.out.println("Age:" + Block6.age);
	  Block6 a1=new Block6();
	  System.out.println("Salary:" + a1.salary);
	  System.out.println("Program Starts");
}
}