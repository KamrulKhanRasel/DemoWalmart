package walmart.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WallmartLogInLocators {
	@FindBy (xpath="//span[contains(text(),'Account')]")
	public WebElement Account;
	
	@FindBy (xpath="//div[contains(text(),'Sign In')]")
	public WebElement SignIn;
	
	@FindBy (xpath="//input[@id='email']")
	public WebElement username;
	
	@FindBy (xpath="//input[@id='password']")
	public WebElement password;
	
	@FindBy (xpath="//button[@class='button m-margin-top text-capitalize'][contains(text(),'Sign in')]")
	public WebElement Signinbutton;
	
}
