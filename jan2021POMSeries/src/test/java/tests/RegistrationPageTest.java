package tests;

import java.util.Random;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseTest.BaseTest;
import utils.Constants;
import utils.Excelutil;

public class RegistrationPageTest extends BaseTest{

	@BeforeClass
	public void setupRegister() {
		registrationPage = loginPage.navigateToRegisterPage();
	}

	@DataProvider
	public Object[][] getRegisterData() throws InvalidFormatException {
		Object regData[][] = Excelutil.getTestData(Constants.REGISTER_SHEET_NAME);
		return regData;
	}

	public String getRandomNumber() {
		Random randomGenerator = new Random();
		String email = "testautomation" + randomGenerator.nextInt(1000) + "@gmail.com";
		return email;
	}

	@Test(dataProvider = "getRegisterData")
	public void userRegistrationTest(String firstName, String lastName,
									String telephone,
									String password, String subsribe) {

		AssertJUnit.assertTrue
						(registrationPage.accountRegistration(firstName,  lastName,
								getRandomNumber(),  telephone,
				 				password,  subsribe));
	}






}


