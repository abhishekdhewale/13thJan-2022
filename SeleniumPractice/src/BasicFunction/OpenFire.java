package BasicFunction;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFire 
{

	public static void main(String[] args)
	{
      String DriverPath ="D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\Executables\\geckodriver.exe";
		
    		  System.setProperty("webdriver.gecko.driver", DriverPath );
    		  
    		  FirefoxDriver cdriver = new  FirefoxDriver();

	}

}
