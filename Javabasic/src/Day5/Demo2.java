package Day5;

public class Demo2 {

	public static void main(String[] args) {
		int a = 14,b;
		b = a++ + a + ++a + a ;
        // b= 14,15,16,16
		System.out.println("A:" + a);//16
		System.out.println("B:" + b);//61
		System.out.println("**********************************");
		int c = b++ + b + ++b + b;
		// c= 61,62,63,63
		System.out.println("C:" + c);//249
		System.out.println("B:" + b);//63
		System.out.println("**********************************");
		int z=26,m;
		m = z + --z + z + z-- + z;
		// m=26,25,25,24,24
		System.out.println("z:" + z);//24
		System.out.println("m:" + m);//124
		System.out.println("**********************************");
		z = 74;
	    m = z++ + ++z + z + --z + z-- + z;     
		// m= 74,75,75,74,
	    System.out.println("z:" + z);//73
		System.out.println("m:" + m);//444
		System.out.println("**********************************");
		int d = 2 ,n;
		n = ++d + d + --d +  d-- + ++d ;
		// n=3,3,2,1,1
		 System.out.println("n:" + n);//
			System.out.println("d:" + d);//
			System.out.println("**********************************");
		
		
	}

}
