package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayHomePageActions;

public class EbayHomepageSteps {
  
	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();
	
	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
	    
	}

	@When("^Search for shoes$")
	public void search_for_shoes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		EbayHomePageActionsObj.searchShoes();
	    
	}
	@When("^Search for shirts$")
	public void search_for_shirts() throws Throwable {
	   EbayHomePageActionsObj.searchShirts();
	}
	@When("^Search for pants$")
	public void search_for_pants() throws Throwable {
	   EbayHomePageActionsObj.searchPants();
	}
	@Given("^Search for \"([^\"]*)\"$")
	public void search_for(String items) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  EbayHomePageActionsObj.searchItems(items);
	}
	

}
