package BasicFunction;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle
{

	public static void main(String[] args)
	{
      String a1="D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\Executables\\chromedriver.exe";
      
	  System.setProperty("webdriver.chrome.driver", a1);
	  
	  ChromeDriver a2=new ChromeDriver();
	  
	  a2.get("https://www.google.co.in");
	  
	  String sourcecode=a2.getPageSource();
	  System.out.println("Application source code:" + sourcecode);
	  System.out.println("Source code length:" + sourcecode.length());
	  
	  System.out.println("Application currnt URL:" + a2.getCurrentUrl());
	  System.out.println("Application current title:" + a2.getTitle());
	  a2.close();
	  
	}

}
