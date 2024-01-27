package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static WebDriver OpenBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "E:\\JAVA\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		return driver;
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=LaunchBrowser.OpenBrowser("https://www.facebook.com");
		String title=driver.getTitle();
		System.out.println(title);
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
		
		
		
	}
	
		
	
	

}
