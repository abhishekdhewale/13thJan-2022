package Day5;

public class Demo3 {
	
	
	public static void main(String[] args) {
		int num1= 20, num2=30;
		 boolean res = (num1==num2);
		System.out.println("num1 = num2:" +(num1 & num2)); 
		System.out.println("num1 = num2:" +(num1 > num2)); //false
		System.out.println("num1 = num2:" +(num1 < num2));    // true
		System.out.println("num1 = num2:" + (num1 <= num2));   //true
		System.out.println("num1 = num2:" + (num1 >= num2));    //false
		System.out.println("num1 = num2:" + (num1 != num2));   //true 
		
		/*int num1= 20, num2=30;
		int res = num1-num2;
		int res1= num1-num2;
		System.out.println("num1 = num2:" +(res - res1)); 
		System.out.println("num1 = num2:" +(num1 > num2)); //false
		System.out.println("num1 = num2:" +(num1 < num2));    // true
		System.out.println("num1 = num2:" + (num1 <= num2));   //true
		System.out.println("num1 = num2:" + (num1 >= num2));    //false
		System.out.println("num1 = num2:" + (num1 != num2)); */   //true 
		
		
		
	}

}
/*Variables Definition and Initialization
		int num1 = 19, num2 = 14;
		System.out.println("num1: " + num1 + "--->num2: " + num2);//19  14
		// is equal to
//		boolean res = (num1 == num2);
//		System.out.println("num1 == num2 : " + res);// 
				//or
		System.out.println("num1 == num2 : " + (num1 == num2));// 
		// is not equal to
		System.out.println("num1 != num2 : " + (num1 != num2));// 
		// Greater than
		System.out.println("num1 >  num2 : " + (num1 > num2));// 
		// Less than
		System.out.println("num1 <  num2 : " + (num1 < num2));// 
		// Greater than or equal to
		System.out.println("num1 >= num2 : " + (num1 >= num2));// 
		// Less than or equal to
		System.out.println("num1 <= num2 : " + (num1 <= num2));// 

	}
}*/