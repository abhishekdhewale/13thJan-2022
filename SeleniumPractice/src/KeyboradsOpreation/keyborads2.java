package KeyboradsOpreation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Utilities.SeleniumUtility;




public class keyborads2
{

	public static void main(String[] args)
	{
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com/login.do");
		//login in actitime application using Enter key
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB);
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
	}

}
