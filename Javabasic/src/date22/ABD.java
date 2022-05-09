package date22;

public class ABD 
{
    static int loginID = 123;
    double Salary = 25000;
    static {
    	System.out.println("welcome to Baramati");
    }
    {
    	System.out.println("Welcome to Vidhrabha");
    }
    
    public void print() 
    {
    	int a=1;
    	do 
    	{
    		System.out.println(a);
    		a++;
    	}
    	while (a<=5);
    	int m=5;
    	while (m<=10) 
    	{
    		System.out.println(m);
    		m++;
    		
    	}
    
        }
      public static int Print1(int res)
      {
    	 
    	 
    	  if (res %2==0)
    	  {
    		System.out.println("The no is Even:" + res);
    	  }
    	  else 
    	  {
    		  System.out.println("The no is Odd:" + res);
    	  }
    	  return res;
      }
	public static void main(String[] args) 
	{
	  System.out.println("Program Starts");
	  System.out.println("SGV with Standard:" + ABD.loginID);
	  ABD m1 = new ABD ();
	  System.out.println("Non static global variable:" + m1.Salary);
	  System.out.println("Program Ends");
	  System.out.println("**************************************");
	  ABD a= new ABD();
	  a.print();
	  ABD.Print1(10);
	}

}
