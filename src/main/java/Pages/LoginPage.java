package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.inject.spi.Element;

import Utils.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage   {
 
 private WebDriver driver;
 private ElementUtil eutil;
//by locator
  private By username= By.id("user-name");
  private By password=By.id("password");
  private By LoginButton= By.id("login-button");
 
  //constuctor
  public LoginPage(WebDriver driver) {
	  this.driver=driver;
	  eutil= new ElementUtil(driver);
  }
 
  
  //page Action
   public String LoginPageTitle() {
	 return  driver.getTitle();
	   
   }
  public String getUrl() {
	 return eutil.getPageUrl();
  }
 public Product_Page Login() {
	 driver.findElement(username).sendKeys("standard_user");
	 driver.findElement(password).sendKeys("secret_sauce");
	 driver.findElement(LoginButton).click();
	 return new Product_Page(driver);
 }

}
