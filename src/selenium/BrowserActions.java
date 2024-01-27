package selenium;

import org.openqa.selenium.WebDriver;

public class BrowserActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=LaunchBrowser.OpenBrowser("https://www.facebook.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		driver.close();
	}

}
