package Opps;

abstract class bike1
{
	abstract void run();
	void speed(int spd)
	{
		System.out.println("Bike speed:" + spd);
	}
}
class honda4 extends bike1
{
	void run()
	{
		System.out.println("running safely");
	}
	void speed(int spd) {
		System.out.println("honda4 speed:" + spd);
		super.speed(100);
	}
	void colour()
	{
		System.out.println("Honda1 colour is red");
	}
	
}

public class Abstract2 
{

	public static void main(String[] args) 
	{
		honda4 h1=new honda4();
		h1.colour();
		h1.speed(200);
		h1.run();
		System.out.println("********************");
        bike1 b1=new honda4();
        b1.run();
        b1.speed(300);
       
	}

}
/*abstract class Bike1 {
	abstract void run();
	void speed(int spd) {
		System.out.println("Bike speed: "+spd);
	}
}
class Honda4 extends Bike1 {
	void run() {
		System.out.println("running safely");
	}
	void speed(int spd) {
		System.out.println("Honda4 speed: "+spd);
		super.speed(120);
	}
	void color() {
		System.out.println("Honda1 color is blue");
	}
}
class abstractClass1{
	public static void main(String args[]) {
		Honda4 obj = new Honda4();
		obj.run();
		obj.speed(60);
		obj.color();		
		//Bike1 b1=new Bike1();
		Bike1 b2=new Honda4();
		b2.run();
		b2.speed(20);
		//b2.color();
	}*/