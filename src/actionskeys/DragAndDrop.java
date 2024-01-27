package actionskeys;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import selenium.LaunchBrowser;

public class DragAndDrop {
	public static void main(String[] args) {
		WebDriver driver=LaunchBrowser.OpenBrowser("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		List<WebElement>source=driver.findElements(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));
	    WebElement target=driver.findElement(By.xpath("//div[@id='trash']"));
	    Actions actions = new Actions(driver);
	    for(int i=0;i<source.size();i++)
	    {
	    	WebElement element=source.get(i);
	    	actions.dragAndDrop(element, target);
	    	actions.perform();
	    }
		
		
	}

}
