package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeLoginLogoutwithHomepageValidation
{

	public static void main(String[] args) 
	{
		String d6=System.getProperty("user dir")+"D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", d6);
		WebDriver d7= new ChromeDriver();
		
		d7.get("https://demo.actitime.com/login.do");
         
		d7.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);
		
		String ExpectedTitle="ActiTIME-login";
		String ActualTitle=d7.getTitle();
		
		if(ActualTitle.equals(ExpectedTitle)) 
		{
			System.out.println("Login page opened sucessfully...");
		}else 
		{
			System.out.println("Either login page not opened or page title got changed");
		}
		
		d7.findElement(By.id("username")).sendKeys("admin");
		d7.findElement(By.name("pwd")).sendKeys("manager");
		d7.findElement(By.id("LoginButton")).click();
		
		WebElement LogoutButton=d7.findElement(By.linkText("LogoutLink"));
		//explicit wait
		WebDriverWait wait=new WebDriverWait(d7 , 20);
		wait.until(ExpectedConditions.elementToBeClickable(LogoutButton));
	    String actualHomePageTitle=d7.getTitle();
	    System.out.println("Actual HomePage Title:" + actualHomePageTitle);
		String ExpectedHomePageTitle="actiTIME - Enter Time-Track";
		if(actualHomePageTitle.equals(ExpectedHomePageTitle))
		{
		System.out.println("Login is successfull and Home page title is also varified");
		}
		else
		{
        System.out.println("Either Login is failed or Home page title is changed");	
		}
	    d7.findElement(By.id("logoutlink")).click();
		d7.close();
	}

}
