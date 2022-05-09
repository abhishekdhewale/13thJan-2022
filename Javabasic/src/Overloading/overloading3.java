package Overloading;

public class overloading3 
{
     public void square() {
    	 System.out.println("No parameter");
     }
     public void square(int num1) {
    	int square= num1*num1;
    	 System.out.println("Method with integer parameter" + square);
     }
     public void square(float num1) {
    	 float square = num1*num1;
    	 System.out.println("Method with float parameter" + square);
     }
	public static void main(String[] args) 
	{
		overloading3 a1= new overloading3();
		a1.square();
		a1.square(20f);
		a1.square(50);
		
	}

}
