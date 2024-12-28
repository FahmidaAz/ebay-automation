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
	//checkbox for brand 
	@FindBy(xpath="//input[@aria-label='adidas'] ")
	public WebElement cbxBrandAdidas;
	
	@FindBy(xpath="//input[@aria-label='Nike']")
	public WebElement cbxBrandNike;
	
	@FindBy(xpath="//input[@aria-label='Unbranded']")
	public WebElement cbxBrandUnbranded;
	
	//checkbox for colors
	@FindBy(xpath="//input[@aria-label='Black'] ")
	public WebElement cbxColorBlack;
	@FindBy(xpath="//input[@aria-label='White'] ")
	public WebElement cbxColorWhite;
	@FindBy(xpath="//input[@aria-label='Blue'] ")
	public WebElement cbxColorBlue;
}

