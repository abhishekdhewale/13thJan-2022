package Pack1;

public class Default 
{
     int accnum=123;
     void displayaccNum()
     {
    	 System.out.println("Account no:" + accnum);
     }
	public static void main(String[] args) 
	{
	    Default d1=new Default();
	    System.out.println(d1.accnum);
        d1.displayaccNum();
	}

}
class Accesdefaultmembers
{
	public static void main(String[] args)
	{
		 Default d1=new Default();
		 System.out.println("Accessing Default Members from child class");
		 System.out.println(d1.accnum);
		 d1.displayaccNum();
	}
}
