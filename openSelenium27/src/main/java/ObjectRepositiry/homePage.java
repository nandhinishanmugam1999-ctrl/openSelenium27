package ObjectRepositiry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class homePage {
WebDriver driver = null;
	
	public homePage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
		
	}

}
