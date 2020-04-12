package walmart.StepDef;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import walmart.PageActions.ClothingShopAllActions;

public class ClothingShopAllStep {
	ClothingShopAllActions ClothingShopAllActionsObj = new ClothingShopAllActions();

	@Given("^User selects spark menu$")
	public void user_selects_spark_menu() {
		ClothingShopAllActionsObj.sparkmenu();
	}

	@When("^User selects clothing, shoes and accessories$")
	public void user_selects_clothing_shoes_and_accessories() throws Throwable {
		ClothingShopAllActionsObj.clothingshoesaccessories();

	}

	@When("^User selects Shop All option$")
	public void user_selects_Shop_All_option() throws Throwable {
		ClothingShopAllActionsObj.shopallfashion();

	}

	@Then("^User lands on  Shop All Page$")
	public void user_lands_on_Shop_All_Page() throws Throwable {
	    System.out.println("I Landed");

	}

}
