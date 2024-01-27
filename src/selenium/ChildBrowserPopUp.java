package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChildBrowserPopUp {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=LaunchBrowser.OpenBrowser("https://www.naukri.com");
	driver.manage().window().maximize();
	Thread.sleep(8000);
	driver.findElement(By.xpath("//a[@title='Remote']")).click();
	driver.findElement(By.xpath("(//a[@title='MNC'])[2]")).click();
	Set<String>handles=driver.getWindowHandles();
	Iterator<String>i=handles.iterator();
	for(int a=1;a<=handles.size();a++)
	{
		String handle=i.next();
		driver.switchTo().window(handle);
		Thread.sleep(2000);
		String currenttitle=driver.getTitle();
		if(currenttitle.contains("Mnc Job Vacancies"))
		{
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@title='Senior Software Engineer']")).click();
		}
	}
	
	
		
	
	}
}
