package BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Pages.LoginPage;
import Pages.Product_Page;
import Pages.Product_Result_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
public	WebDriver driver;
public	LoginPage lpg;
public Product_Page ppg;
public  Product_Result_Page prp;
//@Parameters({"WebDriver"})
	
	@BeforeTest
	 public void WebDriverManager() {
	 WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
     driver.manage().deleteAllCookies();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	 driver.get("https://www.SauceDemo.com");
	 lpg=new LoginPage(driver);
	 ppg=new Product_Page(driver);
	 prp=new Product_Result_Page(driver);
	 }

@AfterTest
public void teardown() {
	driver.close();
}

}