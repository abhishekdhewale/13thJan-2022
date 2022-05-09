
public class A 
{
    int age=24;
    static double mobilenum =12.3;
	public static void main(String[] args) 
	{
	A x1= new A();
     System.out.println("Program Starts");
	 System.out.println("NSGV with Stndard: " + x1.age);
	 x1.age=12; 
	 System.out.println("NSGV with Stndard: " + x1.age);
	 System.out.println("SGV with Standard:" + A.mobilenum);
	 System.out.println("Program Ends");
	}
}
