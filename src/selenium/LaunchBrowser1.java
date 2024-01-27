package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser1 {
	
public static WebDriver openBrowser(String url,String browser) {
	WebDriver driver = null;
	if(browser.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	else if(browser.equals("edge"))
	{
		System.setProperty("webdriver.edge.driver", "E:\\JAVA\\msedgedriver.exe");
		driver = new EdgeDriver();
	}
	driver.get(url);
	driver.manage().window().maximize();
	return driver;
}

}
