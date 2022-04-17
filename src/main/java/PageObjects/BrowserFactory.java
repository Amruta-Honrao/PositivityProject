package PageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory{
	
	private static WebDriver Driver;
	private Properties prop;
	private String Path = System.getProperty("user.dir")+"src\\test\\resources\\file.properties";
	
	BrowserFactory() throws IOException{
		
	FileInputStream ip = new FileInputStream(Path);
	prop = new Properties(); 
	prop.load(ip);
			
	}
		
	public static WebDriver init(String Browser) {
		
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			Driver = new ChromeDriver();
							
		}
		
		else if(Browser.equalsIgnoreCase("FirefFox"))
		{
			WebDriverManager.firefoxdriver().setup();
			Driver = new FirefoxDriver();
			
		}
		
		else if (Browser.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			Driver = new EdgeDriver();
		
			
		}
		return Driver;
		}
	
	public static WebDriver getDriver() {
		return Driver;
	}
	

}