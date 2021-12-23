package BaseTest;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import factory.DriverFactory;
import listener.TestAllureListener;
import pages.AccountsPage;
import pages.CommonsPage;
import pages.LoginPage;
import pages.ProductInfoPage;
import pages.RegistrationPage;
import pages.SearchResultPage;

@Listeners(TestAllureListener.class)
public class BaseTest {


	
	public DriverFactory df;
	public WebDriver driver;
	public Properties prop;

	public LoginPage loginPage;
	public AccountsPage accPage;
	public SearchResultPage searchResPage;
	public ProductInfoPage productInfoPage;
	public RegistrationPage registrationPage;
	public CommonsPage commonsPage;
	@Parameters({"browser"})

	@BeforeTest

	public void setUp(String browser) {
		df = new DriverFactory();
		prop = df.init_prop();
		prop.setProperty("browser", browser);
		driver=df.init_driver("browser");
		loginPage = new LoginPage(driver);
		commonsPage = new CommonsPage(driver);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}

	

