package Predefinedclass;

public class Objectclass2 
{
	static int last_roll=300;
	int roll_no;
	
	//Constructor
	Objectclass2()
	{
		roll_no=last_roll;
		last_roll++;
	}
	@Override
	public int hashCode()
	{
		return roll_no;
	}
	
	//Driver Code
	public static void main(String[] args) 
	{
	     Objectclass2 a=new Objectclass2();
	     
	  // Below two statements are equivalent
	     System.out.println(a);
	     System.out.println(a.toString());
	     System.out.println(a.hashCode());
	     
	}

}
/*static int last_roll = 100;
int roll_no;

// Constructor
ObjectClass2()
{
    roll_no = last_roll;//100
    last_roll++;//101
}
@Override
public int hashCode()
{
    return roll_no;
}

// Driver code
public static void main(String args[]) {
	ObjectClass2 s = new ObjectClass2();

	// Below two statements are equivalent
	System.out.println(s);
	System.out.println(s.toString());
	System.out.println(s.hashCode());
}

}*/