package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Table3 {

	public static void main(String[] args) {
		WebDriver driver=LaunchBrowser.OpenBrowser("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement>currentprice=driver.findElements(By.xpath("(//table//tbody)[2]//tr//td[4]"));
		double max=0;
		int index=0;
		
		for(int i=0;i<currentprice.size();i++)
		{
			WebElement row=currentprice.get(i);
			String price=row.getText();
			double cp=Double.parseDouble(price);
			if(cp>max)
			{
				 max=cp;
				 index = i++;	
				 
			}
		 		
			
		}
	
		WebElement heading=driver.findElement(By.xpath("((//table//tbody)[2]//tr//td[1])["+index+"]"));
		System.out.println(max+" "+heading.getText());
		
		
	}
}
