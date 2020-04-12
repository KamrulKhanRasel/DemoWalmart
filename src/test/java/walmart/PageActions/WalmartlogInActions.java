package walmart.PageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import walmart.PageElements.WallmartLogInLocators;
import walmart.Utilities.SetupDriver;

public class WalmartlogInActions {
	
	WallmartLogInLocators WallmartLogInLocatorsObj;
	
	public WalmartlogInActions(){
		WallmartLogInLocatorsObj = new WallmartLogInLocators();
		PageFactory.initElements(SetupDriver.driver, WallmartLogInLocatorsObj);
	}

	public void launchwalmarthomepage(){
	SetupDriver.driver.get("https://www.walmart.com/account/login?ref=domain");
	SetupDriver.driver.manage().window().maximize();
	SetupDriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
	}
	
	public void SignIn(){
//		WallmartLogInLocatorsObj.Account.click();
		WallmartLogInLocatorsObj.Signinbutton.click();
	}
	
	public void Username(String username){
		WallmartLogInLocatorsObj.username.sendKeys(username);
		}
	public void Password(String password){
		WallmartLogInLocatorsObj.password.sendKeys(password);
	}
}
 