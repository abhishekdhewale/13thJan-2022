package Array;

class testreturnarray
{
	// creating method which returns an array	
	static int[] getarray() 
	{
//		int num[]=new int[3];
//		num[0]=10;
//		num[1]=13;
//		num[2]=15;
//		return num; //or
		return new int [] { 10,20,30,40,50};
	}
	static int getnum()
	{
		//num=10+30;
		return (10+30);
	}
}
public class array4
{

	public static void main(String[] args)
	{
		// calling method which returns an array
     int arr[] = testreturnarray.getarray();
  // printing the values of an array
     for (i=0; i<arr.length; i++)
     System.out.println(arr[i]);
    	 
     
     
     
	}

}
/*class TestReturnArray {
	// creating method which returns an array	
	static int[] getArray() {
		
//		int num[]=new int[3];
//		num[0]=10;
//		num[1]=13;
//		num[2]=15;
//		return num; //or
		return new int[] { 10, 30, 50, 90, 60 };
	}
	static int getNum() {
		//int num=10+31;
		return (10+31);
	}
}
public class Array5 {
	public static void main(String args[]) {
		// calling method which returns an array
		int arr[] = TestReturnArray.getArray();//{ 10, 30, 50, 90, 60 };
		// printing the values of an array
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}*/