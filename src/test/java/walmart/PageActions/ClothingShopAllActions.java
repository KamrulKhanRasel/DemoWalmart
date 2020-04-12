package walmart.PageActions;

import java.util.concurrent.TimeUnit;

import walmart.PageElements.ClothingShopAllLocators;
import walmart.Utilities.SetupDriver;

public class ClothingShopAllActions {
	ClothingShopAllLocators clothingShopAll = new ClothingShopAllLocators();
	
	public void launchwalmarthomepage(){
	SetupDriver.driver.get("https://www.walmart.com/");
	SetupDriver.driver.manage().window().maximize();
	SetupDriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
	}
	
	public void sparkmenu(){
		clothingShopAll.Sparkmenu.click();
	}
	public void clothingshoesaccessories(){
		clothingShopAll.Clothingshopall.click();
	}
	public void shopallfashion(){
		clothingShopAll.Shopallfashion.click();
	}

}
