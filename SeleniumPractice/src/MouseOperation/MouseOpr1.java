package MouseOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.SeleniumUtility;

public class MouseOpr1 {

	public static void main(String[] args) {
		SeleniumUtility a1=new SeleniumUtility();
		
		WebDriver driver=a1.setUp("chrome", "http://demo.automationtesting.in/Register.html");
		//identify first name input field
		
		WebElement username=driver.findElement(By.cssSelector("input[placeholder='First Nmae']"));
		username.sendKeys("admin");
		//create an instance of Actions class by passing required browser instance to its constructor		
		Actions act=new Actions(driver);
		//with the help of Actions class reference perform appropriate action
		act.moveToElement(username).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		//paste it in last name field
		WebElement lastname=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		act.moveToElement(lastname).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
	}

}
