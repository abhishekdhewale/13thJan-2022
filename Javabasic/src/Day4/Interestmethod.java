package Day4;

public class Interestmethod 
{
      
	public static void main(String[] args) 
	{
		System.out.println("Interest:" + interest(2000,1.5,24));
	    System.out.println("Interest1:" + Interestmethod.interest(2000,1.5,24));
	    System.out.println("*********************************");
		Interestmethod.interest2(2000, 1.2, 24);                                          // void calling
		System.out.println("*********************************");
		System.out.println( Interestmethod.interest(2000,1.5,24));
		

	}
    public static double interest(int p,double r, int t ) {
    	return p*r*t/100;
    	
    		
    }
    	 public static double interest1(int p,double r, int t ) {
    	    	double res=p*r*t/100;
    	    	return res;
    	 }  	
    	    	
    	    	
    	    	 public static void interest2(int p, double r, int t ) {
    	    	    	double res=p*r*t/100;
    	    	    	System.out.println("Interest is:" + res);
    	
    }
}
