package Overloading;

public class overloading1
{
	static double res;
	public static void circle() {
		System.out.println("Zero parameter method called");
	}
	public static void circle(int num) {
		res = num + num;
		System.out.println("Method with integer argument called" + res);
	}
	public static void circle(double num) {
		res = num*num;
		System.out.println("Method with double argument called" + res);
	}

	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		overloading1.circle();
		overloading1.circle(10);
		overloading1.circle(2.5);
		System.out.println("Program Ends");
		}
		

	}

/*
 * Method Overloading: any method declare more than once in class body with
 * anyone of below rules: 
 * 1. type of argument differ or 
 * 2. number of arguments/parameter should differ or 
 * 3. position of arguments/parameter should differ
 */
