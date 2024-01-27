package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Table5 {
	public static void main(String[] args) {
		WebDriver driver=LaunchBrowser.OpenBrowser("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement>currentprice=driver.findElements(By.xpath("(//table//tbody)[2]//tr//td[4]"));
		double min=10000;
		int index=0;
		for(int i=0;i<currentprice.size();i++)
		{
			WebElement row=currentprice.get(i);
			String price=row.getText();
			double cp=Double.parseDouble(price);
			if(min>cp) {
				min=cp;
				index=i;
				index++;
			}
			
		}
		WebElement name=driver.findElement(By.xpath("((//table//tbody)[2]//tr//td[1])["+index+"]"));
		String company=name.getText();
		System.out.println(min+" "+company);
		
	}

}
