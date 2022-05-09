package Constructor;

public class cons1  
{
    int age =10;
     cons1()
     {
    	 
     }
    
	public static void main(String[] args)
	{
		
		cons1 a1=new cons1();
		System.out.println("Age:" + a1.age);

	}

}
/*constuctor is used to initilize instance members of the class, Contructor is similar to method but,
1. constuctor name should be same as classname
2. constuctor doesn't have return type and also not returns any value
3. constuctor gets called automatically when an instance/object of a class is created
4. being a programmer we can't call/executed constuctor based on our requirement
5. constuctor are 2 types
	a. default constuctor : written by java compiler
	b. user defined constuctor : written by programmer
		i. zero parameterized constuctor
		ii. parameterized constuctor*/	