package PageObjectsPackage;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BaseObjects {

	@FindBy(xpath = "//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[text()='Women']")
	private WebElement womenTab;
	
	@FindBy(xpath = "//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[text()='Dresses']")
	private WebElement dressesTab;
	
	@FindBy(xpath = "//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[text()='T-shirts']")
	private WebElement tShirtsTab;
	
	@FindBy(xpath="//div[@id='columns']")
	private WebElement womenpage;
	
	
	
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}

	public boolean isWomenTabPresent()
	{
		return elementFound(womenTab);
	}
	
	public boolean isDressesTabPresent()
	{
		return elementFound(dressesTab);
	}
	
	public boolean isTShirtTabPresent()
	{
		return elementFound(tShirtsTab);
	}
	
	public void WomenPageClick()
	
	{
		womenTab.click();
	}
	
	public void DressesPageClick()
	{
		dressesTab.click();
	}
	public void TshirtPageClick()
	{
		tShirtsTab.click();
	}

}

