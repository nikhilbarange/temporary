package basic;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import selenium.LaunchBrowser;

public class FaceBookLoginTestPage {
	
	@Test(priority =1)
	public void loginWithValidCredentials() {
		WebDriver driver=LaunchBrowser.OpenBrowser("https://www.facebook.com");
		FaceBookLoginPage faceBookLoginPage = new FaceBookLoginPage(driver);
		faceBookLoginPage.enterEmailID("Nikhil.barange");
		faceBookLoginPage.enterPassword("12345");
		faceBookLoginPage.clickOnLogin();
		driver.close();
	}
	
	@Test(priority =2)
	public void loginWithInvalidUserNameAndValidPassword() {
		WebDriver driver=LaunchBrowser.OpenBrowser("https://www.facebook.com");
		FaceBookLoginPage faceBookLoginPage = new FaceBookLoginPage(driver);
		faceBookLoginPage.enterEmailID("barange");
		faceBookLoginPage.enterPassword("12345");
		faceBookLoginPage.clickOnLogin();
		driver.close();
		
	}
	@Test(priority =3)
	public void loginWithValidUsernameAndInvalidPassword() {
		WebDriver driver=LaunchBrowser.OpenBrowser("https://www.facebook.com");
		FaceBookLoginPage faceBookLoginPage = new FaceBookLoginPage(driver);
		faceBookLoginPage.enterEmailID("Nikhil.barange");
		faceBookLoginPage.enterPassword("a");
		faceBookLoginPage.clickOnLogin();
		driver.close();
	}
	public static void main(String[] args) {
		FaceBookLoginTestPage faceBookLoginTestPage = new FaceBookLoginTestPage();
		faceBookLoginTestPage.loginWithValidCredentials();
		faceBookLoginTestPage.loginWithValidUsernameAndInvalidPassword();
		faceBookLoginTestPage.loginWithInvalidUserNameAndValidPassword();
	}
	
	
}
