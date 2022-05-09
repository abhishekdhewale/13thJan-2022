package Predefinedclasses1;

public class StringBuilder1 
{

	public static void main(String[] args) 
	{
		StringBuilder s1 = new StringBuilder("Hello");
		s1.append("Java");
		System.out.println(s1);//Hello Java
		s1.reverse();
		System.out.println(s1);//avaJ olleH
		StringBuilder s2 = new StringBuilder("Hello Java");
		System.out.println(s2);
		StringBuilder s3 = new StringBuilder("Hello Java");
		System.out.println(s3);
		System.out.println(s2.equals(s3));
		System.out.println((s2==s3));
		//We don't have any method in StringBuffer and StringBuilder to compare object values, so to overcome that
		//first convert StringBuffer/StringBuilder to String class using toString()
		// dn use equals() of string class
		System.out.println((s2.toString().equals(s3.toString())));
		
	}

}
/*StringBuilder sb=new StringBuilder("Hello ");  
sb.append("Java");//now original string is changed  
System.out.println(sb);//prints Hello Java 
sb.reverse();
System.out.println(sb);//prints Hello Java 
StringBuilder sb1=new StringBuilder("Hello Java");
System.out.println(sb1);
StringBuilder sb2=new StringBuilder("Hello Java");
System.out.println(sb2);
System.out.println(sb1.equals(sb2));//address basis comparison
System.out.println(sb1==sb2);//address basis comparison
//We don't have any method in StringBuffer and StringBuilder to compare object values, so to overcome that
//first convert StringBuffer/StringBuilder to String class using toString()
// dn use equals() of string class
System.out.println((sb1.toString().equals(sb2.toString())));
}
}*/