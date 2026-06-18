package ObjectRepositiry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class alterpage {
	
	
WebDriver driver = null;
	
	public alterpage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
		
	}


}
