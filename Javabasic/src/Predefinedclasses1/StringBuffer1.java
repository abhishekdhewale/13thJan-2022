package Predefinedclasses1;


public class StringBuffer1 
{

	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("Hello "); 
		System.out.println("Original StringBuffer value: "+s1);//Hello 
		s1.append("Java");    //now original string is changed     
		System.out.println(s1);//Hello Java
        s1.insert(6, "Pune");//now original string is changed  
        System.out.println(s1);//Hello PuneJava
        System.out.println("********************");
        s1.replace(1, 3, "XXX");
        System.out.println(s1);//HXXXo PuneJava
        s1.replace(3, 7, "AAAA");
        System.out.println(s1);//HXXAAAAPuneJava
        System.out.println("************************");
        s1.delete(1, 3);
        System.out.println(s1);//HAAAAPuneJava
        s1.delete(2, 5);       
        System.out.println(s1);//HAPuneJava
        System.out.println("***************************");
        StringBuffer s2 = new StringBuffer("Cricket is my Life");
        s2.reverse();//efil ym si tekcric
        System.out.println(s2);
        System.out.println("***********************");
        StringBuffer s3 = new StringBuffer();//
        System.out.println(s3.capacity());//default 16 
        s3.append("Hello");
        System.out.println(s3.capacity());//Now 16 
        s3.append("Java is my favorite language");
        System.out.println(s3.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
        s3.append("I ma from Automation area");
        System.out.println(s3.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
        
        
        
	}

}
/*StringBuffer sb=new StringBuffer("Hello "); 
System.out.println("Original StringBuffer value: "+sb);//Hello 
sb.append("Java");//now original string is changed  
System.out.println(sb);//Hello Java  
sb.insert(5,"Pune");//now original string is changed  
System.out.println(sb);//  

sb.replace(1,3,"XXX"); //
System.out.println(sb);//prints   

sb.delete(1,4);  //
System.out.println(sb);//

StringBuffer s1=new StringBuffer("Bangalore is known for IT");
s1.reverse();  
System.out.println(s1);//
System.out.println("*********************************************");
StringBuffer s2=new StringBuffer();
System.out.println(s2.capacity());//default 16  
s2.append("Hello");  
System.out.println(s2.capacity());//now 16  
s2.append("java is my favorite language");  
System.out.println(s2.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
s2.append("I am from automation area");  
System.out.println(s2.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
}
}*/