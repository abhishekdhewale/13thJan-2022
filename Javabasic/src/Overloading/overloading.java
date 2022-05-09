package Overloading;

public class overloading
{
     static int addnumber() {
    	 int  num1= 10 ,num2=20;
       return  num1+num2;
     }
     static int addnumber(int num1,int num2) {
    	 return num1+num2;
     }
     static int addnumber(int num1,int num2,int num3) {
    	 return num1+num2+num3;
     }
     static double addnumber(double num1, float num2, int num3) {
    	 return num1+num2+num3;
     }
	public static void main(String[] args)
	{
		System.out.println("Program Starts");
		System.out.println("Sum" + addnumber());
		System.out.println("Sum" + addnumber(20,30));
		System.out.println("Sum" + addnumber(20,50,60));
		System.out.println("Sum" + overloading.addnumber(22.5,25f,80));
	}

}
