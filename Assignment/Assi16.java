package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assi16 {

	public static void main(String[] args)  throws InterruptedException{
    
		String driver="D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\Executables\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", driver);
		WebDriver s1=new FirefoxDriver();
		
		s1.manage().window().maximize();
		s1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		s1.get("https://www.demoblaze.com/");
		
		WebElement categories=s1.findElement(By.cssSelector(".list-group>*:nth-child(1)"));
		System.out.println(categories.isDisplayed());
		System.out.println(categories.isEnabled());
		System.out.println(categories.equals("CATEGORIES"));
		
		WebElement phones=s1.findElement(By.cssSelector(".list-group>*:nth-child(2)"));
		System.out.println(phones.isDisplayed());
		System.out.println(phones.isEnabled());
		System.out.println(phones.equals("Phones"));
		
		WebElement laptop=s1.findElement(By.cssSelector(".list-group>*:nth-child(3)"));
		System.out.println(laptop.isDisplayed());
		System.out.println(laptop.isEnabled());
		System.out.println(laptop.equals("Laptops"));
		
		WebElement moniters=s1.findElement(By.cssSelector(".list-group>*:nth-child(4)"));
	    System.out.println(moniters.isDisplayed());
	    System.out.println(moniters.isEnabled());
	    System.out.println(moniters.equals("Moniters"));
	    
	    
		
		
		
		
		
		
   }
}