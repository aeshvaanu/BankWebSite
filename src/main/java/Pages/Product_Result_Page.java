package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Product_Result_Page {

	
	
	private WebDriver driver;

	public Product_Result_Page(WebDriver driver) {
		this.driver=driver;
	}
	
	public String productresultPage_url() {
	String url=	driver.getCurrentUrl();
	return url;
	}
	
	
	public String gettitle() {
   String title=driver.getTitle();
return title;
	}
	 
	public Menubar_Page menu_button() {
		driver.findElement(By.id("menu_button_container")).click();
		 return Menubar_page(driver);
	}
	

	private Menubar_Page Menubar_page(WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}

	public void clickonProduct() {
		driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]")).click();
	}
	
}
