package Predefinedclass;

class Demo
{
	void display()
	{
		System.out.println("I am display");
	}
	
}
public class Objectclass1 extends Demo
{
	 static int last_roll=200;
	    int roll_no;
	    
	    	//Constructor
	    Objectclass1()
	    {
	    	roll_no = last_roll;
	    	last_roll++;
	    }
	    		
	     // Driver code	
	public static void main(String[] args) 
	{
		Objectclass1 a=new Objectclass1();
		System.out.println(a);
		System.out.println(a.toString());
		System.out.println(a.hashCode());
        Demo s=new Demo();
        System.out.println(s);
        System.out.println(s.toString());
        System.out.println(s.hashCode());
        Demo s1=new Objectclass1();
        System.out.println(s1);
        System.out.println(s1.hashCode());

	}

}
/*static int last_roll = 100;
int roll_no;

// Constructor
ObjectClass()
{
    roll_no = last_roll;
    last_roll++;
}

// Driver code
//public static void main(String args[]) {
	ObjectClass s = new ObjectClass();

	// Below two statements are equivalent
	System.out.println(s);//s.toString() -->string representation of an object
	System.out.println(s.toString());//string representation of an object
	Demo d1=new Demo();
	System.out.println(d1);
	System.out.println(d1.toString());		
	Demo d2=new ObjectClass();
	System.out.println(d2);
}*/