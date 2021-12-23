package tests;

import java.util.Properties;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseTest.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import utils.Constants;

public class LoginPageTest extends BaseTest  {



		@Description("login Page Title Test")
		@Severity(SeverityLevel.NORMAL)
		@Test(priority = 1)
		public void loginPageTitleTest() {
			String title = loginPage.getLoginPageTitle();
			System.out.println("login page title is: " + title);
			Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE);
		}

		@Description("login Page URL Test")
		@Severity(SeverityLevel.MINOR)
		@Test(priority = 2, enabled = true)
		public void loginPageUrlTest() {
			String url = loginPage.getLoginPageUrl();
			Assert.assertTrue(url.contains(Constants.LOGIN_URL_VALUE));
		}

		@Description("login Page forgot pwd link test")
		@Severity(SeverityLevel.CRITICAL)
		@Test(priority = 3)
		public void forgotPwdLinkTest() {
			Assert.assertTrue(loginPage.isForgotPwdLinkExist());
		}

		@Description("login Test")
		@Severity(SeverityLevel.BLOCKER)
		@Test(priority = 4)
		public void loginTest() {


		Properties prop = new Properties();
		loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		}

		@DataProvider
		public Object[][] loginNegativeData(){
			return new Object[][]  {
								{"test@gmail.com", "test@123"},
								{" " ,"test@123"},
								{" ", " "},
										};
		}

		@Test(priority = 0, dataProvider = "loginNegativeData", enabled = false)
		public void loginNegativeTest(String un, String pwd) {
			loginPage.doLoginWrongData(un, pwd);
		}








	}
