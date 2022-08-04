package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLoginLogoutwithHomePageValiditionwithsleep 
{

	public static void main(String[] args)throws InterruptedException
	{
	String d8=System.getProperty("user dri")+"D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\Executables\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", d8);
	WebDriver d9=new ChromeDriver();

	d9.get("https://demo.actitime.com/login.do");
	d9.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);
	
	String Expectedtitle="ActiTIME - login";
	String Actualtitle=d9.getTitle();
	
	if(Expectedtitle.equals(Actualtitle))
	{
		System.out.println("Login page opened successfully..........");
	}
	else
	{
		System.out.println("Login page opened unsuccessfully........");
	}
	d9.findElement(By.id("username")).sendKeys("admin");
	d9.findElement(By.name("pwd")).sendKeys("manager");
	d9.findElement(By.id("loginbutton")).click();
	
	Thread.sleep(2000);
    String actualHomepagetitle=d9.getTitle();
    System.out.println("Actual Homepage Title:" + actualHomepagetitle);	
	String expectedHomepagetitle="actiTIME - Enter Time-Track";
	if(actualHomepagetitle.equals(expectedHomepagetitle))
	{
		System.out.println("Login is successfull and home page title is also varified..");
	}
	else
	{
		System.out.println("Either Login is failed or home page title is changed");
	}
	d9.findElement(By.id("logoutLink")).click();
	//close browser
	d9.close();
	}	
}