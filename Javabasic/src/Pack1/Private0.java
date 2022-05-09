package Pack1;

public class Private0 
{
	private int accnum=1234;
	private void dispalyaccNum()
	{
		System.out.println("Account no:" + accnum);
	}

	public static void main(String[] args) 
	{
		Private0 p3=new Private0();
		System.out.println(p3.accnum);
        p3.dispalyaccNum();
	}

}
/*class AccessPrivateMembers2 {

public static void main(String[] args) {
	
	//Private0 p3=new Private0();
	//System.out.println(p3.accnum);
	//p3.displayaccNum();

}
}*/
