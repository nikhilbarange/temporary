package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static void takeScreenShot(WebDriver driver,String name) throws IOException{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("E:\\screenshot\\"+name+".jpg");
		FileHandler.copy(source, destination);
	}
	public static void main(String[] args) throws IOException{
		WebDriver driver=LaunchBrowser.OpenBrowser("https://www.facebook.com");
		ScreenShot.takeScreenShot(driver, "barange");
		
		
		
	}
	

}
