package Thisprogram;

public class this1
{
     this1 ()
     {
    	
    	 System.out.println("Zero Parameter");
     }
     this1(int age)
     {
    	this();
    	 System.out.println("one Parameter");
     }
     this1(double num1 , char S)
     {
    	 this(25);
    	 System.out.println("two Parameter");
     }

	public static void main(String[] args) 
	{
		//this1 s1=new this1();
		//this1 s3=new this1(25);
	this1 s2=new this1(20.25,'F');
	}
}
/*
 * this()--> 
 * 			this statement is an instance of current class which is declared inside ths constuctor body 
 * 			its should be first statement inside the constructor body
 * 			its used to call another constructor of the same class based on parameter. 
 * 
 */