package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.EbayHomepageLocators;
import upskill.utilities.SetupDrivers;

public class EbayHomePageActions {
	EbayHomepageLocators EbayHomepageLocatorsObj;
       public EbayHomePageActions(){
    	   EbayHomepageLocatorsObj = new EbayHomepageLocators();
    	   PageFactory.initElements(SetupDrivers.driver,EbayHomepageLocatorsObj);
       }
       
       public void searchShoes(){
    	   EbayHomepageLocatorsObj.txtbxSearch.sendKeys("Shoes");
    	   EbayHomepageLocatorsObj.btnSearch.click();
       }
       public void searchShirts(){
    	   EbayHomepageLocatorsObj.txtbxSearch.sendKeys("Shirts");
    	   EbayHomepageLocatorsObj.btnSearch.click();
       }
       public void searchPants(){
    	   EbayHomepageLocatorsObj.txtbxSearch.sendKeys("Pants");
    	   EbayHomepageLocatorsObj.btnSearch.click();
       }
       public void searchItems(String item){
    	   EbayHomepageLocatorsObj.txtbxSearch.sendKeys(item);
    	   EbayHomepageLocatorsObj.btnSearch.click();
       }
       

       
}
      
