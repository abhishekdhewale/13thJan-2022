package Day4;

public class Final {

	public static void main(String[] args) {
		final int empId=123;
		System.out.println("EmpId: "+empId);//123
		//empId=456;//error at compile time as final variable value can't be changed
		System.out.println("EmpId: "+empId);//456
		//empId=789;//error at compile time as final variable value can't be changed
		System.out.println("EmpId: "+empId);//789
		//empId=654;//error at compile time as final variable value can't be changed
		System.out.println("EmpId: "+empId);//654

	}

}

/*final int empId=123;
System.out.println("EmpId: "+empId);//123
//empId=456;//error at compile time as final variable value can't be changed
System.out.println("EmpId: "+empId);//456
//empId=789;//error at compile time as final variable value can't be changed
System.out.println("EmpId: "+empId);//789
//empId=654;//error at compile time as final variable value can't be changed
System.out.println("EmpId: "+empId);//654
}
}

final: is keyword
: constant or fixed
: variable should be declared final at the declaration time
: once its value is initiliazed that value can not be changed
: final variable needs to be initiliaze at the time of declaration
*/