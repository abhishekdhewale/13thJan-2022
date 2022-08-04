package Assignment;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assi13 {

	public static void main(String[] args) throws InterruptedException {
    
	System.setProperty("webdriver.gecko.driver", "D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\Executables\\geckodriver.exe");
	
	WebDriver s3=new FirefoxDriver();
	
    Thread.sleep(3000);
	s3.manage().window().maximize();
	Thread.sleep(3000);
	s3.manage().window().setSize(new Dimension(500, 700));
	Thread.sleep(3000);
	s3.manage().window().maximize();
	s3.get("https://www.hotstar.com/in");
	s3.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	System.out.println("Application current Title:" +s3.getTitle());
	System.out.println("Application current Title and length:" +s3.getTitle().length());
	System.out.println("Application current URL:" +s3.getCurrentUrl());
	//System.out.println("Application current source code:" +s3.getPageSource());
	Thread.sleep(3000);
	s3.navigate().back();
	Thread.sleep(3000);
	s3.navigate().forward();
	Thread.sleep(3000);
	s3.navigate().refresh();
	Thread.sleep(3000);
	s3.navigate().to("https://www.amazon.in/");
	s3.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Thread.sleep(3000);
	s3.navigate().back();
	Thread.sleep(3000);
	s3.navigate().forward();
	Thread.sleep(3000);
	s3.navigate().refresh();
	Thread.sleep(3000);
	s3.navigate().to("https://www.flipkart.com/");
	Thread.sleep(3000);
	s3.manage().window().maximize();
	Thread.sleep(3000);
	s3.manage().window().setSize(new Dimension(700,500));
	Thread.sleep(3000);
	s3.manage().window().maximize();
	s3.get("https://demo.actitime.com/login.do");
	s3.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	System.out.println("Application current Title:" +s3.getTitle());
	System.out.println("Apllication current title and length:" +s3.getTitle().length());
	System.out.println("Application current URL:" +s3.getCurrentUrl());
	//System.out.println("Application source code:" +s3.getPageSource());
	System.out.println("Application window handle:" +s3.getWindowHandle());
	Thread.sleep(3000);
	s3.navigate().back();
	Thread.sleep(3000);
	s3.navigate().forward();
	Thread.sleep(3000);
	s3.navigate().refresh();
	Thread.sleep(3000);
	s3.navigate().to("https://www.youtube.com/");
	s3.close();
	}
}