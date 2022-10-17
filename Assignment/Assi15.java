package Assignment;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assi15 {

	public static void main(String[] args)  throws InterruptedException{
    
	System.setProperty("webdriver.chrome.driver","D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\Executables\\chromedriver.exe");
	
	WebDriver udriver=new ChromeDriver();
	
	Thread.sleep(2000);
	udriver.manage().window().maximize();
	Thread.sleep(2000);
	udriver.manage().window().setSize(new Dimension(500, 700));
	Thread.sleep(2000);
	udriver.manage().window().maximize();
	udriver.get("https://demo.actitime.com/login.do");
	udriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	String Expectedtitle="actiTIME - Login";
	String Actualtitle=udriver.getTitle();
	if(Actualtitle.equals(Expectedtitle)) {
		System.out.println("Login page succesfully open");
	}
	else {
		System.out.println("Login page should be changed");
	}
	udriver.findElement(By.name("username")).sendKeys("trainee");
	udriver.findElement(By.name("pwd")).sendKeys("trainee");
	udriver.findElement(By.id("keepLogeedInLabe")).click();
	udriver.findElement(By.id("loginButton")).click();
	udriver.close();
   }
}