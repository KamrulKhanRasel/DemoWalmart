package walmart.StepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import walmart.PageActions.ClothingShopAllActions;
import walmart.PageActions.SearchBarAction;
import walmart.PageElements.SearchBarLocators;

public class SearchBarStep {
	SearchBarAction SearchBarActionobj= new SearchBarAction();
	SearchBarLocators SearchBarLocatorsobj =new SearchBarLocators();
	ClothingShopAllActions ClothingShopAllActionsobj =new ClothingShopAllActions();
	
	
	@Given("^Being on homepage search for an item$")
	public void being_on_homepage_search_for_an_item() throws Throwable {
		ClothingShopAllActionsobj.launchwalmarthomepage();
	}

	@When("^I go to search bar and write CD$")
	public void i_go_to_search_bar_and_write_CD() throws Throwable {
		SearchBarActionobj.searchbar();
	}

	@Then("^I should see the results for CD$")
	public void i_should_see_the_results_for_CD() throws Throwable {
	    System.out.println("We have a result for Shoes");
	}

}
