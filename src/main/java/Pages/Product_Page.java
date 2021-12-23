package Pages;

import java.security.PrivateKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.ElementUtil;

public class Product_Page {
	
private WebDriver driver;
private ElementUtil eutil;

private By productHeader= By.cssSelector("span.title");
private By SauceLabsBackpack =By.xpath("(//div[@class='inventory_item_name'])[1]");
private By ADD_To_cart= By.id("add-to-cart-sauce-labs-backpack");


	public Product_Page(WebDriver driver) {
		this.driver=driver;
		eutil=new ElementUtil(driver);
	}

	public void product_Page_Url() {
		driver.getCurrentUrl();
		
	}
	 public String productHeader() {
		  return driver.findElement(productHeader).getText();
	 }

	public void  ADD_TO_CART() {
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		
	
	}
	public Product_Result_Page  Product_detail() {
		driver.findElement(SauceLabsBackpack).click();
		return Product_Result_Page(driver);
	}

	
	

	private Product_Result_Page Product_Result_Page(WebDriver driver2) {
		// TODO Auto-generated method stub
		return null;
	}

	public String product() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	}

	

