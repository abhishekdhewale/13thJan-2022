package Day4;

public class Plastic2 {

	
		//non-static+ method
		public static void main(String[] args) {
			 Plastic2 x1=new Plastic2();			//compulsory
		//step1
			double res=x1.getSI(10000, 8.5, 36);
			System.out.println("interest : "+res);
		//step 2
			System.out.println("interest : "+x1.getSI(2000, 2.5, 12));
		// step3	
			x1.getSI(3000, 2.5, 36);
		}
		public double  getSI(int p, double d, int t) {
			double res=(p*d*t)/100;
			System.out.println("interest : "+res);
			return res;
		}
		

	}


