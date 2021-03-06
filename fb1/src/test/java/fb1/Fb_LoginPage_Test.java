package fb1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
  
public class Fb_LoginPage_Test {
	WebDriver driver;
	public fb1.Fb_LoginPage_Test lpt;	
	@BeforeTest
	public void setup1() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		

	}
@Test
public void Page_titleTest() {
	System.out.println(driver.getTitle());
	Assert.assertEquals(driver.getTitle(),"Facebook - Log In or Sign Up");
}
@Test
public void  forgot_Link() {
	Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Forgot password?']")).isDisplayed());
}
	

	

@Test
public void login() {
	driver.findElement(By.id("email")).sendKeys("manishaeshva123@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("mn821541");
	driver.findElement(By.name("login")).click();
	Assert.assertEquals(driver.getTitle(),"Facebook - Log In or Sign Up");
}





}







