package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IFrames {
	public static void main(String[] args) {
		WebDriver driver=LaunchBrowser.OpenBrowser("https://demoqa.com/frames");
		driver.switchTo().frame("frame1");
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		iframe.getText();
	}

}
