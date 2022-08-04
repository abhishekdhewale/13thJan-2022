package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginLogout 
{

	public static void main(String[] args) 
	
	{
		String D4=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", D4 );
        WebDriver D5=new ChromeDriver();
        
        //implicit wait
        D5.get("https://demo.actitime.com/login.do");
        D5.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        String ExpetedTitle="ActiTIME-logi";
        String ActualTitle=D5.getTitle();
        if(ActualTitle.equals(ExpetedTitle));
        {
        	System.out.println("Login page opened sucesfully");
        }
        
        {
        	System.out.println("Either Login page unsucessfully or URL will be changed");
        }
       D5.findElement(By.id("username")).sendKeys("admin");
       D5.findElement(By.name("pwd")).sendKeys("manager");
       D5.findElement(By.id("Loginbutton")).click();
       
       D5.findElement(By.linkText("logout")).click();
       D5.findElement(By.id("logoutLink")).click();
       D5.close();
        
        
     
	}

}
