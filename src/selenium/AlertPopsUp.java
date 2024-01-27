package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPopsUp {
	public static void main(String[] args) {
		WebDriver driver=LaunchBrowser.OpenBrowser("https://nxtgenaiacademy.com/alertandpopup/");
		WebElement prompt=driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
		prompt.click();
//		Alert alert=driver.switchTo().alert();
//		alert.sendKeys("No");
//		alert.accept();
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}

}
