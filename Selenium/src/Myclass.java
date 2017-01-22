import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Myclass {
	public static void main(String[] args) {
        
        //initialize Chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-2.35.0\\chromedriver_win32_2.2\\chromedriver.exe");        
         WebDriver driver = new ChromeDriver(); 
          
         //Open gmail
         driver.get("http://www.gmail.com");
          
         // Enter userd id
         WebElement element = driver.findElement(By.id("Email"));
         element.sendKeys("xyz@gmail.com");
          
         //wait 5 secs for  userid to be entered
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
          
         //Enter Password
         WebElement element1 = driver.findElement(By.id("Passwd"));
         element1.sendKeys("Password");
          
         //Submit button
         element.submit();
          
          
         driver.findElement(By.id("gbg4")).click();
          
         //press signout button
 driver.findElement(By.id("gb_71")).click();   
          

}
}
