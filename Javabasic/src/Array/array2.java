package Array;

public class array2 
{

	public static void main(String[] args) 
	{
     int [] numbers = {2,6,2,4,-9,-8,-7,6,4,50};
     int sum = 0;
     int average;
  // access all elements using for each loop add each element in sum
		for (int number : numbers)
		{
			sum = sum + number;
			//or
		// sum += number;	
		}
		// get the total number of elements
		int arraylength = numbers.length;
		// calculate the average convert the average from int to double
		average= sum/arraylength;
		System.out.println("sum:" + sum);
		System.out.println("Average:" + average);
		
		
	}

}
/*int[] numbers = { 2, -9, 0, 5, 12, -25, 22, 9, 8, 12 };
double sum = 0;
double average;
// access all elements using for each loop add each element in sum
for (int number : numbers) {
	sum = sum + number;
			//or
	//sum +=  number;
}
// get the total number of elements
int arrayLength = numbers.length;
// calculate the average convert the average from int to double
average = sum / arrayLength;
System.out.println("Sum = " + sum);
System.out.println("Average = " + average);
}
}
/**
*  25+50+15+10 =100/4=
*  10/3=3
*  -34+70=60/10.0=6.0
*/