package Opps;

class a1
{
	void s1()
	{
		System.out.println("**********");
	}
}
class a2 extends a1
{
	void s2()
	{
		System.out.println("///////////");
	}
}
class a3 extends a2
{
	void s3()
	{
		System.out.println("@@@@@@@@@@@");
	}
}
public class Overriding6 
{

	public static void main(String[] args) 
	{
		a1 d1=new a3();

	}

}
