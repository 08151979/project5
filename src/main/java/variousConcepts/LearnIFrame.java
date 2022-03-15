package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnIFrame {
	WebDriver driver;
	
	@Before
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
     @Test
     public void iFrameTest() {
    	
    	driver.switchTo().frame("packageListFrame");
    	driver.findElement(By.linkText("java.awt")).click();
    	
    	
    	driver.switchTo().parentFrame();
    	 driver.switchTo().frame("packageFrame");
    	driver.findElement(By.linkText("Composite")).click();
    //	driver.findElement(By.linkText("Adjustable")).click();
    	
    	
    	driver.switchTo().parentFrame();
    	driver.switchTo().frame("classFrame");
    	driver.findElement(By.xpath("/html/body/div[2]/div[2]/ul[2]/li[4]/a")).click();
    	
    	
    	
    	
//    	 driver.findElement(By.linkText("java.awt.color")).click();
//    	 	driver.findElement(By.linkText("java.applet")).click();
//    	 driver.findElement(By.linkText("java.awt.datatransfer")).click();
    	 
     }
}
