package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
//This method returns a WebDrivewr object
	public static WebDriver open(String browserType)
	{
		WebDriver driver = null;
		if(browserType.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTesting\\jar files\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserType.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "D:\\SeleniumTesting\\jar files\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		return driver;
	}
}
