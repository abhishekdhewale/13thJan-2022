
public class ABD {
	static int a=10;
	
	public static void main(String[] args) {
		System.out.println("SGV:"+a);
		a=20;		
		System.out.println("SGV:"+a);
		ABD a1= new ABD();
		a1.add();
		System.out.println("a1"+ a1.a );
	
		
	}
	
	public void add() {
		System.out.println("SGV:"+a);
	}
}
