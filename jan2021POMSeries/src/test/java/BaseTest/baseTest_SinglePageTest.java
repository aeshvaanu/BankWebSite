package BaseTest;

import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;


public class baseTest_SinglePageTest {
WebDriver driver;
Element elementUtil;
public LoginPage loginpage;
	@BeforeTest
	
	public void setup1() {
	    
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://opencart.com/");
		System.out.println(driver.getTitle());
		loginpage = new LoginPage(driver);

 }
	
	
	
	@Test(priority = 1)	
	
	public void pagetitleTest() {
	
		System.out.println("title is:"+ (driver.getTitle()));
		Assert.assertEquals(driver.getTitle(),"OpenCart - Open Source Shopping Cart Solution");
		}
	
	



	@Test(priority = 2)	
	
	public void Login() {
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("naveenanimation20@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium12345");
		driver.findElement(By.xpath("//button[@type='submit'and @class='btn btn-primary btn-lg hidden-xs']")).click();
		//Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[2]/div[1]")),"Your account has exceeded allowed number of login attempts. Please try again in 1 hour.");
		
	}
	@Test(priority = 3)	
	
	public void forgotp_wLink(){
	driver.findElement(By.cssSelector("a.btn-link")).isDisplayed();
	Assert.assertEquals( "Forgoten password Link?","Forgoten password Link?");	
	
	}
	@Test(priority = 4)	
	
	public void clickonForgotp_wLink() {
	driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
	Assert.assertEquals(driver.getTitle(), "OpenCart - Forgotten Password");
	}
@AfterTest
public void teardown() {
driver.quit();

}
}






