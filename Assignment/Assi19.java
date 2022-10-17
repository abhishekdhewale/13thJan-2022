package Assignment;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Assi19 {

	public static void main(String[] args)   {
    
		String driver="D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\Executables\\geckodriver.exe";
		
		System.setProperty("webdriver.gecko.driver", driver);
		WebDriver a1=new FirefoxDriver();
		
		a1.manage().window().maximize();
		a1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		a1.get("https://www.demoblaze.com/");
		
		List<WebElement> count=a1.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		System.out.println("Count:"+ count.size());
		
		
		for(int a=0; a<count.size(); a++) {
			
		System.out.println(count.get(a).getText());	
			
		}
	}
}