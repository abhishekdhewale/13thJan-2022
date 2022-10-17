package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assi0 
{

	public static void main(String[] args)
	{
		 String a1="D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\Executables\\chromedriver.exe";
	      
		  System.setProperty("webdriver.chrome.driver", a1);
		  
		  ChromeDriver  a2=new ChromeDriver();
		  
		  a2.get("https://demo.vtiger.com/vtigercrm/index.php");
		  
		  WebElement list=a2.findElement(By.cssSelector("input#username"));
		  list.sendKeys("admin");
		  WebElement list1=a2.findElement(By.cssSelector("input#password"));
		  list1.sendKeys("Test@123");
		  WebElement list3=a2.findElement(By.cssSelector(".button"));
		  list3.click();
	}

}
