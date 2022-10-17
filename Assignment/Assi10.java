package Assignment;


import org.openqa.selenium.chrome.ChromeDriver;
public class Assi10 {

	public static void main(String[] args){
		
		String A2="D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\Executables\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", A2);
		
	    ChromeDriver driver= new ChromeDriver();

	    driver.get("https://www.facebook.com/");

		String a1=driver.getPageSource();
         
		System.out.println("Application source code:" +a1);
		System.out.println("Application Title length:" +a1.length());
		
		System.out.println("Application current URL:" +driver.getCurrentUrl());
		System.out.println("Application current Title :" +driver.getTitle());
		driver.close();
	}
}
