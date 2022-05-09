package Constructor;
       // Overloading with constructor.
public class cons2
{
     cons2 ()
     {
    	 System.out.println("This a zero parameterized contructor");
     }
     cons2 (int num1)
     {
    	 System.out.println("This a int type parameterized constructor");
     }
     cons2(int num1 , double num2)
     {
    	 System.out.println("This a int and double type parameterized constructor");
     }
     cons2(char ABD)
     {
    	 System.out.println("This a char type parameterized constructor");
     }
     cons2(double salary ,boolean Id)
     {
    	 System.out.println("This a double and boolean type parameterized constructor");
     }
     cons2(double num1, char S ,boolean num3)
     {
    	 System.out.println("This a double,char and boolean parameterized constructor");
     }
	public static void main(String[] args)
	{
		System.out.println("Program Starts");
		cons2 a1=new cons2();
		cons2 a2=new cons2(50000,123);
		cons2 a3=new cons2(10);
		cons2 a4=new cons2(10,60000);
		cons2 a5=new cons2('A');
		cons2 a6=new cons2(700000,456);
		System.out.println("Program Ends");
		


}
}

/*
 * Constructor Overloading: more than on constructor in a class 
 * Rule: 1. type of args differ or 
 * 		 2. number of args differ or 
 * 		 3. position of args differ
 */
 
