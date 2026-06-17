package ObjectRepositiry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	WebDriver driver;
	public Home(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='Organizations']")
	private WebElement orglink;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactlink;
	
	@FindBy(linkText="More")
	private WebElement morelink;
	
	@FindBy(linkText="Campaigns")
	private WebElement campaignslink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement adminImg;
	
	@FindBy(linkText="Sign Out")
	private WebElement signOtn;
	
	
	public WebElement getMorelink() {
		return morelink;
	}

	public WebElement getCampaignslink() {
		return campaignslink;
	}

	public WebElement getOrglink() {
		return orglink;
	}

	public WebElement getContactlink() {
		return contactlink;
	}
	public void navigateToCampaginPage()
	{
		Actions act = new Actions(driver);
		act.moveToElement(morelink).perform();
		campaignslink.click();
		
	}
	public void logout()
	{
		Actions act = new Actions(driver);
		act.moveToElement(adminImg).perform();
		signOtn.click();
	}

	}


