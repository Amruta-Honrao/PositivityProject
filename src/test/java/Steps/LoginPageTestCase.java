package Steps;



import org.testng.Assert;

import PageObjects.BrowserFactory;
import PageObjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginPageTestCase {
	
	private LoginPage lp = new LoginPage(BrowserFactory.getDriver());
	
	
	
	@When("Click on login")
	public void Click_on_login() {
		
		lp.clickLogin();
	}
	
	
	@Then("Verify the Homepage title is {string}")
	public void Verify_the_Homepage(String ExpectedTitle){
		String ActualTitle = lp.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
	}
	
	@Then("Enter the EmaiID {string} and Password {string}")
	public void enter_the_emai_id_and_password(String string, String string2) {
		lp.dologin(string, string2);
	}
}
