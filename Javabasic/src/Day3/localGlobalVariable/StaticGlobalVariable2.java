package Day3.localGlobalVariable;

public class StaticGlobalVariable2 {
    static int mobilenumber =123;
	public static void main(String[] args) {
    System.out.println("Program Starts");
    System.out.println("SGV:" + mobilenumber);
    System.out.println("SGV with Standard:" + StaticGlobalVariable2.mobilenumber);
	System.out.println("***************************");
	mobilenumber=7769;
	System.out.println("SGV:" + mobilenumber);
	System.out.println("SGV with Standard" + StaticGlobalVariable2.mobilenumber);
	System.out.println("***************************");
	int mobilenumber=800;
	System.out.println("Local Vriable" + mobilenumber);
	System.out.println("SGV with Standard" + StaticGlobalVariable2.mobilenumber);
	System.out.println("***************************");
	 System.out.println("Program Ends");
	}
}
