package upskill.ebay.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

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
       public void searchItems(String item) throws InterruptedException {
    	   EbayHomepageLocatorsObj.txtbxSearch.sendKeys(item);
    	   EbayHomepageLocatorsObj.btnSearch.click();
    	   Thread.sleep(2000);
       }
       
       public void synchronization(){
   		/*	Selenium Wait : 
   				1. Implicit wait(Global), 
   				2. Explicit wait(Conditional), 
   				3. Fluent wait(intermittent) */
   			
   		//Implicit Wait
   		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   		
   		//Explicit Wait
   		WebDriverWait explicitWait = new WebDriverWait(SetupDrivers.driver, 10);
   		explicitWait.until(ExpectedConditions.elementToBeClickable(EbayHomepageLocatorsObj.btnSearch));
   		
   		//Fluent Wait
   		FluentWait fluentWait = new FluentWait(SetupDrivers.driver);								
   		fluentWait.withTimeout(10, TimeUnit.SECONDS);
   		fluentWait.pollingEvery(2, TimeUnit.SECONDS);
   	}
       
}
      
