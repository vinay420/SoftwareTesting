package vinay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Vinay {
	public static void main(String []args){
		
	
	System.setProperty("webdriver.chrome.driver", "Users\\vinayadepu\\Downloads\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

//d.get("https://www.google.com/");
driver.get("http://brewformulas.org/geckodriver");
}

}


