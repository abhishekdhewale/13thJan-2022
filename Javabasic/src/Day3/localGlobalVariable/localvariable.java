package Day3.localGlobalVariable;

public class localvariable {
    int age=24;
    double Salary =5000;
	public static void main(String[] args) {
	System.out.println("Program Starts");
	int age=24;
	System.out.println("age:" + age);
	double salary =4000;
	System.out.println("Salary:" + salary);
	System.out.println("*****************************************");
	localvariable a1=new localvariable();
	localvariable s1=new localvariable();
	System.out.println("age:" + a1.age);
	System.out.println("Salary:"  + s1.Salary);
	System.out.println("*****************************************");
	a1.age=12;
	s1.Salary=1000;
	System.out.println("Age:"  + a1.age);
	System.out.println("Salary:"  + s1.Salary);
	System.out.println("Program Ends");
	}

}
