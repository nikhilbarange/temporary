package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tables {
	
	public static void main(String[] args) {
		WebDriver driver=LaunchBrowser.OpenBrowser("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement>headings=driver.findElements(By.xpath("//table//thead//tr//th"));
		for(int i=0;i<headings.size();i++)
		{
			WebElement heading=headings.get(i);
			System.out.println(heading.getText());
		}
	}
}
