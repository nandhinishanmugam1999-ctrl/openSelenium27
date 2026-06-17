package ObjectRepositiry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	
	WebDriver driver = null;
	public SearchPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement search_txt;
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement search;

	public WebElement getSearch_txt() {
		return search_txt;
	}

	public WebElement getSearch() {
		return search;
	}
	
	public void SearchToApp(String organizationName)
	{
		search_txt.sendKeys(organizationName);
	}
    
	
}
