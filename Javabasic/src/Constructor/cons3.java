package Constructor;
     //Constructor with Method.
public class cons3 
{
	int age ;
	long salary;
	cons3()
	{
		
	}
    int rollno =123;
    int num1 = 10;
    void ABD ()
    {
    	System.out.println(rollno + " " + num1);
    }
	public static void main(String[] args) 
	{
		cons3 a1=new cons3();
		System.out.println("Age:" + a1.age);
		System.out.println("Salary:" + a1.salary);
	    cons3 a2=new cons3();
	    a2.ABD();
}
}