package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Practice {
	public static void main(String[] args) {
		
		WebDriver driver=LaunchBrowser.OpenBrowser("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions actions = new Actions(driver);
		actions.contextClick(rightclick);
		actions.perform();
		
		
		
	}

		
	

}
