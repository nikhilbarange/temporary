package selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLinksPractice {
	
	public static void main(String[] args) {
		WebDriver driver=LaunchBrowser.OpenBrowser("https://www.facebook.com");
		driver.manage().window().maximize();
		List<WebElement>anchortag=driver.findElements(By.tagName("a"));
		for(int i=0;i<anchortag.size();i++)
		{
			WebElement tag=anchortag.get(i);
			String url=tag.getAttribute("href");
			if(url==null || url.isEmpty())
			{
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}
			try
			{
				URL u = new URL(url);
			HttpURLConnection huc=(HttpURLConnection)(u.openConnection());
			huc.setRequestMethod("HEAD");
			int response=huc.getResponseCode();
			System.out.println(response);
			if(response<300)
			{
				System.out.println(url +" :- URL is valid");
			}
			else
			{
				System.out.println(url +" :- URL is broken");
			}
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}

}
