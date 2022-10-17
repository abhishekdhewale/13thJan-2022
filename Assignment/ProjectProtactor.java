package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class  ProjectProtactor {

	static void url(WebDriver driver)
	{
		String url="https://rahulshettyacademy.com/angularpractice/";
		driver.get(url);
	}
	
	void Name(WebDriver driver )
	{
		WebElement name=driver.findElement(By.name("name"));
	     name.sendKeys("Dhawal Kale");
	}
	void Email(WebDriver driver)
	{
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("dhawal.kale14@gmail.com");
	}
	
	void Password(WebDriver driver)
	{
		WebElement pass=driver.findElement(By.id("exampleInputPassword1"));
		pass.sendKeys("Dhawal2140@");
	}
	void Click(WebDriver driver)
	{
		WebElement click=driver.findElement(By.id("exampleCheck1"));
	     click.click();
	}
	void Gender(WebDriver driver)
	{
		WebElement male=driver.findElement(By.id("exampleFormControlSelect1"));
		male.click();
	}
	
	void BOD(WebDriver driver)
	{
		WebElement bod=driver.findElement(By.name("bday"));
		bod.sendKeys("14031996");
	}
	void SUBMIT(WebDriver driver)
	{
		WebElement submit=driver.findElement(By.xpath("//input[@value='Submit']"));
		submit.click();
	}

	public static void main(String[] args)  throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\Executables\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		ProjectProtactor obj=new ProjectProtactor();
		ProjectProtactor.url(driver);
		
		
		obj.Name(driver);
		obj.Email(driver);
		obj.BOD(driver);
		
		obj.Password(driver);
		obj.Click(driver);
		//obj.Gender(driver);
		obj.SUBMIT(driver);
   }
}