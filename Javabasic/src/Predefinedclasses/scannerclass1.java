package Predefinedclasses;

import java.util.Scanner;


public class scannerclass1 
{

	public static void main(String[] args) 
	{
		String s = "hello this is basic java";
		// Create scanner Object and pass string in it
		Scanner scan =new Scanner(s);
		// Check if the scanner has a token
		System.out.println("Boolean Result:" + scan.hasNext());		
		// Print String
		System.out.println("String:" + scan.nextLine());
		scan.close();		
		System.out.println("--------Enter Your Details-------- ");
		Scanner a=new Scanner(System.in);
		System.out.println("Enter u r Name: ");
		String name = a.next();
		System.out.println("Name:" + name);
		System.out.println("**********************************");
		System.out.println("Enter u r Age: ");
		String age = a.next();
		System.out.println("Age:" + age);
		System.out.println("**********************************");
		System.out.println("Enter u r Salary: ");
		String d= a.next();
		System.out.println("Salary:" + d);
		a.close();
	}

}
/*String s = "Hello, This is BasicJava.";
// Create scanner Object and pass string in it
Scanner scan = new Scanner(s);
// Check if the scanner has a token
System.out.println("Boolean Result: " + scan.hasNext());
// Print the string
System.out.println("String: " + scan.nextLine());
scan.close();
System.out.println("--------Enter Your Details-------- ");
Scanner in = new Scanner(System.in);
System.out.print("Enter your name: ");
String name = in.next();
System.out.println("Name: " + name);
System.out.print("Enter your age: ");
int i = in.nextInt();
System.out.println("Age: " + i);
System.out.print("Enter your salary: ");
double d = in.nextDouble();
System.out.println("Salary: " + d);
in.close();
}
}*/