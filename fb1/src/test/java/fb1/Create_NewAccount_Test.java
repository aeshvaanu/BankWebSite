package fb1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Create_NewAccount_Test {
	private static final String WebElement = null;
	WebDriver driver;
	@BeforeClass 
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		}

	@Test
	public void Create_New_Account(){
	driver.findElement(By.xpath("//div[@class='_6ltg']//a[text()='Create new account']")).click();
Assert.assertEquals(driver.findElement(By.xpath("//div[@class='pvl _52lp _59d-']//div[text()='Sign Up']")).getText(),"Sign Up");
	}
	 
	 @Test
	 public void Signup() {
		 
		 driver.findElement(By.name("firstname")).sendKeys("rena");
		 driver.findElement(By.name("lastname")).sendKeys("patel");
		 driver.findElement(By.name("reg_email__")).sendKeys("aeshaaenu11@gmail.com");
		 driver.findElement(By.name("reg_email_confirmation__")).sendKeys("aeshaaenu11@gmail.com");
		 driver.findElement(By.name("reg_passwd__")).sendKeys("mn821541");
		 
	 
		 
	 
			
			Select select=new Select(driver.findElement(By.id("month")));
			 select.selectByVisibleText("Nov");
			 Select select1= new Select(driver.findElement(By.id("day")));
			 select1.selectByVisibleText("16");
			 Select select2=new Select(driver.findElement(By.id("year")));
			 select2.selectByVisibleText("2002");
			 
			 
			driver.findElement(By.xpath("//label[text()='Female']")).click();
			driver.findElement(By.xpath("//label[text()='Male']")).click();
			driver.findElement(By.xpath("//label[text()='Custom']")).click();
			
			Select select3= new Select(driver.findElement(By.name("preferred_pronoun")));
			 select3.selectByVisibleText("He: \"Wish him a happy birthday!\"");
			 
			 driver.findElement(By.name("custom_gender")).sendKeys("ok");
			 driver.findElement(By.name("websubmit")).click();
			 driver.navigate().forward();
			 Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
			 
		}		
	
	
	
	
	}
	
