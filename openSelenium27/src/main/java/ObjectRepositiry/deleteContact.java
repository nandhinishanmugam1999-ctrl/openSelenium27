package ObjectRepositiry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class deleteContact {
	
	WebDriver driver = null;
	
	public deleteContact(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
		
	}

}
