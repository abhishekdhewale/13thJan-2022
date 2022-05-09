package Overloading;
  class demo
  {
	  public void adder() 
	  {
		  System.out.println("one parameter");
	  }
	  public void adder(char a)
      {
		  System.out.println(a);
	  }
	  public void adder(char a , int num)
      {
		  System.out.println(a + "" + num );
	  }
	  public void callme()
      {
		  System.out.println("Call me method ");
	  }
	  
 }

public class overloading5
{
      public double dis(double num1 , double num2) 
      {
    	  double result = num1+num2;
    	  System.out.println("Sum" + result);
    	  return result;
    	 
      }
      public int dis( int num1 , int num2)
      {
    	  int result = num1 - num2;
    	  System.out.println("Sum" + result);
    	  return result;
      }
	public static void main(String[] args)
	{
		demo a1=new demo();
		a1.adder();
		a1.adder('c');
        a1.adder('b',100);
        System.out.println("*************");
        overloading5 a2 = new  overloading5();
        a2.dis(25.25, 20.20);
        a2.dis(25,20);
	}

}
