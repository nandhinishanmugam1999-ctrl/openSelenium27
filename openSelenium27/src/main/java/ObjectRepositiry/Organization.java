package ObjectRepositiry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organization {
	
	WebDriver driver;
	public Organization(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
    @FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createNewOrgBtn;
	
	

	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createcontactBtn;
	
	
	public WebElement getCreateOrgBtn() {
		return createcontactBtn;
	}
	
	public WebElement getCreateNewOrgBtn() {
		return createNewOrgBtn;
	}
	
	

}
