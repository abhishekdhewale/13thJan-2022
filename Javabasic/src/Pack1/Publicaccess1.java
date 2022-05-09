package Pack1;

public class Publicaccess1 
{

	public static void main(String[] args) 
	{
		PublicMembers0 p1=new PublicMembers0();
		System.out.println("Accessing Default members from another class within the same package");
		System.out.println(p1.accnum);
		p1.displayaccnum();

	}

}
