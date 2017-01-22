import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class FacebookRegistration {

	public static void main(String[] args) {

		
		///Users/vinayadepu/Downloads
		System.setProperty("webdriver.gecko driver", "/Users/vinayadepu/Downloads");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[1]/div[1]/div/div/input")).sendKeys("Test Selenium");
		
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[2]/div[5]/span/span[2]/input")).click();
		
		Select sel1=new Select(driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[2]/div[4]/div[2]/span/span/select[1]")));
		
		sel1.selectByVisibleText("Sep");
		
		Select sel2=new Select(driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[2]/div[4]/div[2]/span/span/select[2]")));
		
		sel2.selectByValue("6");
		
		Select sel3=new Select(driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[2]/div[4]/div[2]/span/span/select[3]")));
		
		sel3.selectByIndex(6);
		
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[2]/div[7]/button")).click();
		
		
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/a")).click();
		
		driver.navigate().back();
		
		driver.quit();
		
				
	}

}
