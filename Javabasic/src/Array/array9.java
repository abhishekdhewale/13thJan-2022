package Array;

import java.util.Arrays;

public class array9 
{

	public static void main(String[] args) 
	{
		int a=10,b=20,c=30;
		/**
		 * datatype[] arrayName;
		 * arrayName = new datatype[size];
		 * 		//or
		 * datatype[] arrayName = new datatype[size];
		 * 		//or
		 * datatype[] arrayName={, , , , }'
		 */
		int[] num=new int[3];
        num[0]=10;
        num[1]=20;
        num[2]=30;
        
        int[] num1 = {10,20,30,};
        System.out.println("array element count:" + num1.length);
        System.out.println("index 1 element or 2 element:" + num[1]);
        System.out.println("Printing all the element of array...");
        for (int i=0; i<num1.length; i++)
        {
        	System.out.println(num1[i]);
        }
        System.out.println("****************************");
        int[] num2=Arrays.copyOf(num1, 5);
        System.out.println("size of num2:" + num2.length);
        for (int i=0; i<num2.length; i++)
        {
        	System.out.println("element in index" +i+ ":" + num2[i]);
        }
        num2[3]=40;
        num2[4]=50;
        System.out.println("*****************************");
        for (int i=0; i<num2.length;i++)
        {
        	System.out.println(num2[i]);
        }
        num2[1]=500;
        num2[2]=600;
        System.out.println("******updated value");
        for (int i=0; i<num2.length; i++)
        {
        	System.out.println(num2[i]);
        }
	}

}
//int a=10,b=20,c=30;

/**
 * datatype[] arrayName;
 * arrayName = new datatype[size];
 * 		//or
 * datatype[] arrayName = new datatype[size];
 * 		//or
 * datatype[] arrayName={, , , , }'
 */
/*int[] num=new int[3];
num[0]=10;
num[1]=20;
num[2]=30;

int[] num1= {10,20,30};
System.out.println("array elements count: "+num1.length);
System.out.println("index 1 element or 2nd element: "+num[1]);
System.out.println("Printing all the elements of the array....");
for(int i=0;i<num1.length;i++) {
	System.out.println(num1[i]);
}
System.out.println("**************************");
int[] num2=Arrays.copyOf(num1, 5);
System.out.println("size of num2 : "+num2.length);
for(int i=0;i<num2.length;i++) {
	System.out.println("element in index "+i+": "+num2[i]);
}
num2[3]=40;
num2[4]=50;
System.out.println("********************");
for(int i=0;i<num2.length;i++) {
	System.out.println(num2[i]);
}
num2[1]=505;
num2[2]=101;
System.out.println("********updated values************");
for(int i=0;i<num2.length;i++) {
	System.out.println(num2[i]);
}*/