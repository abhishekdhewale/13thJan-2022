package Condition;

public class Reversealphabet
{

	public static void main(String[] args)
	{
		for (char a1 = 'a'; a1 <= 'z'; a1++)
		{
			System.out.print(a1 + " ");
	}
			System.out.println("\n******Print in Cap******");
			
			
		for (char a2 = 'A'; a2 <= 'Z' ; a2++)	
		{
			System.out.print(a2 + " ");
		}
	      System.out.println("/n**********Print in Reverse*****");
		
		for (char a3 = 'Z'; a3 >= 'A'; a3--)
		{
			System.out.print(a3 + " ");
		
		}
	}
}	
	
	
	
/*for (char c1 = 'a'; c1 <= 'z'; c1++) {
	System.out.print(c1 + " ");
}
System.out.println("\n*****Print in CAP*********");

for (char c1 = 'A'; c1 <= 'Z'; c1++) {
	System.out.print(c1 + " ");
}

System.out.println("\n*****Print in reverse CAP*********");

for (char c1 = 'Z'; c1 >= 'A'; c1--) {
	System.out.print(c1 + " ");
}
}
}*/