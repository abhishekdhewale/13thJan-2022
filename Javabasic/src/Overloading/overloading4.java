package Overloading;
    
class adder {
	static int demo(int a,int b) {
	return a+b;
}
    static int demo(int a ,int b ,int c) {
    	return a+b+c;
    }
}
public class overloading4 
{
    static void demo () {
    	System.out.println("I am display Method");
    }
	public static void main(String[] args)
	{
		System.out.println("Sum" + adder.demo(20,30));
        System.out.println("sum:" + adder.demo(10,20,30));
        System.out.println("*****************************");
        
        overloading4.demo();
	}

}
