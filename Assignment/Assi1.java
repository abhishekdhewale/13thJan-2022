package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assi1 
{

	public static void main(String[] args)
	{
		 String a1="D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\Executables\\chromedriver.exe";
	      
		  System.setProperty("webdriver.chrome.driver", a1);
		  
		  ChromeDriver  a2=new ChromeDriver();
		  
		  a2.get("https://demo.actitime.com/");
		  
		  a2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		  String Sourcecodelength=a2.getPageSource();
		  
		  String actualtitle="actiTime-login";
		  String expectedtitle=a2.getTitle();
		  if(actualtitle.equals(expectedtitle))
		  {
			  System.out.println("Login page opened sucessfully...");
		  }
		  else 
		  {
			 System.out.println("Either login page not opened or page title got changed");
		  }
		  a2.findElement(By.id("username")).sendKeys("admin");
		  a2.findElement(By.name("pwd")).sendKeys("manager");
		  a2.findElement(By.id("loginbutton")).click();
		  
		  
		  System.out.println("Apllication source code:" + Sourcecodelength );
		  System.out.println("Source code length:" + a2.getPageSource());

		  System.out.println("Application current url:" + a2.getCurrentUrl());
		  System.out.println("Application current Title" + a2.getTitle());
		 
		  System.out.println("Expected Title:" + a2.getTitle().length() );
		  
		  a2.close();
	}

}
/*Scenario to Automate:
Launch a new Chrome browser.
Open https://demo.actitime.com/
Get Page Title name and Title length
Print Page Title and Title length on the Eclipse Console.
Get Page URL and verify if it is a correct page opened
Enter valid username and password
Click on login button
Print the title on the console
Close the Browser.*/