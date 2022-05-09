package pack2;

public class Accesspublicmembers0 
{

	public static void main(String[] args) 
	{
		//using fully qualified class name: packagename.classname
				Pack1.PublicMembers0 p1=new Pack1.PublicMembers0();
				System.out.println("Accessing Default members from another class outside package");
				System.out.println(p1.accnum);
				p1.displayaccnum();
		
		
		}

}
