package ObjectRepositiry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganizationPopupPage {
	
	WebDriver driver = null;

	// Constructor
	public OrganizationPopupPage(WebDriver driver)
	{
		this.driver = driver;
	}

	/**
	 * This method returns dynamic organization element
	 * based on organization name
	 */
	public WebElement getOrganizationName(String organizationName)
	{
		return driver.findElement(
				By.xpath("//a[text()='"+organizationName+"']"));
	}

	/**
	 * Business Library Method
	 * This method clicks on organization name
	 */
	public void selectOrganization(String organizationName)
	{
		getOrganizationName(organizationName).click();
	}
}


