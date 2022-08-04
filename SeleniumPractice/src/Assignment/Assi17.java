package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.rmi.ssl.SslRMIClientSocketFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assi17 {

	public static void main(String[] args)  throws InterruptedException{
    
	   String driver="D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\Executables\\geckodriver.exe"; 
	   System.setProperty("webdriver.gecko.driver", driver);
	   
	   WebDriver a1=new FirefoxDriver();
		
	   Thread.sleep(2000);
	   a1.manage().window().maximize();
	   Thread.sleep(2000);
	   a1.manage().window().setSize(new Dimension(500,600));
	   Thread.sleep(2000);
	   a1.manage().window().maximize();
	   Thread.sleep(2000);
	   a1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   a1.get("https://www.demoblaze.com/");
	   
	   List<WebElement> categories = a1.findElements(By.cssSelector(".list-group>a"));
	   System.out.println("Categories:" +categories.size());
	   List<String> l1=new ArrayList<String>();
	   l1.add("CATEGORIES");
	   l1.add("Phones");
	   l1.add("laptops");
	   l1.add("Moniters");
	   for (int i=0; i<categories.size(); i++) {
		   WebElement cate=categories.get(i);
		   System.out.println("categories size:" +cate.getText());
		   System.out.println(cate.isDisplayed());
		   System.out.println(cate.isEnabled());
		   System.out.println(cate.getText().equals(l1.get(i)));
		 
		   
		   
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
		
		
   }
}