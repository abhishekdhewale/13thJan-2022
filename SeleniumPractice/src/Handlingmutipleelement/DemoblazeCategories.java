package Handlingmutipleelement;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DemoblazeCategories 
{

	public static void main(String[] args)
	{
		String driverPath = "D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\Executables\\geckodriver.exe";
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.gecko.driver", driverPath);
		//step2: create an instance of Chrome Browser
		WebDriver driver = new FirefoxDriver();
		//maximize browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.demoblaze.com/");

		List<WebElement> List=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		System.out.println("Count size:" + List.size());
		for(int i=0; i<List.size(); i++) {
			System.out.println(List.get(i).getText());
			
		}
		
		
		
		
	}

}
