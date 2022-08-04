package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Assi11 {

	public static void main(String[] args)throws InterruptedException{
		
		String driver="D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\Executables\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", driver);
		
		FirefoxDriver a3=new FirefoxDriver();
		
		 a3.get("https://rahulshettyacademy.com/AutomationPractice/");
		 
		 a3.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 String a4=a3.getPageSource();
		 
		 String Actualtitle="Practice Page";
         String ExpectedTitle=a3.getTitle();
         
         if(Actualtitle.equals(ExpectedTitle)) {
        	 System.out.println("Title should be verify");
         }
         else {
        	 System.out.println("Title should be change");
         }
           System.out.println("Application current URL:" +a3.getCurrentUrl());
           System.out.println("Application current Title name:" +a4);
           System.out.println("Application current Title name:" +a3.getTitle());
           System.out.println("Application current Length:" +a4.length());
           System.out.println("Application current Title name:" +a3.getWindowHandle());
           
           
           a3.close();
		 
		
	}
}
