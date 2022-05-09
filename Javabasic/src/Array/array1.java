package Array;

public class array1 
{

	public static void main(String[] args) 
	{
		//Create an Array
		int[] age= {1,2,3,4,5};
		//Access each array element
		System.out.println("Access all element");
        System.out.println("First element of Array:" + age[0]);
	    System.out.println("Second element of Array:" + age[1]);
	    System.out.println("Third element of Array:"+ age[2]);
	    System.out.println("Fourth element of Array:" + age[3]);
	    System.out.println("Fifth element of Array:" + age[4]);
	    System.out.println("Array Size:" + age.length);
	    System.out.println("*****Using for loop*****");
	    for (i = 0; i<age.length; i++)
	    {
	    	System.out.println(age[i]);
	    	if (age[i]==30) {
	    	System.out.println(age[i]);	
	    	break;
	    }
	    	else
	    	{
	    		System.out.println("age is not 30");
	    	}
	    System.out.println("****Using for-each loop***");
	    for(int a : age) 
	    {
	    	System.out.println(a);
	        if(a==30)
	        {
	        	System.out.println(a);
	        	break;
	        }
	        else
	        	{
	        		System.out.println("age is not 30");
	        	}
	        }
	    	
	    }
	    
	    
	    
	    
	}

System.out.println(age[i]);
//if(age[i]==25) {
//System.out.println(age[i]);
//break;
//}else {
//	System.out.println("age is not 25");
//}
}
System.out.println("************Using for-each Loop:");
for (int a : age) {
System.out.println(a);
//if(a==25){
//System.out.println(a);
//break;
//}else {
//	System.out.println("age is not 25");