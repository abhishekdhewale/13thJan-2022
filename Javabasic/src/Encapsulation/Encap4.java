package Encapsulation;

class Account
{
	private long ssn;
	private String Name;
	private String empid;
	private float amount;
	//Getter Method 
	public long getAccountno()
	{
		return ssn;
	}
	public String getName()
	{
		return Name;
	}
	public String getemp()
	{
		return empid;
	}
	public float getAmount()
	{
		return amount;
	}
	//Setter Method
	public void setAccountno(long newvalue)
	{
		ssn = newvalue;
	}
	public void setName(String newname)
	{
		Name=newname;
	}
	public void setemp(String newempid)
	{
		empid = newempid;
	}
	public void setAmount(float newvalue)
	{
		amount = newvalue;
	}
}
public class Encap4
{

	public static void main(String[] args)
	{
		// creating instance of Account class
				Account acc = new Account();
				 //setting values through setter methods
				acc.setAccountno(7560504000L);
				acc.setName("Sonoo Jaiswal");
				acc.setemp("absc@gmail.com");
				acc.setAmount(500000f);
				// getting values through getter methods
				System.out.println(acc.getAccountno());
				System.out.println(acc.getName());
				System.out.println(acc.getemp());
				System.out.println(acc.getAmount());

	}

}
