package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownlist 
{

	
	public static void main(String[] args) 
	{
		String s2="D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\Executables\\chromedriver.exe";
		//String d1=System.getProperty("user dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", s2);
		WebDriver d2=new ChromeDriver();
		
		d2.manage().window().maximize();
		d2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		d2.get("https://demosite.executeautomation.com/");
		
		d2.findElement(By.id("username")).sendKeys("execution");
		d2.findElement(By.name("Password")).sendKeys("admin");
		d2.findElement(By.id("Login")).click();

		//1. Identify the dropdown list and store it into WebElement
		WebElement dropdownlist=d2.findElement(By.id("TitleId"));
		
		/*2. Create an instance of Select class(predined class in Selenium) and pass dropdown list 
		WebElement as a parameter in its constructor  */ 
		
		Select s1 =  new Select(dropdownlist);
		//System.out.println("Is it multiselect dropdownlist:" + s1.isMultiple());
		
		//Op1: count the options present in dropdown
		List<WebElement> options=s1.getOptions();
		
		//op2: print all the option name
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		String selectvalue=s1.getFirstSelectedOption().getText();
		System.out.println(selectvalue);
		//op4: select required value from dropdown
		//S1.selectByVisibleText("Mr."); //or
		//s1.selectByValue("t2");//or
		//s1.selectByIndex(1);
		//System.out.println(s1.getFirstSelectedOption().getText());



		//close current instance of browser
		d2.close();	
		
	}

}
