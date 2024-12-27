package upskill.ebay.pageAction;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.EbaySearchResultLocators;
import upskill.utilities.SetupDrivers;

public class EbaySearchResultActions {
	
	EbaySearchResultLocators EbaySearchResultLocatorsObj;

	public EbaySearchResultActions(){
		EbaySearchResultLocatorsObj = new EbaySearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsObj);
	}
	
	public void verifyTxtShoes(){
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed());
	}
	public void verifyTxtShirts(){
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShirts.isDisplayed());
	}
	public void verifyTxtPants(){
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtPants.isDisplayed());
	}
	public void filterBrand(String brand){
		if(brand.equals("adidas")){
			EbaySearchResultLocatorsObj.cbxBrandAdidas.click();
		}else if (brand.equals("Nike")){
			EbaySearchResultLocatorsObj.cbxBrandNike.click();
		}else if(brand.equals("Unbranded")){
			EbaySearchResultLocatorsObj.cbxBrandUnbranded.click();
		}else{
			System.out.println("Brand not found");
		}
	}
	public void verifyBrandItems(String brand){
		if(brand.equals("Nike")){
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed());
	}else if(brand.equals("adidas")){
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShirts.isDisplayed());
	}else if(brand.equals("Unbranded")){
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtPants.isDisplayed());
	}else{
		System.out.println("Brand not found");
	}
	}
//	public void verifyBrandAdidas(){
//		Assert.assertTrue(EbaySearchResultLocatorsObj.cbxBrandAdidas.isDisplayed());
//	}
//	public void verifyBrandNike(){
//		Assert.assertTrue(EbaySearchResultLocatorsObj.cbxBrandNike.isDisplayed());
//	}
//	public void verifyBrandUnbranded(){
//		Assert.assertTrue(EbaySearchResultLocatorsObj.cbxBrandUnbranded.isDisplayed());
//	}
}
