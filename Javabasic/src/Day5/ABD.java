package Day5;

public class ABD {

	public static void main(String[] args) {
		
       // a++ = var+1  & a-- = var-1 &  ++a = 1+var & --a = 1-var
		
	//* pre: first perform the operation dn use the updated value  = a++ & a-- 
		// * post: first use the value dn perform the operation  = ++a 7 --a
			
				int a = 0, b;
				b = a++ + ++a + ++a + a; // a=0 , a=1, 
			  // b =  0 , 2 , 3 , 3           //                                                    
				System.out.println("a: "+a);// 3
				System.out.println("b: "+b);// 8
				System.out.println("**********************");
				a = -5;
				b = a-- + --a + --a + a;///////////////////                         ///10 ++10 
			     // b = -5 , -7 , -8 ,-8
				System.out.println("a: "+a);//-8
				System.out.println("b: "+b);// -28

				a = 14;
				b = --a + --a + --a + a + ++a + a++;
			    // b = 13, 12,, 11, 11, 12, 12
				System.out.println(a);// 20
				System.out.println(b);// 113

				a = -2;
				b = a-- + a + ++a + a++ + ++a + a++ + a;
			    //b = -2 , -3 , -3, -2, 0, 0, 1
				System.out.println(a);//1
				System.out.println(b);// -9
			}
		//}
	}

//}
