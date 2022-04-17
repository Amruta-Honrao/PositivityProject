package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	private By LoginLink = By.xpath("//a[text()='Log in']");
	private By Email = By.id("Email");
	private By Password = By.id("Password");
	private By Loginbutton = By.xpath("(//input[@type=\"submit\"])[2]");

	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
		
	
	public void clickLogin()
	{
		driver.findElement(LoginLink).click();
	}
		
	public String getTitle()
	{
		return driver.getTitle();
	}
	
		
	public void dologin(String EmailID, String Pwd)
	{
		driver.findElement(Email).sendKeys(EmailID);
		driver.findElement(Password).sendKeys(Pwd);
		driver.findElement(Loginbutton).click();

		
	}
	public HomePage HomePage()
	{
		return new HomePage();
	}
}
