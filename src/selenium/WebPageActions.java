package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;

public class WebPageActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=LaunchBrowser.OpenBrowser("https://www.facebook.com");
		Navigation nav = driver.navigate();
		nav.back();
		Thread.sleep(2000);
		nav.forward();
		Thread.sleep(2000);
		nav.refresh();
		Thread.sleep(2000);
		//with method chaining
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		
	}

}
