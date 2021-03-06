package fb1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class homePage_Test {
 
 public WebDriver driver;
 
@BeforeTest
public void setup1() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
}
	@Test(priority = 1)
	public void login() {
		driver.findElement(By.id("email")).sendKeys("manishaeshva123@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("mn821541");
		driver.findElement(By.name("login")).click();
		Assert.assertEquals(driver.getTitle(),"Facebook - Log In or Sign Up");
	}

	@Test(priority = 2)
   public void homeManisha() {
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	 driver.findElement(By.xpath("//span[text()='Manisha Patel']")).click();
	Assert.assertEquals(driver.getTitle(),"Facebook");
   }
@Test(priority = 3)
   public void friendsLink() {
 driver.findElement(By.xpath("//span[text()='Friends']")).click();
	   Assert.assertEquals(driver.getTitle(), "Facebook");
   }
   
}
