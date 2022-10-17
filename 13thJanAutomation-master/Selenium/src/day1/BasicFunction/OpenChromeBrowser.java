package day1.BasicFunction;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		
		String driverPath1="D:\\Software\\Java\\workspace\\Selenium\\executables\\chromedriver.exe";	
	//or
		String driverPath2=".\\executables\\chromedriver.exe";
	//or
		String driverPath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		
			System.setProperty("webdriver.chrome.driver", driverPath1);
			
			ChromeDriver cdriver= new ChromeDriver();
	}
}