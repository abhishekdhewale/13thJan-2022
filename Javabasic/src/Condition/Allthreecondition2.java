package Condition;

public class Allthreecondition2
{
	// Creating program for subject (Marathi,English,History,Hindi)
	public static void main(String[] args) 
	{
		// Condition 2nd (if/if else/if else/if else/else)
		long Marathi=70,English=50,Hindi=60,History=90;
		if (Marathi>=90 && English>=90 && Hindi>=90 && History>=90) {
		System.out.println("Grade A");
		}
		else if (Marathi>=70 && English>=70 && Hindi>=70 && History>=70) {
			System.out.println("Grade B");
		}
		else if  (Marathi>=50 && English>=50 && Hindi>=50 && History>=50) {
			System.out.println("Grade C");
		}
		else 
		{
			System.out.println("U r Fail..");
			
	}
}
}
