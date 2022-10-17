package Assignment;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assi14 {

	public static void main(String[] args) throws InterruptedException{
    
	System.setProperty("webdriver.gecko.driver", "D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\Executables\\geckodriver.exe");
	
	WebDriver s2=new FirefoxDriver();

	s2.get("https://www.hotstar.com/in");
	Thread.sleep(2000);
	s2.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	s2.manage().window().maximize();
	
	String Actualtitle="Disney+ Hotstar - Watch TV Shows, Movies, Specials, Live Cricket &amp; Football";
	String Expectedtitle=s2.getTitle();
	if(Actualtitle.equals(Expectedtitle)) {
		System.out.println("Title should be verify");
	}
	else {
		System.out.println("title should be changed");
	}
	System.out.println("Application current URL:" +s2.getCurrentUrl());
	System.out.println("Application current Title and Length:" +s2.getTitle().length());
	System.out.println("Application current URL:" +s2.getPageSource());
	
	s2.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
   }
}