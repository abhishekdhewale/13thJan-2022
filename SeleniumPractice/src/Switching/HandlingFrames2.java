package Switching;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandlingFrames2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\Executables\\chromedriver.exe" );       
        WebDriver driver=new ChromeDriver();
         
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        driver.get("https://jqueryui.com/droppable/");
        
        WebElement dropdownlist=driver.findElement(By.className("Interactions"));
        Select s1= new Select(dropdownlist);
        
        System.out.println("Check Multiple drowndownlist list or not: "+ s1.isMultiple());
        
        WebElement Selectoption=s1.getFirstSelectedOption();
        System.out.println("Allready select option:" + s1.getFirstSelectedOption().getText());
        
        List<WebElement> option=s1.getOptions();     
        System.out.println("Option count is:" + option.size());
        for(int i=0; i<option.size(); i++) {
        	System.out.println("option"+i+" : "+option.get(i).getText());
        }
        s1.selectByVisibleText("sortable");
        
        
        
        
	}

}
