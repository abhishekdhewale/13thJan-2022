package Predefinedclass2;

public class Boxingprogram1 
{

	public static void main(String[] args) 
	{
		int age=25;
		System.out.println("Age:" + age);
        Integer intobj=new Integer(age);
        System.out.println("intobj:" + intobj);
        System.out.println(age==intobj);
        Integer intobj1=new Integer(50);
        System.out.println("intobj:" + intobj);
        System.out.println(age==intobj);
	}

}
/*int age=20;
System.out.println("Age: "+age);
Integer intObj1=new Integer(age);//explicit boxing operation
System.out.println("intObj1: "+intObj1);
System.out.println(age==intObj1);
Integer intObj2=new Integer(50);//explicit boxing operation
System.out.println("intObj2: "+intObj2);
Integer intObj3=30;//implicit boxing operation or auto boxing operation
System.out.println("intObj3: "+intObj3);
}*/