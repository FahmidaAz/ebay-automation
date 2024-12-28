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
	
   public void filterColor(String color){
	   if(color.equals("Black")){
		   EbaySearchResultLocatorsObj.cbxColorBlack.click();
	   }else if(color.equals("White")){
		   EbaySearchResultLocatorsObj.cbxColorWhite.click();
	   }else if(color.equals("Blue")){
		   EbaySearchResultLocatorsObj.cbxColorBlue.click();
	   }else{
		   System.out.println("No colors are selected");
	   }
   }
   public void verifyColorItems(String color){
	   if(color.equals("Black")){
	     Assert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed());
	   }else if(color.equals("White")){
		   Assert.assertTrue(EbaySearchResultLocatorsObj.txtShirts.isDisplayed());
	   }else if(color.equals("Blue")){
		   Assert.assertTrue(EbaySearchResultLocatorsObj.txtPants.isDisplayed());
	   }else{
		   System.out.println("No colors are selected");
	   }
   }
}
