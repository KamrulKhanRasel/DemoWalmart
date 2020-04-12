package walmart.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClothingShopAllLocators {
	
	@FindBy(xpath="//div[@class='e_a al_e e_g e_p']")
	public WebElement Sparkmenu;
	
	@FindBy(xpath="//div[@id='vh-spark-main-menu']//button[4]")
	public WebElement Clothingshopall;
	
	@FindBy(xpath="//a[contains(text(),'Shop All Fashion')]")
	public WebElement Shopallfashion;

}
