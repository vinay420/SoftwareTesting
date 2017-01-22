import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		 
	       WebDriver driver=new FirefoxDriver();
	 
	       driver.manage().window().maximize();
	 
	       driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.SECONDS);
	 
	       driver.get("http://learn-automation.com/");
}
}