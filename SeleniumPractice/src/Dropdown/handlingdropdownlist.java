package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingdropdownlist 
{

	public static void main(String[] args)
	{
		String s1="D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\Executables\\chromedriver.exe";
		//String d3=System.getProperty("user dir") + "\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", s1);
		WebDriver d4=new ChromeDriver();
		
		d4.manage().window().maximize();
		d4.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
        d4.get("http://demo.automationtesting.in/Register.html");
        
        WebElement dropdownlist=d4.findElement(By.id("Skills"));
        
        Select selectskill=new Select(dropdownlist);
        
        System.out.println("If is multipleskill or not:" + selectskill.isMultiple());
        
        WebElement selectoption=selectskill.getFirstSelectedOption();
      //WebElement selectedOption=selectSkill.getFirstSelectedOption();
      		//String selectedOptionName=selectedOption.getText();
      		System.out.println("Allready select option name: "+selectskill.getFirstSelectedOption().getText());
      		
        List<WebElement> options=selectskill.getOptions();        
        System.out.println("option count is:" + options.size());
        for( int i=0;i<options.size();i++)
        {
        	System.out.println("Option"+i+" : "+options.get(i).getText());
        }
        selectskill.selectByIndex(4);
    	//or
		//selectSkill.selectByValue("Backup Management");
				//or
		//selectSkill.selectByVisibleText("Analytics");
        
        
        
        
	}

}
