package ObjectRepositiry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatingNewOrganization {
	

	WebDriver driver;
	public CreatingNewOrganization(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement orgNameBtn;
	
	@FindBy(xpath="//textarea[@name='ship_street']")
	private WebElement shippingAdress;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveBtn;
	
	@FindBy(xpath="//select[@name='industry']")
	private WebElement industryDB;
	
	@FindBy(xpath="//select[@name='accounttype']")
	private WebElement type;
	
	@FindBy(xpath="//input[@id='phone']")
	private WebElement phone;
	
	@FindBy(xpath="//span[@id='dtlview_Phone']")
	private WebElement phoneTxt;
	
	public WebElement getPhoneTxt() {
		return phoneTxt;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getOrgNameBtn() {
		return orgNameBtn;
	}

	public WebElement getShippingAdress() {
		return shippingAdress;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public void create(String organizationName,String organizationName1 )
	{
		orgNameBtn.sendKeys(organizationName);
		Select sel = new Select(industryDB);
		sel.selectByVisibleText(organizationName1);
		
		
	}
	
	public void createType(String organizationName2)
	{
		Select sel1 = new Select(type);
		sel1.selectByVisibleText(organizationName2);
	}
	
	public void createOrg(String organizationName, String namakkal)
	{
		orgNameBtn.sendKeys(organizationName);
		shippingAdress.sendKeys(namakkal);
		saveBtn.click();
	}

	public WebElement getIndustryDB() {
		return industryDB;
	}

	public WebElement getType() {
		return type;
	}

}
