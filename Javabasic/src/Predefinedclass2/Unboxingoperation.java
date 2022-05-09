package Predefinedclass2;

public class Unboxingoperation {
	

	public static void main(String[] args) 
	{
		Double doubleobj=25.2500;//autoboxing
		System.out.println("doubleobj:" + doubleobj);
		//only boxed object can be unboxed
		double salary=doubleobj.doubleValue();
		System.out.println(salary);
		
		System.out.println(doubleobj==salary);
		System.out.println(doubleobj.equals(salary));
	}

}
/*Double doubleObj=25.2566;//autoboxing
System.out.println("doubleObj: "+doubleObj);
//only boxed object can be unboxed
double salary=doubleObj.doubleValue();//unboxing 
System.out.println(salary);

System.out.println(doubleObj==salary);*/