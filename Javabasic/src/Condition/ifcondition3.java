package Condition;

public class ifcondition3 {

	public static void main(String[] args) {
		// Creating two variable for age and weight.
		int age = 16;
		int weight = 60;
		//applying  condition on age and weight.
		if (age >= 17) {
			if (weight > 50) {
				System.out.println("You are eligible to donate blood");
			}
			else 
			{
				System.out.println("Ypu are not eligible to donate blood, because u r weight below 60");
			}
		}
		else 
		{
			System.out.println("Ypu are not eligible to donate blood, because u r age is below 18");
		}
	}
}
       
