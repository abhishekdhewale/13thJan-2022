
public class sagar {

	public static void main(String[] args) {
		//package day11Operators;

		//public class Unaryop {
			//public static void main(String[] args) {

				int a = 10;
				int b = a;
				System.out.println("a: " + a);// 10
				System.out.println("b: " + b);//10
				/**
				 * pre: first perform the operation dn use the updated value 
				 * post: first use the value dn perform the operation
				 */
				int k = ++a;
				System.out.println("k: " + k);// 11
				System.out.println("a: " + a);// 11
				System.out.println("**********************************");
				int j = k++;//
				System.out.println("k: " + k);// 12
				System.out.println("j: " + j);//   12
				System.out.println("**********************************");
				int r = 21;
				System.out.println("r=: " + r++);// 22
				System.out.println("r=: " + r);//   22
				System.out.println("r=: " + ++r);// 22
				System.out.println("r=: " + r);//23
				System.out.println("**********************************");
				int x = 105;
				System.out.println("x=: " + --x);// 105
				System.out.println("x=: " + x);// 104
				System.out.println("x=: " + x--);// 103
				System.out.println("x=: " + x);// 103
			}
		

	}


