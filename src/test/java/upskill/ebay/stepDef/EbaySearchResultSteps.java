package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbaySearchResultActions;

public class EbaySearchResultSteps {
	
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();

	@Then("^Item list should have only shoes related products$")
	public void item_list_should_have_only_shoes_related_products() throws Throwable {
		EbaySearchResultActionsObj.verifyTxtShoes();
	}
	@When("^Filter by \"([^\"]*)\"$")
	public void filter_by(String brand) throws Throwable {
	    EbaySearchResultActionsObj.filterBrand(brand);
	}
	@Then("^Item list should have products of \"([^\"]*)\"$")
	public void item_list_should_have_products_of(String brand) throws Throwable {
	   EbaySearchResultActionsObj.verifyBrandItems(brand);
	}
	
	//specify colors
	
	@When("^Specific color of \"([^\"]*)\"$")
	public void specific_color_of(String color) throws Throwable {
	    EbaySearchResultActionsObj.filterColor(color);
	}

	@Then("^Item list should have \"([^\"]*)\"$")
	public void item_list_should_have(String item) throws Throwable {
		 EbaySearchResultActionsObj.verifyColorItems(item);
	}

}
