package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assi21 {

	public static void main(String[] args) {
    
		String driver="D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\Executables\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", driver);
		WebDriver q1=new FirefoxDriver();
		
		q1.manage().window().maximize();
		q1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		q1.get("https://www.flipkart.com/");
		
		q1.findElement(By.className("Login")).click();
		
	}
}