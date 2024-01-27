package actionskeys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium.LaunchBrowser;

public class KeyBoardActionsFormFill {
	public static void main(String[] args) {
		WebDriver driver=LaunchBrowser.OpenBrowser("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		WebElement firstname=driver.findElement(By.xpath("//input[@id='userName']"));
		firstname.sendKeys("Nikhil");
		actions.sendKeys(Keys.TAB);
		actions.perform();
		actions.sendKeys("nikhil.barange@gmail.com");
		actions.perform();
		actions.sendKeys(Keys.TAB);
		actions.perform();
		actions.sendKeys("Nagpur,Maharashtra");
		actions.perform();
		actions.keyDown(Keys.CONTROL);
		actions.perform();
		actions.sendKeys("a");
		actions.perform();
		actions.sendKeys("c");
		actions.perform();
		actions.keyUp(Keys.CONTROL);
		actions.perform();
		actions.sendKeys(Keys.TAB);
		actions.perform();
		actions.keyDown(Keys.CONTROL);
		actions.perform();
		actions.sendKeys("v");
		actions.perform();
		actions.keyUp(Keys.CONTROL);
		actions.perform();
		actions.sendKeys(Keys.TAB);
		actions.perform();
		actions.sendKeys(Keys.ENTER);
		actions.perform();
		
		
		
	     
	     
	}

}
