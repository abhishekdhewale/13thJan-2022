package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Handlingmultiselectiondropdownlist
{

	public static void main(String[] args) 
	{
		String s1="D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\Executables\\chromedriver.exe";
		//String d5=System.getProperty("user dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", s1);
		WebDriver d6=new ChromeDriver();
		
		d6.get("http://omayo.blogspot.com/");
		d6.manage().window().maximize();
		d6.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Idetify dropdown list
		WebElement cardropdown=d6.findElement(By.id("multiselect1"));
		//**** Create an instance of Select class and pass above element into its constructor
		Select selectSkill=new Select(cardropdown);
		//**** check whether dropdown is multiselect dropdown or not
				System.out.println("Is dropdown is allowing you to select multiple option: "+selectSkill.isMultiple());
		
				//**** get default or already select option
//				//WebElement selectedOption=selectSkill.getFirstSelectedOption();
//				//String selectedOptionName=selectedOption.getText();
//				System.out.println("Already selectec option name: "+selectSkill.getFirstSelectedOption().getText());
				
				//get option count 
				List<WebElement> options=selectSkill.getOptions();
				System.out.println("Option count is:"+options.size());
				//Get dropdown option names
				for(int i=0;i<options.size();i++) {
					System.out.println("Option "+i+": "+options.get(i).getText());
				}
				 
				//select options from dropdown
				selectSkill.selectByIndex(0);
				selectSkill.selectByValue("Hyundaix");
				selectSkill.selectByVisibleText("Audi");
				
				//get all the selected options
				List<WebElement> selectCars=selectSkill.getAllSelectedOptions();
				System.out.println("Selected car count: "+selectCars.size());
				
				//unselect already select options
				selectSkill.deselectByIndex(0);
				selectSkill.deselectByValue("Hyundaix");
				selectSkill.deselectByVisibleText("Audi");
						//or
				//selectSkill.deselectAll();
		
	}

}
