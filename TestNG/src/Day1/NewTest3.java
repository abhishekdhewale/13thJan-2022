package Day1;

import org.testng.annotations.Test;

public class NewTest3 {
  @Test
  public void TestCase7(){
	 System.out.println("Hello, I am TC7 from NewTest2 class");
   }
  @Test
  public void TestCase6() {
	  System.out.println("Hello, I am TC6 from NewTest2 class");
  }
  void Dispalydetails() {
	  System.out.println("I am Display method from NewTest3 class");
  }
}
/**
if testng class contains more dn one test method dn all the test method will be executed in
alphabetical order
*/