package Blocks;

public class Block1
{
	//Static block or static initialization block or SIB */
	static 
	{
		System.out.println("**Running static block1 of class block2**");
	}

	public static void main(String[] args) 
	{
		//System.out.println("main() Starts");
		//System.out.println("I am main() of Block1 class");
		//System.out.println("main() Ends");
		System.out.println("Program Starts");
		System.out.println("I am main() of Block1 class");
		System.out.println("Program Ends");
	}

}
/* static block or static initialization block or SIB */
/*static {
	System.out.println("******** Running static-block1 of class Blocks1..");
}
public static void main(String[] args) {
	System.out.println("main() Starts");
	System.out.println("I am main() of Blocks1 class...");
	System.out.println("main() ends");
}
}*/