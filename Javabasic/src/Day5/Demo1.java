package Day5;

public class Demo1 {

	public static void main(String[] args) {
		int n =10;
		int m= n++;
		System.out.println(n); //11
		System.out.println(m);  //10
		System.out.println("*********************************");
		int a =10;
		int s= ++a;
		System.out.println(a); //11
		System.out.println(s);  //11
		System.out.println("*********************************");
		int k= ++s;
		System.out.println("k:" + k); //12
		System.out.println("s:" + s);  //12
		System.out.println("*********************************");
		int f= s++;
		System.out.println("f:" + f); //12
		System.out.println("s:" + s);  //13
		System.out.println("*********************************");
		int g= s++;
		System.out.println("g:" + g); //13
		System.out.println("s:" + s);  //14
		System.out.println("*********************************");
		int h= --s;
		System.out.println("g:" + g); //13
		System.out.println("s:" + s);  //13
		System.out.println("*********************************");
		int j= s--;
		System.out.println("g:" + g); //13
		System.out.println("s:" + s);  //12
		System.out.println("*********************************");
		int x = 197;
		System.out.println("X=" + ++x);//198
		System.out.println("X=" + x);//198
		System.out.println("X=" + x++);//198
		System.out.println("X=" + x);//199
		System.out.println("X=" + x--);//199
		System.out.println("X=" + x);//198
		System.out.println("X=" + --x);//197
		System.out.println("X=" + x);//197
		System.out.println("*********************************");
		int z = 165;
		System.out.println("z=" + ++z);//166
		System.out.println("z=" + z);//166
		System.out.println("z=" + z++);//166
		System.out.println("z=" + z);//167
		System.out.println("z=" + z--);//167
		System.out.println("z=" + z);//166
		System.out.println("z=" + --z);//165
		System.out.println("z=" + z);//165
		
	}

}
