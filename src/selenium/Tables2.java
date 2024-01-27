package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tables2 {

	public static void main(String[] args) {
		WebDriver driver=LaunchBrowser.OpenBrowser("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement>currentprice=driver.findElements(By.xpath("(//table//tbody)[2]//tr//td[4]"));
		for(int i=0;i<currentprice.size();i++)
		{
			WebElement cp=currentprice.get(i);
			System.out.println(cp.getText());
		}
		
	}
}
