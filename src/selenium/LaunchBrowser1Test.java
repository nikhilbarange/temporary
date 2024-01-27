package selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LaunchBrowser1Test {
	WebDriver driver;
	@Parameters("type")
	@BeforeMethod
	public void openBrowser(String type) {
		driver=LaunchBrowser1.openBrowser("https://www.saucedemo.com/v1/", type);
	 	
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
