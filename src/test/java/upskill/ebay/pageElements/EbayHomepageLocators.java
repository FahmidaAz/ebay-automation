package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomepageLocators {
 
	@FindBy(xpath="//input[@placeholder='Search for anything']")
	public WebElement txtbxSearch;
	
	@FindBy(xpath="//*[@id='gh-btn']")
	public WebElement btnSearch;
}
