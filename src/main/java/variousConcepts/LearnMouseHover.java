package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {
	WebDriver driver;
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.get("https://www.dell.com/en-us");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	}
	@Test
    public void mouseHover() {
		
     	By PRODUCTS_LOCATOR = By.xpath("//span[text()='Products']");
    	By MONITORS_LOCATOR = By.xpath("//a[contains(text(), 'Monitors')]");
        By FOR_HOME_MONITORS_LOCATOR = By.xpath("//a[contains(text(), 'Monitors')]/following-sibiling::ul/descendant::a[2]");
     	By FOR_HOME_MONITORS_LOCATOR_1 = By.xpath("//a[contains(text(), 'Monitors')]/parent::li/descendant::a[3]");
    	
         Actions action = new  Actions(driver);
        action.moveToElement(driver.findElement(PRODUCTS_LOCATOR)).build().perform();
        action.moveToElement(driver.findElement(MONITORS_LOCATOR)).build().perform();
      action.moveToElement(driver.findElement(FOR_HOME_MONITORS_LOCATOR_1)).click();
    	
    }
}
