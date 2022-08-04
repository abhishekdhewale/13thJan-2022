package Assignment;

import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assi6 {

	public static void main(String[] args){
		  
		String a5="D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\Executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", a5);
		WebDriver a6=new FirefoxDriver();
		
		a6.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		a6.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		String expectedTitle="vtiger - login";
		String actualTitle=a6.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("The Title should be verified");
		}
		else {
			System.out.println("The Title should be Change");
		}
		a6.findElement(By.id("username")).sendKeys("admin");
		a6.findElement(By.id("password")).sendKeys("Test@123");
		a6.findElement(By.id("loginbutton")).click();
		
		a6.findElement(By.id("logoutlink")).click();
		a6.close();
		
		
		
		
	}

}
/*pen a chrome browser
enter vtiger application url
validation login page open or not
remove existing text from username field
type username as 'admin'
remove existing text from password field
type password as 'Test@123'
click on login button*/