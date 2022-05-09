package Pack1;

public class Defaultaccess0 
{

	public static void main(String[] args) 
	{
		Default d1=new Default();
		 System.out.println("Accessing Default Members from another class within the same package");
		 System.out.println(d1.accnum);
		 d1.displayaccNum();

		 Default d12=new Default();
		    System.out.println(d1.accnum);
	        d1.displayaccNum();
	}

}
