package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin 
{

	public static void main(String[] args) 
	{
	 String driverpath=System.getProperty("user.dir") + ".\\Executables\\chromedriver.exe";
     System.setProperty("webdriver.chrome.driver", driverpath);
     WebDriver d3=new ChromeDriver();
     
     d3.get("https://demo.actitime.com/login.do");
     
     String expetedTitle="actiTIME - login";
     String actualTitle=d3.getTitle();
     if(actualTitle.equals(expetedTitle));
     {
    	 System.out.println("Login Page opened succesfully");
     }
    
     {
    	 System.out.println("Either a Login page opened unsuccesfully or URL will be changed");
     }
     /**
		 * In order to identify any object/element from the application UI we use findElement(By)
		 * this method returns WebElement
		 * 
		 * By is predefined class in selenium and all its method are static which are also known as "locator"
		 * Selenium support following locator:
		 * id , name, linkText, partialLinkText, className, tagName, cssSelector, xpath
		 * 
		 * Action: all the below actions will be performed on the webelement
		 * 			if you want to type any input on the field use--> sendKeys("");
		 * 		   if you want to click on any element use---> click();
		 * 		   clearing existing value from the field ---> clear();
		 */
     
        //identify the required element from the UI
        WebElement UserNameinputField=d3.findElement(By.id("username"));
      //perform appropriate action the identified element
        UserNameinputField.sendKeys("admin");
      //remove existing text from the input field
        UserNameinputField.clear();
        UserNameinputField.sendKeys("admim");
        
      //identify the required element from the UI
        WebElement PasswordinputField=d3.findElement(By.name("pwd"));
      //perform appropriate action the identified element
        PasswordinputField.sendKeys("managar");
        
        //identify the required element from the UI
        WebElement LoginButtonField=d3.findElement(By.id("loginbutton"));
      //perform appropriate action the identified element
        LoginButtonField.click();
        
        d3.close();
        
        
        
        
        
        
	}

}
