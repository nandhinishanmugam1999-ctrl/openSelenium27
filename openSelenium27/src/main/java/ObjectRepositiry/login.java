package ObjectRepositiry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	
	
	WebDriver driver = null;
	public login(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="name")
	private WebElement namebtn;
	
	
	public WebElement getNamebtn() {
		return namebtn;
	}
	
	

}
