package automationpractice;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage_Test {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		
		
		
			WebDriverManager.chromedriver().setup();
			driver=(WebDriver) new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.get("https://www.facebook.com");
		
	}

@Test
public void titleTest() {
	driver.getTitle();
	Assert.assertEquals(driver.getTitle(), "");
}

}
