package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChildBrowserPart2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=LaunchBrowser.OpenBrowser("https://www.naukri.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[@title='Remote']")).click();
		driver.findElement(By.xpath("(//a[@title='MNC'])[2]")).click();
		Set<String>handles=driver.getWindowHandles();
		Iterator<String>i=handles.iterator();
		while(i.hasNext())
		{
			String handle=i.next();
			driver.switchTo().window(handle);
			Thread.sleep(4000);
			String currenttitle=driver.getTitle();
			if(currenttitle.contains("Mnc Job Vacancies"))
			{
				Thread.sleep(4000);
				driver.findElement(By.xpath("//a[@title='Associate']")).click();
				break;
			}
		}
		
	}

}
