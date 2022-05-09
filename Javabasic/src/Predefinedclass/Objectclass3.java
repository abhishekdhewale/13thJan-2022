package Predefinedclass;

public class Objectclass3 
{
	static int last_roll =400;
	int roll_no;
	//COnstructor
	 Objectclass3 ()
	 {
		    roll_no = last_roll;
		    last_roll++;

	 }
	@Override
	public String toString()
	{
		return "BasicCoreJava";
	}
    //Driver code
	public static void main(String[] args) 
	{
		Objectclass3 a=new Objectclass3 ();
		// Below two statements are equivalent
        System.out.println(a);
        System.out.println(a.toString());
	}

}
/*static int last_roll = 100;
int roll_no;

// Constructor
ObjectClass3()
{
    roll_no = last_roll;
    last_roll++;
}
@Override
public String toString()
{
    return "BasicCoreJava";
}

// Driver code
public static void main(String args[]) {
	ObjectClass3 s = new ObjectClass3();

	// Below two statements are equivalent
	System.out.println(s);
	System.out.println(s.toString());
}

}*/