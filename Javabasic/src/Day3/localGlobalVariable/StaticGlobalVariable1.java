package Day3.localGlobalVariable;

class StaticGlobalVariable1 {
    static int mobilenumber = 8782;
     public static void main(String[] args) { 
          
         
         System.out.println("Program Starts");
    	 System.out.println("SGV :" +mobilenumber);
    	 System.out.println("SGV with Standard" +StaticGlobalVariable1.mobilenumber);
    	 System.out.println("/////////////////");
    	 mobilenumber=7769;
    	 System.out.println("SGV :" +mobilenumber);
    	 System.out.println("SGV with Standard" +StaticGlobalVariable1.mobilenumber);
    	 System.out.println("/////////////////");
    	 int mobilenumber = 800;
    	 System.out.println("Local Variable :" +mobilenumber);
    	 System.out.println("SGV with Standard" +StaticGlobalVariable1.mobilenumber);
    	 System.out.println("/////////////////");
    	 System.out.println();
    	 System.out.println("Progrsm ends");
	}

}
