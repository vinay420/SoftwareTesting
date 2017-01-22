import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class VerifyPageTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.gecko.driver", "F:\\Softwares\\selenium web drivers\\geckodriver.exe");

			WebDriver driver = new FirefoxDriver();
			driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		
		String title = driver.getTitle();
		System.out.println("The entered URL Title id  :  "+title);
		Assert.assertTrue(title.contains("Selenium"));
		
		
	}

}
