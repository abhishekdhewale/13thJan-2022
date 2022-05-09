package Day5;

public class Operators {
        
	
	public static void main(String[] args) {
		int age = 20;
		char bloodgroup = 'A';
		boolean res1 ,res2;
		res1 = age>19;
		res2 = (bloodgroup=='A');
		System.out.println("Program Starts");
		System.out.println("Result: " +(res1 & res2));     //true 
		System.out.println("Result2:" +(res1 || res2));   //true
		System.out.println("Result3:" + !(res1 & res2));      //false
		System.out.println("*********************************************");
	    res1 = age<=20;  //
		res2 = (bloodgroup=='A');
		System.out.println("Result: " +(res1 & res2));   //true
		System.out.println("Result2:" +(res1 || res2));  //true
		System.out.println("Result:" + !(res1 & res2));   //false
		System.out.println("*********************************************");
		res1 = age>33;
		res2 = (bloodgroup=='B');
	    System.out.println("Result: " +(res1 & res2));   //false
		System.out.println("Result2:" +(res1 || res2));  //false
		System.out.println("Result:" + !(res1 & res2));   //true
		
		
		
		
		
	}

}
