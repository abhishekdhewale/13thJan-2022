package MouseOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.SeleniumUtility;




public class MouseOpr2 {

	public static void main(String[] args) throws InterruptedException{
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.globalsqa.com/demo-site/");
		//identify all the elements of main menu
		List<WebElement> mainMenu=driver.findElements(By.xpath("//div[@id='menu']/ul/li/a"));
		System.out.println("Main Menu option count: "+mainMenu.size());
		//create an instance of Actions class by passing required browser instance to its constructor
		Actions act=new Actions(driver);
//		for(int i=0;i<mainMenu.size();i++) {
//			WebElement option=mainMenu.get(i);
//			act.moveToElement(option).perform();
//			Thread.sleep(1000);
//		}
		//mouseHover(act, mainMenu);
		
		//mouseHoverWithCords(act, mainMenu);
		
		rightClick(act, mainMenu.get(1));
		
	}
	static void rightClick(Actions act,WebElement option) throws InterruptedException {
		System.out.println("Option name is : "+option.getText());
		act.moveToElement(option).contextClick().build().perform();
		
	}
	static void mouseHoverWithCords(Actions act,List<WebElement> mainMenu) throws InterruptedException {
		WebElement option=mainMenu.get(1);
		System.out.println("Option name is : "+option.getText());
		act.moveToElement(option, 100, 0).perform();
	}
	static void mouseHover(Actions act,List<WebElement> mainMenu) throws InterruptedException {
		for(int i=0;i<mainMenu.size();i++) {
			WebElement option=mainMenu.get(i);
			act.moveToElement(option).perform();
			Thread.sleep(1000);
		}
		}
	}
       

