package Pages_Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseTest.BaseTest;

public class LoginPage_Test extends BaseTest {

 
	
	
	 @Test
	 public void titleTest() {
	String Title=driver.getTitle();
	Assert.assertEquals(Title,"Swag Labs");
	 }

  @Test
  public void loginpageurl() {
	 Assert.assertEquals(lpg.getUrl(),"https://www.saucedemo.com/inventory.html");
  }
 @Test
 public void ProductPage_get() {
         lpg.Login();
	 Assert.assertEquals(driver.getTitle(),"Swag Labs");
	
 }
 
//
// @DataProvider(name="TestData")
// public Object[][] getData()
// {
//	 Object[][]data=new Object[3][2];
//	 data[0][0]="problem_user";
//	 data[0][1]="secret_sauce";
//	 
//	 data[0][0]="locked_out_user";
//	 data[0][1]="secret_sauce";
//	return data;
// }
//@Test(dataProvider="TestData")	
//public void login(String username, String password) {
//driver.findElement(By.id(username)).clear();
//driver.findElement(By.id(username)).sendKeys(username);
//	driver.findElement(By.id(password)).clear();
//	driver.findElement(By.id(password)).sendKeys(password);
//
//}
}
