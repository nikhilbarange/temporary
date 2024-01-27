package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class PositonAndSizeOfBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=LaunchBrowser.OpenBrowser("https://www.facebook.com");
		Dimension d = new Dimension(200,400);
		driver.manage().window().setSize(d);
		Thread.sleep(3000);
		Point p = new Point(500,600);
		driver.manage().window().setPosition(p);
		String title=driver.getTitle();
		System.out.println(title);
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		
	}

}
