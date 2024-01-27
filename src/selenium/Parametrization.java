package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Parametrization {
	public static String getStringValue(String name,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("E:\\Book1.xlsx");
		String value=WorkbookFactory.create(file).getSheet(name).getRow(row).getCell(cell).getStringCellValue();
		return value;
		
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver=LaunchBrowser.OpenBrowser("https://www.facebook.com");
		String emailID=Parametrization.getStringValue("nik", 0, 0);
		String password=Parametrization.getStringValue("nik", 1, 0);
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys(emailID);
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys(password);
		
	}
	
	
		
		
	

}
