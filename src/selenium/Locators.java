package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {
	public static void main(String[] args) {
		WebDriver driver=LaunchBrowser.OpenBrowser("https://www.facebook.com");
	    //by id	
//		WebElement email=driver.findElement(By.id("email"));
//		email.sendKeys("Nikhil.barange");
		//by name
//		WebElement password=driver.findElement(By.name("pass"));
//		password.sendKeys("12345");
		//by tagname
//		WebElement login=driver.findElement(By.tagName("button"));
//		login.click();
		//by classname
//		WebElement forgot=driver.findElement(By.className("_6ltj"));
//		forgot.click();
		//by css selector
		WebElement email=driver.findElement(By.cssSelector("input[id='email']"));
		email.sendKeys("Ramesh");
	}

}
