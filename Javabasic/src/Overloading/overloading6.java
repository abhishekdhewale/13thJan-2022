package Overloading;

public class overloading6 
{
    void abd(int num1) 
    {
    	System.out.println("zero para");
    }
    void abd(int num1 , char a)  
    {
    	System.out.println("Two para");
    }
    void abd(int num1 , char a , float num2) 
    {
    	System.out.println("Three para");
    }
    void abd(int x ,int y)  
    {
    	
    	System.out.println("Four para");
    
    }
    
    
	public static void main(String[] args)  
	{
		 overloading6 s1 = new  overloading6 ();
         s1.abd(10);
	}

}
