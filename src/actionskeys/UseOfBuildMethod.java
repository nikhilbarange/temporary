package actionskeys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium.LaunchBrowser;

public class UseOfBuildMethod {
	public static void main(String[] args) {
		WebDriver driver=LaunchBrowser.OpenBrowser("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		WebElement firstname=driver.findElement(By.xpath("//input[@id='userName']"));
		firstname.sendKeys("Nikhil Barange");
		actions.sendKeys(Keys.TAB);
		actions.sendKeys("nikhil.barange@gmail.com");
		actions.sendKeys(Keys.TAB);
		actions.sendKeys("Nagpur,Maharashtra");
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("a");
		actions.sendKeys("c");
		actions.keyUp(Keys.CONTROL);
		actions.sendKeys(Keys.TAB);
		actions.keyDown(Keys.CONTROL);
		actions.sendKeys("v");
		actions.keyUp(Keys.CONTROL);
		actions.sendKeys(Keys.TAB);
		actions.sendKeys(Keys.ENTER);
		actions.build().perform();
	}

}
