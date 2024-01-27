package selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabLoginTest {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		driver=LaunchBrowser.OpenBrowser("https://www.saucedemo.com/v1/");
	}
	
   @Test
   public void loginWithStandard() {
	   SwagLabLoginPage swagLabLoginPage = new SwagLabLoginPage(driver);
	   swagLabLoginPage.enterUserName("standard_user");
	   swagLabLoginPage.enterPassWord("secret_sauce");
	   swagLabLoginPage.clickOnLogin();   
   }
   @Test
   public void loginWithLocked() {
	   SwagLabLoginPage swagLabLoginPage = new SwagLabLoginPage(driver);
	   swagLabLoginPage.enterUserName("locked_out_user");
	   swagLabLoginPage.enterPassWord("secret_sauce");
	   swagLabLoginPage.clickOnLogin();
   }
   @Test
   public void loginWithProblem() {
	   SwagLabLoginPage swagLabLoginPage = new SwagLabLoginPage(driver);
	   swagLabLoginPage.enterUserName("problem_user");
	   swagLabLoginPage.enterPassWord("secret_sauce");
	   swagLabLoginPage.clickOnLogin();
   }
   @Test
   public void loginWithGlitch() {
	   SwagLabLoginPage swagLabLoginPage = new SwagLabLoginPage(driver);
	   swagLabLoginPage.enterUserName("performance_glitch_user");
	   swagLabLoginPage.enterPassWord("secret_sauce");
	   swagLabLoginPage.clickOnLogin();
   }
   
   public static void main(String[] args) {
	SwagLabLoginTest swagLabLoginTest = new SwagLabLoginTest();
	swagLabLoginTest.loginWithStandard();
	swagLabLoginTest.loginWithLocked();
	swagLabLoginTest.loginWithProblem();
	swagLabLoginTest.loginWithGlitch();
}
	
}


