package Opps;
//Super class or parent class
class fruit 
{
    fruit()
	{
		System.out.println("Fruit class cons");
	}
    public void taste()
    {
    	System.out.println("Fruit are sweet");
    }
}
//Sub class or child class of Fruit 
class apple extends fruit
{
	apple()
	{
		//super(); //java compiler will write default super()
		System.out.println("Apple class cons");
	}
	public void shape()
	{
		System.out.println("Apple is round");
	}
	
}
	public class Inheritance2 
{

	public static void main(String[] args) 
	{
		apple a1=new apple();
		a1.taste();
		a1.shape();
	}

}
