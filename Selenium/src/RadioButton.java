

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class RadioButton {
public static void main(String[] args) {

		
		System.setProperty("webdriver.gecko.driver", "F:\\Softwares\\selenium web drivers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
	
		List<WebElement> radio = driver.findElements(By.xpath("//input[@name='lang'][@type='radio']"));
//	int count = radio.size();
//	System.out.println(count);
		
		for(int i=0; i<radio.size();i++){
			WebElement local_radio = radio.get(i);
			String value = local_radio.getAttribute("value");
			System.out.println("The values are : "+value);
			
			
			if(value.equalsIgnoreCase("java")){
				local_radio.click();
				
			}
		}
	}
}
