package Day3.localGlobalVariable;

public class NonStaticGlobalVariable4 {
    int mobilenumber=9689;
	public static void main(String[] args) {
		System.out.println("Program Starts");
	    NonStaticGlobalVariable4 ref = new NonStaticGlobalVariable4();
	    System.out.println("1st ref NonStaticGlobalVariable:" + ref.mobilenumber);
        ref.mobilenumber = 800;
        System.out.println("2nd New ref NonStaticGlobalVariable:" + ref.mobilenumber);
        NonStaticGlobalVariable4 ref1 = new NonStaticGlobalVariable4();
        System.out.println("2nd ref:" + ref1.mobilenumber);
        System.out.println("Program ends");
	}

}
