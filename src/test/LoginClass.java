package test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import page.WebElements;

public class LoginClass{
	

	@Test
	public void loginVerify() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\seleniumalljarfiles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
		WebElements locateElements=PageFactory.initElements(driver,WebElements.class);
		locateElements.loginMethod("Bhavani","Bhavani@1615");
		Thread.sleep(5000);
		driver.quit();
		
	}

}
