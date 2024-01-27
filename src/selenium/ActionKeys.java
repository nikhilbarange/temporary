package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionKeys {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=LaunchBrowser.OpenBrowser("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement sign=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.moveToElement(sign);
		actions.perform();
		
	}

}
