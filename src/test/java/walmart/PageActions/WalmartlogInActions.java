package walmart.PageActions;

import java.util.concurrent.TimeUnit;

import walmart.PageElements.WallmartLogInLocators;
import walmart.Utilities.SetupDriver;

public class WalmartlogInActions {
	
	WallmartLogInLocators WallmartLogInLocatorsObj = new WallmartLogInLocators();

	public void launchwalmarthomepage(){
	SetupDriver.driver.get("https://www.walmart.com/");
	SetupDriver.driver.manage().window().maximize();
	SetupDriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
	}
	
	public void SignIn(){
		WallmartLogInLocatorsObj.Account.click();
		WallmartLogInLocatorsObj.SignIn.click();
	}
	
	public void Username(String username){
		WallmartLogInLocatorsObj.username.sendKeys(username);
		}
	public void Password(String password){
		WallmartLogInLocatorsObj.password.sendKeys(password);
	}
}
 