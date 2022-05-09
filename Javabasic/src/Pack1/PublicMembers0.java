package Pack1;


public class PublicMembers0 
{
     public int accnum=1234;
     public void displayaccnum()
     {
    	 System.out.println("Account No:" + accnum);
     }
	public static void main(String[] args) 
	{
		PublicMembers0 p1=new PublicMembers0();
		System.out.println(p1.accnum);
		p1.displayaccnum();
	}

}
class Accesspublicmemebers
{
	public static void main(String[] args) 
	{
		PublicMembers0 p1=new PublicMembers0();
		System.out.println("Accessing Default members from child class");
		System.out.println(p1.accnum);
		p1.displayaccnum();
	}
}
/*public class PublicMembers {

	public int accNum=12345;
	public void displayAccNum() {
		System.out.println("Account Number: "+accNum);
	}
	public static void main(String[] args) {
		
		PublicMembers p1=new PublicMembers();
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}
class AccessPublicMembers {

	public static void main(String[] args) {
		
		PublicMembers p1=new PublicMembers();
		System.out.println("Accessing Default members from child class");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}
}*/