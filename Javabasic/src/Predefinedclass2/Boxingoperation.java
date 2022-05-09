package Predefinedclass2;

public class Boxingoperation 
{

	public static void main(String[] args) 
	{
		char s1='A';
		
        Character charobj=new Character(s1);
        System.out.println(s1==charobj);
        Character charobj1=new Character('Z');
        
        Character charobj2='D';
         
        System.out.println("s1:" + s1);
        System.out.println("charobj:" + charobj);
        System.out.println("charobj1:" + charobj1);
        System.out.println("charobj2:" + charobj2);
        
        boolean b=true;
        Boolean bobj=new Boolean(b);
        System.out.println(b);
        System.out.println(bobj==b);
        System.out.println(bobj.equals(b));
	}

}
/*char c1='A';

Character charObj1=new Character(c1);// boxing
System.out.println(c1==charObj1);
Character charObj2=new Character('Z');

Character charObj3='H';// boxing

System.out.println("c1: "+c1);
System.out.println("charObj1: "+charObj1);
System.out.println("charObj2: "+charObj2);
System.out.println("charObj3: "+charObj3);

boolean b=true;
Boolean bObj=new Boolean(b);
System.out.println(bObj==b);*/