package tests;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginpageTest {
	
	@BeforeTest
   WebDriver driver;
   WebDriverManager.chromrdriver().setup();
}
