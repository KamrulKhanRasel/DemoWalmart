package walmart.StepDef;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import walmart.PageActions.WomensHandBagAction;


public class WomensHandBagStep {

	WomensHandBagAction WomensHandBagActionObj = new WomensHandBagAction();
	
	@Given("^User navigate to spark menu$")
	public void user_navigate_to_spark_menu() throws Throwable {
		WomensHandBagActionObj.sparkmenu();
	}

	@When("^User select clothing, shoes and accessories$")
	public void user_select_clothing_shoes_and_accessories() throws Throwable {
		WomensHandBagActionObj.clothingshopall();
	}

	@When("^Selects handbags under women$")
	public void selects_handbags_under_women() throws Throwable {
		WomensHandBagActionObj.handbags();
	}

	@Then("^User lands on womens handbag webpage$")
	public void user_lands_on_womens_handbag_webpage() throws Throwable {
	    System.out.println("Done");
	}
	
}
