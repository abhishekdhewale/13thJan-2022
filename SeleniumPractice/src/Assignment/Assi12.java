package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assi12 {

	public static void main(String[] args){

	//String driver="D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\Executables\\chromedriver.exe";	
		
	System.setProperty("webdriver.chrome.driver", "D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\Executables\\chromedriver.exe");
	
	WebDriver s1=new ChromeDriver();
		     
	s1.get("https://www.flipkart.com/");
	
	//String sourcecode=s1.getPageSource();
	
	String expectedtitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books &amp; More. Best Offers!";
	String actualtitle=s1.getTitle();
	if(actualtitle.equals(expectedtitle)) {
		System.out.println("Title should be Verify");
	}
	else {
		System.out.println("Title should be change");
	}
	//System.out.println("application source code:" +sourcecode );
	System.out.println("application source code:" +s1.getCurrentUrl());
	System.out.println("application source code:" +s1.getTitle());
	//System.out.println("application source code:" +sourcecode.length());
	System.out.println("application source code:" +s1.getTitle().length());

	s1.close();
	
}
}