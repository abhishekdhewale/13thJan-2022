package Assignment;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Assi5 {

	public static void main(String[] args){
		  String a1= "D:\\AutomationClasses\\Javasoftware\\Workspace\\SeleniumPractice\\Executables\\geckodriver.exe";
		  System.setProperty("webdriver.gecko.driver", a1);
		  FirefoxDriver a2=new FirefoxDriver();
		   
		  a2.get("https://www.facebook.com/");
		  
		  String expectedtitle="facebook-login";
		  String actualtitle=a2.getTitle();
		  if(actualtitle.equals(expectedtitle)) {
			  System.out.println("facebook");
		  }
		  else {
			  System.out.println("the another page is open");
		  }
		  System.out.println("Home page Title:" + a2.getTitle()); 
		  System.out.println("Page length:" + a2.getCurrentUrl().length());
		  a2.close();
		  
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