package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {
 
	@FindBy(xpath="//*[@id='mainContent']/div[1]/div/div[1]/div[1]/div[1]/h1/span[2]")
	public WebElement txtShoes;
	
   @FindBy(xpath="//*[@id='mainContent']/div[1]/div/div[1]/div[1]/div[1]/h1/span[2]")
    	public WebElement txtShirts;
	@FindBy(xpath="//*[@id='mainContent']/div[1]/div[2]/div[1]/div[1]/div[1]/h1/span[2]")
	public WebElement txtPants;
	//checkbox for brand adidas
	@FindBy(xpath="//input[@aria-label='adidas'] ")
	public WebElement cbxBrandAdidas;
	
	@FindBy(xpath="//input[@aria-label='Nike']")
	public WebElement cbxBrandNike;
	
	@FindBy(xpath="//input[@aria-label='Unbranded']")
	public WebElement cbxBrandUnbranded;
}
