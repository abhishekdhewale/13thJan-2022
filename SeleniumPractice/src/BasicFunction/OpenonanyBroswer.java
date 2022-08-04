package BasicFunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenonanyBroswer
{


	public static void main(String[] args) 
	{
		String gecokdriver=System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
        String chromedriver=System.getProperty("ussr.dir")+"\\Executables\\chromedriver.exe";
        
        openanyBroswer(gecokdriver,"firefox");
        //openanyBroswer(chromedriver,"Chrome");
	
	}
    static void openanyBroswer(String driverpath , String broswername) 
    {
    	if (broswername.equalsIgnoreCase("Chrome")) 
    	{
    	System.setProperty("webdriver.chrome.driver", driverpath);
        WebDriver d2=new ChromeDriver();
    	}
    	else if(broswername.equalsIgnoreCase("firefox")) 
    	{
        System.setProperty("webdriver.gecko.driver", driverpath);
        WebDriver d3=new FirefoxDriver();
    	}
    }
}
