package pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.ElementUtil;

/*
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import ElementUtil;
**/
public class AccountsPage {

	private ElementUtil elementUtil;
	private WebDriver driver;

	private By accSections = By.cssSelector("div#content h2");
	private By header = By.cssSelector("div#logo a");
	private By logoutLink = By.linkText("Logout");
	private By searchField = By.name("search");
	private By searchButton = By.cssSelector("div#search button");


	public AccountsPage(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);

	}

	public String getAccPageTitle() {
		return  driver.getTitle();
	}

	public String getAccPageUrl() {
		return elementUtil.getPageUrl();
	}

	public String getAccPageHeader() {
		return elementUtil.doGetText(header);
	}

	public List<String> getAccountSectionsList() {
		List<String> accSecValList = new ArrayList<>();
		List<WebElement> accSecList = elementUtil.waitForVisibilityOfElements(accSections, 5);
		for (WebElement e : accSecList) {
			accSecValList.add(e.getText());
		}
		Collections.sort(accSecValList);
		return accSecValList;
	}

	public boolean isLogoutExist() {
		return elementUtil.doIsDisplayed(logoutLink);
	}

	//search method:
	public SearchResultPage doSearch(String productName){

		System.out.println("searching the product: " + productName);
		elementUtil.doSendKeys(searchField, productName);
		elementUtil.doClick(searchButton);
		return new SearchResultPage(driver);
	}









}
