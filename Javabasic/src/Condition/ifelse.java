package Condition;

public class ifelse 
{

	public static void main(String[] args)
{
		int num1=45 , num2= 35;
		if (!(num1==num2)) {
		   System.out.println("Number1 is grater than number2");
     }else {
	       System.out.println("Number1 is smaller than number2");
		if (num1>num2) {
			System.out.println("Number1 is grater than number2");
     }else {   
    	 System.out.println("Number is smaller than number2");
	 }
      if (num1<num2) {
    	System.out.println("Number1 is grater tha number2");
      }else {
    	  System.out.println("Number1 is smaller than number2");
      }
      if (num1>=num2) {
    	  System.out.println("Number1 is either grater than number2 or equal than number2 ");
      }else {
    	  System.out.println("Number1 is either smaller than number2 or equal than number2 ");
      }
      if (num1==num2 || num1==num2) {
    	  System.out.println("Number1 is either grater than number2 or equal than number2 ");
      }else {
    	  System.out.println("Number1 is either smaller than number2 or equal than number2 ");
      }
      if (num1==num2 && num1==num2) {
      System.out.println("Number1 is either grater than number2 or equal than number2");
      }else {
    	 System.out.println("Number1 is smaller than number2");
      }	 
      System.out.println("**************************************************");
	  int sub1=35 , sub2=45 ;
	  if (sub1>35 && sub2>40) {
		  System.out.println("Pass....");
	  }else {
		  System.out.println("Fail....");
	  }
     }
}
}
	  
     
	

