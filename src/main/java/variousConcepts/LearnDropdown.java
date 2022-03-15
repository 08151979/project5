package variousConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
  
 public class LearnDropdown {
	WebDriver driver;
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		  driver  = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.get("https://techfios.com/billing/?ng/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 //=================================================================================================Above provoking driver
 }
	@Test
	public void loginTest() {
	//Element list
	By USERNAME_LOCATOR = By.xpath("//input[@id='username']");
	By PASSWORD_LOCATOR = By.xpath("//*[@id='password']");
	
	//============================================================here i am login on the website
	By SIGN_BUTTON_LOCATOR = By.xpath("/html/body/div/div/div/form/div[3]/button");
	
	//By DASHBORD_HEADER_LOCATOR = By.xpath("//h2[contains(text(), 'Dashboard')]");
	
	//By ORDERS_MENU_LOCATOR = By.xpath("//*[@id=\"side-menu\"]/li[7]/a");
	
	//By TRANSFER_MENU_LOCATOR = By.xpath("//*[@id=\"select2-account-result-ve34-saving\"]");
	//By ADD_ORDER_MENU_LOCATOR = By.xpath("//*[@id=\"select2-cid-result-te4f-16\"]");
	
	//By PRODUCT_SERVICE_LOCATOR = By.xpath("//select[@id='pid']");
	
	 By CALENDAR_LOCATOR = By.xpath("//*[@id=\"side-menu\"]/li[9]/a/span");
	 By MARCH_LOCATOR = By.xpath("//*[@id=\"calendar\"]/div[1]/div[3]/h2");
	 By MONTH_LOCATOR = By.xpath("//*[@id=\"calendar\"]/div[1]/div[2]/div/button[3]");
	// By DAY_LOCATOR = By.xpath("//*[@id=\"calendar\"]/div[2]/div/table/thead/tr/td/div/table/thead/tr/th[4]");
	 
	//=======================================================================below is driver.findElement is webelment
	driver.findElement(USERNAME_LOCATOR).sendKeys("demo@techfios.com");
	driver.findElement(PASSWORD_LOCATOR).sendKeys("abc123");
	driver.findElement(SIGN_BUTTON_LOCATOR).click();
	//==================================================================================Assert rule can be boolean or equal here we want to customize

	//String dashboardHeaderText = driver.findElement(DASHBOARD_HEADER_LOCATOR).getText();
	//System.out.println(dashboardHeaderText);
	
	//Assert.assertEquals("Wrong page","Dashboard", dashboardHeaderText);
	
	//driver.findElement(TRANSACTIONS_MENU_LOCATOR).click();
	//driver.findElement(TRANSFER_MENU_LOCATOR).click();
	//driver.findElement(ORDERS_MENU_LOCATOR).click();
	//driver.findElement(ORDERS_MENU_LOCATOR).click();
	driver.findElement(CALENDAR_LOCATOR).click();
	driver.findElement(MARCH_LOCATOR).click();
	driver.findElement(MONTH_LOCATOR).click();
	//driver.findElement(DAY_LOCATOR).click();
//	Select sel = new Select(driver.findElement(DAY_LOCATOR));
//	sel.selectByVisibleText("DAY_LOCATOR");
// 
//	List<WebElement> myArray       = sel.getOptions();
//	for(WebElement e : myArray) {
//		System.out.println(e);
//	}
	
	}
	
	
	
			
			
	{
	}
}