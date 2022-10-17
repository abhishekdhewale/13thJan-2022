package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assi3 
{

	public static void main(String[] args)
	{
		 String a1="D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\Executables\\chromedriver.exe";
	      
		  System.setProperty("webdriver.chrome.driver", a1);
		  
		  ChromeDriver  a2=new ChromeDriver();
		  a2.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  a2.get("https://demo.vtiger.com/vtigercrm/index.php");
		  
		  a2.findElement(By.id("admin")).sendKeys();
		  a2.findElement(By.id("Test@123")).sendKeys();
		  a2.findElement(By.id("loginbutton")).click();
		  
		  a2.findElement(By.id("admin")).clear();
		  a2.findElement(By.id("Test@123")).clear();
		  
		  a2.findElement(By.id("admin")).sendKeys();
		  a2.findElement(By.id("Test@123")).sendKeys();
		  a2.findElement(By.id("loginbutton")).click();
		  
		  a2.findElement(By.id("logoutlink")).click();
		  a2.close();		  
	}

}
/*pen a chrome browser
enter vtiger application url
validation login page open or not
remove existing text from username field
type username as 'admin'
remove existing text from password field
type password as 'Test@123'
click on login button*/