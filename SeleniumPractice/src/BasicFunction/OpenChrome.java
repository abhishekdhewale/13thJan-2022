package BasicFunction;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome 
{

	public static void main(String[] args) 
	{
        	String driverPath = "D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\src\\BasicFunction\\OpenChrome.java";
        	
        	//System.setProperty(driverPath, "webdriver.chrome.driver");
        	System.setProperty("webdriver.chrome.driver",driverPath);
        	ChromeDriver cdriver=new ChromeDriver();
	}

}
