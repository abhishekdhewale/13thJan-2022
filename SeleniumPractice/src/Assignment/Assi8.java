package Assignment;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assi8 {

	public static void main(String[] args)throws InterruptedException{
		  
		String a1="D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", a1);
		WebDriver a2=new ChromeDriver();
		
		Thread.sleep(2000);
		a2.manage().window().maximize();
		Thread.sleep(2000);
		a2.manage().window().setSize(new Dimension(500, 700));
		Thread.sleep(2000);
		a2.manage().window().maximize();
		a2.get("https://demo.vtiger.com/vtigercrm/index.php");
		a2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Current title:" + a2.getTitle());
		System.out.println("Current Size:" + a2.getTitle().length());
		// a2.findElement(By.linkText("forgot password")).click();
		Thread.sleep(2000);
		a2.navigate().back();
        Thread.sleep(2000);
        a2.navigate().forward();
		Thread.sleep(2000);
		a2.navigate().refresh();
		Thread.sleep(2000);
		a2.navigate().to("https://www.amazon.in/");
		
		a2.close();
		
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