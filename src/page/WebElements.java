package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WebElements {
	WebDriver driver;
	@FindBy(how=How.NAME,using="userName") WebElement username;
	@FindBy(how=How.NAME,using="password") WebElement password;
	@FindBy(how=How.NAME,using="submit") WebElement submit;

	public WebElements(WebDriver driver1)
	{
		this.driver=driver1;
	}
	public void loginMethod(String uid,String upwd)
	{
		username.sendKeys(uid);
		password.sendKeys(upwd);
		submit.click();
	}
	
	

}
