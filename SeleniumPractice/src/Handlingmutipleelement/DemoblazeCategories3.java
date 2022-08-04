package Handlingmutipleelement;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DemoblazeCategories3 
{

	public static void main(String[] args)
	{
		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
		//step1: set driver executable path by using System.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverPath);
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");

		WebElement searchelement=driver.findElement(By.name("q"));
		searchelement.sendKeys("Selenium testing");
		
		
		List<WebElement> list=driver.findElements(By.cssSelector("*G43f7eclass>li>div>div>div>span")); 
		System.out.println("count size:" + list.size());
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
		
		
		
		
	}

}
