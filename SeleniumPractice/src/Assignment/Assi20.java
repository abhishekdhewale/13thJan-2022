package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assi20 {

	public static void main(String[] args)   throws InterruptedException{
    
		String driver="D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\Executables\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", driver);
		WebDriver r1=new FirefoxDriver();
		
		Thread.sleep(2000);
		r1.manage().window().maximize();
		Thread.sleep(2000);
		r1.manage().window().setSize(new Dimension(200,300));
		Thread.sleep(2000);
		r1.manage().window().maximize();
		Thread.sleep(2000);
		r1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		r1.get("https://www.flipkart.com/");
		
		String ExpectedTitle="Flipkart";
		String ActualTitle=r1.getTitle();
		if(ActualTitle.equals(ExpectedTitle)) {
			System.out.println("Page should be verify");
		}
		else {
			System.out.println("Page should be changed");
		}
		System.out.println("page title: "+r1.getTitle().length());
		System.out.println("page source: "+r1.getPageSource());
		System.out.println("page length: "+r1.getCurrentUrl());
		
		List<WebElement> count=r1.findElements(By.cssSelector("._331-kn>div>div>div>a"));
		System.out.println(count.size());
		for(int i=0; i<count.size(); i++) {
			System.out.println(count.get(i).getText());
		}
		r1.navigate().back();
		Thread.sleep(2000);
		r1.navigate().forward();;
		Thread.sleep(2000);
		r1.navigate().refresh();
		Thread.sleep(2000);
		r1.navigate().to("https://www.amazon.in/");
		
		
		
		
		
		
		
		
		
	}
}