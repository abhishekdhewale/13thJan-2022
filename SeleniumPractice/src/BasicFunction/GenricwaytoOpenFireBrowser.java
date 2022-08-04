package BasicFunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenricwaytoOpenFireBrowser
{

	public static void main(String[] args) 
	{
	String a1=".\\Executables\\geckodriver.exe";
	
	System.setProperty("webdriver.gecko.driver", a1);
	
	WebDriver d1=new FirefoxDriver();
	 
	

	}

}
