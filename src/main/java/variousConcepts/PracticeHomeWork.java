package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeHomeWork {
	 WebDriver driver;
	 @Before
     public void init() {
    	 System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
    	 driver = new ChromeDriver();
    	 driver.manage().deleteAllCookies();
    	 driver.manage().window().maximize();
    	 driver.get("https://techfios.com/billing/?ng/");
    	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     }
     @Test
      public void work() {
    	 driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
			driver.findElement(By.id("password")).sendKeys("abc123");
     	 
     	 
     
   	     // driver.findElement(EMAIL_LOCATOR).sendKeys("san.ja@gmail.com");
     	 
			driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
			driver.findElement(By.id("password")).sendKeys("abc123");
    	 
    	 
    	 
    	 Actions action = new Actions(driver);
     	
     	
    	 action.sendKeys(Keys.ENTER).build().perform();
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
      }
}