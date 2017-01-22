import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ScrollPage {
		
	public void scrollPage() throws Exception{
		
		System.setProperty("webdriver.gecko.driver", "F:\\Softwares\\selenium web drivers\\geckodriver.exe");

		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.facebook.com/");
		 
		  Thread.sleep(5000);
		 
		 // ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
	        JavascriptExecutor js = (JavascriptExecutor)driver;		
	        js.executeScript("scroll(0,400)");
		
	}
}
