package Day2;

class Variable7interest {
    // Interest=Principle*Rate*Time:
	public static void main(String[] args) {
		System.out.println("Program start");
		double interest;
		long principle = 2000l;
		double rate = 1.5;
		int time = 5;
		interest = principle*rate*time/100;
		System.out.println("The simple interest for "+principle+" amount at the rate off "+rate+" for "+time+" years duration is "+interest);
		System.out.println("Program end");

	}

}