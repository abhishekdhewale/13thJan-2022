package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assi4 {

	public static void main(String[] args){
		 String a3= "D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\Executables\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", a3);
		 ChromeDriver a4=new ChromeDriver();
		 
		 a4.get("chrome://newtab/");
		 System.out.println("Current URL:" + a4.getCurrentUrl());
		 System.out.println("Page Title:" + a4.getTitle());
		 System.out.println("Page Source:" + a4.getPageSource());
		 System.out.println("Page length:" + a4.getTitle().length());
		 a4.close();
	}

}
/*pen a chrome browser
enter vtiger application url
validation login page open or not
remove existing text from username field
type username as 'admin'
remove existing text from password field
type password as 'Test@123'
click on login button*/