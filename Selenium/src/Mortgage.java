
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Mortgage {
	 WebDriver driver;
	    String url;
	    //@BeforeTest
	    public void InitializeCrome(){
	        //System.setProperty("webdriver.chrome.driver","/Users/vinayadepu/Downloads/chromedriver");
	        driver = new ChromeDriver();
	        url="http://www.mortgagecalculator.org";
	        
	    }
	    
	    
	    //@Test
	    public void mortgage(){
	        driver.get(url);
	        String str1="";
	        List<WebElement> options = driver.findElements(By.xpath(".//*[@id='calc']/form/section/section[2]/div/div/div[1]/div/div/div[3]/div[1]/div[1]/div[6]/select[2]/option"));
	           for (WebElement option : options) {
	              if (option.isSelected()) {
	                  str1 = option.getText();
	              }
	           }
	        String str2 = driver.findElement(By.xpath(".//*[@id='calc']/form/section/section[2]/div/div/div[1]/div/div/div[3]/div[2]/div[2]/div[3]/div[1]/h3")).getText();
	        assert (Integer.parseInt(str2.substring(5))-Integer.parseInt(str1)==30);
	        System.out.println("Test mortage passed");
	        
	    }
	    
	   // @AfterTest
	    public void BrowserClose(){
	        driver.close();
	    }
	    
	}

