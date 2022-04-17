package Run;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//java//Features",
glue = "Steps",
plugin =  {"html:target/cucumber-reports.html"},
monochrome = true)

public class Runner extends AbstractTestNGCucumberTests {
	

}
