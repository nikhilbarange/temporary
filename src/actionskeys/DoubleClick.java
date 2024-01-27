package actionskeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium.LaunchBrowser;

public class DoubleClick {
	public static void main(String[] args) {
		WebDriver driver=LaunchBrowser.OpenBrowser("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions actions = new Actions(driver);
		actions.doubleClick(doubleclick);
		actions.perform();
		
		
	}

}
