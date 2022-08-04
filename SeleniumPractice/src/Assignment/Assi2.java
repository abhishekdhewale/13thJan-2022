package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assi2 
{

	public static void main(String[] args)
	{
		String a4="D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\Executables\\chromedriver.exe";
	      
		  System.setProperty("webdriver.chrome.driver", a4);
		  
		  WebDriver a5=new ChromeDriver();
		  
		  a5.get("https://demosite.executeautomation.com/Login.html");
		  
		  a5.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		//  String Sourcecode=a5.getPageSource();
		  
		  String expectedtitle="Execute Autmation";
		  String actualtitle=a5.getTitle();
		  
		  if(actualtitle.equals(expectedtitle))
		  {
			  System.out.println("Login page opened sucessfully....");
		  }
		  else
		  {
			  System.out.println("Either login page not opened or page title got changed");
		  }
		  a5.findElement(By.id("username")).sendKeys("execution");
		  a5.findElement(By.name("Password")).sendKeys("admin");
          a5.findElement(By.name("Loginbutton")).click();
          
	}

}
/*Scenario to Automate:
Launch a new firefox browser.
Open https://demosite.executeautomation.com/Login.html
Get Page Title name and Title length
Print Page Title and Title length on the Eclipse Console.
Get Page URL and verify if it is a correct page opened
Enter username as “execution”
Enter password as “admin”
Click on login button
Get the page title and current URL, print on console
Click on logout
Close the Browser.*/