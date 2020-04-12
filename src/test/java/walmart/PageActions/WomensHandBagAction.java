package walmart.PageActions;

import walmart.PageElements.WomensHandBagLocators;

public class WomensHandBagAction {
	WomensHandBagLocators womensHandBagLocators = new WomensHandBagLocators();
	
	public void sparkmenu(){
		womensHandBagLocators.Sparkmenu.click();
		
	}
	public void clothingshopall(){
		womensHandBagLocators.ClothingShopAll.click();
	}
	public void handbags(){
		womensHandBagLocators.Handbag.click();
	}
}
