package MouseOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.SeleniumUtility;

public class MouseOpr3 {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.globalsqa.com/demo-site/draganddrop/");
		//frame handling
		WebElement frame=driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		driver.switchTo().frame(frame);
		
		//create an instance of Actions class by passing required browser instance to its constructor
		Actions act=new Actions(driver);
		
		List<WebElement> sourceElements=driver.findElements(By.cssSelector("ul#gallery>li"));
		WebElement target=driver.findElement(By.id("trash"));
		
		act.dragAndDrop(sourceElements.get(0), target).build().perform();
		
	}
}
