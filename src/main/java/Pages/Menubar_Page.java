package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.ElementUtil;

public class Menubar_Page {
	
	
	private WebDriver driver;
	private ElementUtil eutil;
	
	By menubarbutton= By.cssSelector("button#react-burger-menu-btn");

	public Menubar_Page(WebDriver driver) {
		this.driver= driver;
	}
   
	public void menubar() {
		driver.findElement(menubarbutton).click();
		driver.findElement(By.xpath("//a[@id='inventory_sidebar_link']")).click();
	}
	
}
