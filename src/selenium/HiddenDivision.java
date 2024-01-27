package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivision {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=LaunchBrowser.OpenBrowser("https://www.facebook.com");
		WebElement createnewaccount=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		createnewaccount.click();
		Thread.sleep(3000);
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Nikhil");
		WebElement surname=driver.findElement(By.xpath("//input[@name='lastname']"));
		surname.sendKeys("Barange");
		WebElement mobile=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobile.sendKeys("8885858585858585");
		WebElement password=driver.findElement(By.xpath("//input[@id='password_step_input']"));
		password.sendKeys("Nikhil@123");
		WebElement date=driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(date);
		s.selectByIndex(1);
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select se = new Select(month);
		se.selectByValue("12");
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select sel = new Select(year);
		sel.selectByVisibleText("1994");
		WebElement gender=driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		gender.click();
		
		
		
		
	}

}
