package walmart.PageActions;

import walmart.PageElements.SearchBarLocators;

public class SearchBarAction {
	SearchBarLocators SearchBarLocatorsobj = new SearchBarLocators();
	
	public void searchbar(){
		
		SearchBarLocatorsobj.searchbar.click();
		SearchBarLocatorsobj.searchbar.sendKeys("CD");
	}

}
