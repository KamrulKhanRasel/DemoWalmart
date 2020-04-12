package walmart.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomensHandBagLocators {
	
	@FindBy(xpath="//button[@class='f_a al_c f_c']//img")
	public WebElement Sparkmenu;
	
	@FindBy(xpath="//div[@id='vh-spark-main-menu']//button[4]")
	public WebElement ClothingShopAll;
	
	@FindBy(xpath="//div[@class='o_a o_l o_b'][contains(text(),'Handbags')]")
	public WebElement Handbag;
}
