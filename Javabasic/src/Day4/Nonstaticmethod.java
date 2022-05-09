package Day4;

public class Nonstaticmethod 
{

	public static void main(String[] args) {
		    
		System.out.println("Program Starts");
		Nonstaticmethod x1= new Nonstaticmethod();
		double sum=x1.addition(23,56);
		System.out.println("addition is:" +sum);
		System.out.println("*******************************************");
		x1.addition2(23,78);
		System.out.println("*******************************************");
		System.out.println("addition1:" + x1.addition1(98,89));
		
		
		
		
	}

	
   private int addition( int num1, int num2) {
      return num1+num2;
      
      }
        
      private int addition1( int num1, int num2) {
          int res=num1+num2;
          return res;
      }
          private void addition2( int num1, int num2) {
              int res=num1+num2;
              System.out.println("Addition is:" + res);
      
      
      
      
   }
}