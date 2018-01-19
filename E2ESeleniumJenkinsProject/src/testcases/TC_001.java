package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_001 {
	
	public static WebDriver driver;
	
	@Test
	
	public void testcase1(){
		
		
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//testLibrary//Chromdriver_mac//chromedriver");
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		
				driver.get("https://www.facebook.com/");
				driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Hello");
				driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Hello");
			//	driver.quit();

	}

}
