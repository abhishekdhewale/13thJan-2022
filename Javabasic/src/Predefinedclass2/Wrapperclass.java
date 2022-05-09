package Predefinedclass2;

public class Wrapperclass
{

	public static void main(String[] args) 
	{
		int a=30;
		//Converting int into Integer 
		Integer s=new Integer(a);//converting int into Integer explicitly
		Integer s1=new Integer(20);//converting int into Integer explicitly
		Integer s2=a;//autoboxing, now compiler will write Integer.valueOf(a) internally
		System.out.println(" a:" + a + " s:" + s +  " s1:" + s1 +  " s2:" + s2);		

		System.out.println("**********Unboxing of boxed object*****");
		//Converting Integer to int    
		Integer a2=new Integer(4);
		int x1=a2.intValue();//converting Integer to int explicitly 
		System.out.println(" a2:" + a2 + " x1:" + x1);
		
		System.out.println("a2==x1:" + (a2==x1));
		System.out.println("a2.equalx(x1):" + a2.equals(x1));//
	}

}
/**
* Wrapper class is a predefined class in java belongs to java.lang package
* its used to convert primitive type to object type 
* 			-----> boxing operation ---> implicitly or auto-boxing
* converting back the boxed object into primitive type is known as 
* 			-----> un-boxing operation ---> explicitly or manual boxing
* 
* in wrapper class toString() & equlas & '==' are overrided
* 
* 
* 
*/ 
/*int a=20;  
//Converting int into Integer  
Integer k=new Integer(a);//converting int into Integer explicitly
Integer l=new Integer(20);//converting int into Integer explicitly
Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
System.out.println("a: "+a+"\nk: "+k+"\nl: "+l+"\nj: "+j);  

System.out.println("***Unboxing of boxed object*****");
//Converting Integer to int    
Integer a1=new Integer(3);   
int i1=a1.intValue();//converting Integer to int explicitly  
System.out.println("a1: "+a1+"\ni1: "+i1); 

System.out.println("a1==i1 : "+(a1==i1));
System.out.println("a1.equals(i1) : "+a1.equals(i1));
}

}

/**
* Wrapper class is a predefined class in java belongs to java.lang package
* its used to convert primitive type to object type 
* 			-----> boxing operation ---> implicitly or auto-boxing
* converting back the boxed object into primitive type is known as 
* 			-----> un-boxing operation ---> 
* 
* in wrapper class toString() & equlas & '==' are overrided
* 
* 
* 
*/ 