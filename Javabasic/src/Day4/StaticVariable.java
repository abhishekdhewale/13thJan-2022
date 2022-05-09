package Day4;

public class StaticVariable {
     static long mobilenum=123;
     static double salary=50000;
     static char id='A';
	public static void main(String[] args) {
		System.out.println("Program Starts");
		System.out.println("SGV: " + mobilenum);       //without standard  Syntax
		System.out.println("SGV:" + salary);
		System.out.println("SGV:" + id);
		System.out.println("SGV with standard:" + StaticVariable.mobilenum);    //with standard
		System.out.println("SGV with standard:" + StaticVariable.salary);
		System.out.println("SGV with standard:" + StaticVariable.id);
		System.out.println("*******************************************");
		mobilenum=456;
		salary=2000;
		id='B';
		System.out.println("SGV: " + mobilenum);
		System.out.println("SGV: " + salary);
		System.out.println("SGV: " + id);
		System.out.println("SGV with standard: " + StaticVariable.mobilenum);
		System.out.println("SGV with standard: " + StaticVariable.salary);
		System.out.println("SGV with standard: " + StaticVariable.id);
		double salary=1000;
		char id='D';
        System.out.println("local variable: " + salary);
        System.out.println("local variable: " + id);
        System.out.println("SGV with standard: " + StaticVariable.mobilenum);
        System.out.println("Program Ends");
	}

}
