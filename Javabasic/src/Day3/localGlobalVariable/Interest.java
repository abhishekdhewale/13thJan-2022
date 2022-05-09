package Day3.localGlobalVariable;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Program Starts");
        System.out.println("Get interest:" +Interest.Interest1(2000,8.5,24) );
		Interest.Interest2(350000, 5, 36);
		 System.out.println("Program Ends");
	}
   public static double Interest1(int p,double r,int t) {
    	 double result=(p*r*t)/100;
    	return result;
    }
    public static void Interest2(int p,double r,int t) {
    	double res1= (p*r*t)/100;
        System.out.println("Interest:" + res1);
    	
    }
}
