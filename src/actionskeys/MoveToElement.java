package actionskeys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium.LaunchBrowser;

public class MoveToElement {
	public static void main(String[] args) {
		WebDriver driver=LaunchBrowser.OpenBrowser("https://www.amazon.in");
		WebElement signIn=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(signIn);
		actions.perform();
		
		
	}

}
