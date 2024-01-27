package selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SwagLabsLoginTestDataProvider {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		driver=LaunchBrowser.OpenBrowser("https://www.saucedemo.com/v1/");
	 	
	}
	
	@DataProvider
	public Object [] [] loginData(){
		return new Object [] [] 	{{"standard_user","secret_sauce"},
				                     {"locked_out_user","secret_sauce"},
		                             {"problem_user","secret_sauce"},
		                             {"performance_glitch_user","secret_sauce"}
	
                                     };
	}

	@Test (dataProvider = "loginData")
	public void loginToSwagLabStandardUser(String user, String pass) {
		SwagLabLoginPage swagLabLoginPage = new SwagLabLoginPage(driver);
		swagLabLoginPage.enterUserName(user);
		swagLabLoginPage.enterPassWord(pass);
		swagLabLoginPage.clickOnLogin();
	}
}


