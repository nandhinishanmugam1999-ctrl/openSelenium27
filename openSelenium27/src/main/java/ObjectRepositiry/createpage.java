package ObjectRepositiry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class createpage {
	
WebDriver driver = null;
	
	public createpage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
		
	}


}
