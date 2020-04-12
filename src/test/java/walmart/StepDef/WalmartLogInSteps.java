package walmart.StepDef;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import walmart.PageActions.WalmartlogInActions;

public class WalmartLogInSteps {
	WalmartlogInActions WalmartlogInActionsObj = new WalmartlogInActions();
	
	@Given("^Browse to Walmart homepage$")
	public void browse_to_Walmart_homepage() throws Throwable {
		WalmartlogInActionsObj.launchwalmarthomepage();
	}
	
	@When("^User provide correct \"([^\"]*)\" with \"([^\"]*)\"$")
	public void user_provide_correct_with(String username, String password) throws Throwable {
		WalmartlogInActionsObj.Username(username);
		WalmartlogInActionsObj.Password(password);
	}


	@Then("^Verify login$")
	public void verify_login() throws Throwable {
		System.out.println("Ami Finally Bujechi Rasel Bhai");
	}

}
