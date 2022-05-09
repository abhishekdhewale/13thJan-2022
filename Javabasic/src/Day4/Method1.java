package Day4;


public class Method1 
{

	public static void main(String[] args) 
	{
		
		double sum=addition(25,43);
		System.out.println("Addition is:" + sum);                          //Step1
		sum =addition(98,67);                                           
		System.out.println("Addition is:" + sum);
		System.out.println("********************************************");
		System.out.println(addition(12,34));                              // without standard        Step2
		System.out.println(Method1.addition(56,88));                      //with standard
		System.out.println("********************************************");
		Method1.addition2(23,45);                                             //Step3    
		System.out.println("********************************************");
        double res=Method1.addition(23,45);
	    res= res*25;
		System.out.println("New Value:" + res);
	
		
	}
	
	
	
	
	
     public static double addition(double num1, double num2) {
    	 double res = num1+num2;
    	 return res;
     }
    		 
    	 
    	 public static void addition2(double num1, double num2) {
        	                           //Step3
    			double sum= num1+num2;
    		   	 System.out.println("Addition is:" + sum); 
    				
    	 
    	 
     }
}
