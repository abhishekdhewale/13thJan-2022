package Condition;

public class Allthreecondition1 
{
      // Creating program for subject (Marathi,English,History,Hindi)
	public static void main(String[] args)
	{
		// Condition 1st (if else)
		int Marathi=50,English=40,History=60,Hindi=70;
		if (Marathi>=40 && English>=40 && History>=40 && Hindi>=40) 
		{
           System.out.println("Pass.........");
		}
		else
			 System.out.println("Fail.........");
		{
		if (Marathi>=35 && English>=35 && History>=35 && Hindi>=35)  
		{
			System.out.println("Pass......");
		}
		else
			System.out.println("fail..........");
		{
		if (Marathi>=50 && English>=50 && History>=50 && Hindi>=50)
		{
			System.out.println("Pass......");
		}
		else 
			System.out.println("Fail........");
		{
		if (Marathi>=30 && English>=30 && History>=30 || Hindi>=30) 
		{
			System.out.println("Pass......");
		}	
		else 
			System.out.println("Fail........");
		}
	}
		
}		
}
}