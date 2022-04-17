package Steps;
import org.openqa.selenium.WebDriver;

import PageObjects.BrowserFactory;
import io.cucumber.java.Before;

public class Hooks {
	
	WebDriver driver;

@Before
public void launchbrowser() {
	
driver = BrowserFactory.init("Chrome");
driver.get("http://demowebshop.tricentis.com/");

	
}
}
