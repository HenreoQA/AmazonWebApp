package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Searchpage extends Basepage{
	
     WebDriver driver;
	
	public Searchpage(WebDriver driver) 
	{
		super (driver);
    }
	
	// capture WebElement using page factory approach

    // Locator for the search textbox
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']") WebElement searchTextbox;
    
    // Locator for search icon
    @FindBy(xpath= "//input[@id='nav-search-submit-button']") WebElement searchicon;
    
    // Locator for searched product
    @FindBy(xpath= "//span[text()='250 G9 Laptop, Intel Core i7-1255U, 16GB RAM, 512GB SSD, 15.6\" Full HD, Windows 11 Home']")
    WebElement searchedResult;
    
    // Locator for brands filter
    @FindBy(xpath = "//span[text()='Brands']") WebElement brandsFilter;
    
    // Locator for customer review filter
    @FindBy(xpath = "//span[text()='Customer Review']") WebElement customerReview;
    
    // Locator for customer rating filter
    @FindBy(xpath = "//i[@class='a-icon a-icon-star-medium a-star-medium-4']") WebElement customerRating;
    
    // Locator for price filter
    @FindBy(xpath = "//span[text()='Price']") WebElement priceFilter;
    
    // Locator for sorting options dropdown
    @FindBy(xpath="//span[@class='a-dropdown-prompt']") WebElement sortingOptionsDropdown;
    
    //Locator for low to high price sorting option
    @FindBy(xpath= "//a[@id='s-result-sort-select_1']") WebElement lowTohighPrice;
    
    //Locator for high to low price sorting option
    @FindBy(xpath= "//a[@id='s-result-sort-select_2']") WebElement highTolowPrice;
    
    // Locator for Avg. customer review sorting option
    @FindBy(xpath= "//a[@id='s-result-sort-select_3']") WebElement AvgCustomerreview;
    
    // Locator for newest arrivals sorting option
    @FindBy(xpath = "//a[@id='s-result-sort-select_4']") WebElement newestArrivals;
    
    // Locator for best sellers sorting option
    @FindBy(xpath = "//a[@id='s-result-sort-select_5']") WebElement bestSellers;
    
    // Locator for the search results
    @FindBy(xpath= "//div[@class='a-section aok-relative s-image-tall-aspect']") List<WebElement> searchResult;
    
    // Locator for next navigation button
    @FindBy(xpath= "//a[text()='Next']") WebElement nextNavigationButton;
    
    // Locator for previous navigation button
    @FindBy(xpath= "//span[@class='s-pagination-item s-pagination-previous s-pagination-disabled ']")
    WebElement previousNavigationButton;
    
    // Locator for searchdropdown in different categories
    @FindBy(xpath = "//select[@id='searchDropdownBox']") WebElement searchDropdown;
    
    // Locator for search category header
    @FindBy(xpath = "//h1[text()='Books']") WebElement categoryHeader;

    // capture the action methods
    
    // Enter data in the search textbox
    public String searchTextBox(String searchtext) {
    	searchTextbox.clear();
    	searchTextbox.sendKeys(searchtext);
		return searchtext;
    }
    
    // Click on serach icon
    public void clickSearchicon()
    {
    	searchicon.click();
    }
    
    // Verify if the searched product is displayed
    public boolean isSearchedProductDisplayed()
    {
    	return searchedResult.isDisplayed();
    }
	
    // Verify if brands filter is displayed
    public boolean isBrandFilterDisplayed()
    {
    	return brandsFilter.isDisplayed();
    }
    
    // Verify if customer review filter is displayed
    public boolean isCustomerReviewFilterDisplayed()
    {
    	return customerReview.isDisplayed();
    }
    
    // Verify if customer rating filter is displayed
    public boolean isCustomerRatingFilterDisplayed()
    {
    	return customerRating.isDisplayed();
    }
	
    // Verify if price filter is displayed
    public boolean isPriceFilterDisplayed()
    {
    	return priceFilter.isDisplayed();
    }
	
    // Click on sorting options dropdown
    public void clickSortingDropdown()
    {
    	sortingOptionsDropdown.click();
    }
    
    // Verify if low to high price sorting option is displayed
    public boolean isLowToHighDisplayed()
    {
    	return lowTohighPrice.isDisplayed();
    }
    
    // Verify if high to low price sorting option is displayed
    public boolean isHighTolowDisplayed()
    {
    	return highTolowPrice.isDisplayed();
    }

   // Verify if Avg customer review sorting option is displayed
    public boolean isAvgCustomerReviewDisplayed()
    {
    	return AvgCustomerreview.isDisplayed();
    }

   // Verify if newest arrivals sorting option is displayed
    public boolean isNewestArrivalsDisplayed()
    {
    	return newestArrivals.isDisplayed();
    }
    
    // Verify if best sellers sorting option is displayed
    public boolean isBestSellersDisplayed()
    {
    	return bestSellers.isDisplayed();
    }
    
 // Verify that the search result is displayed on one page
    public boolean issearchResultDisplayed() {
        return !searchResult.isEmpty();
    }  
    
    // Verify the presence of next navigation button
    public boolean isNextButtonDisplayed()
    {
    	return nextNavigationButton.isDisplayed();
    }
    
    // Verify the presence of previous navigation button
    public boolean isPreviousButtonDisplayed()
    {
    	return previousNavigationButton.isDisplayed();
    }
    
    // Search in different categories
    public void searchinCategories(String categoryname)
    {
    	 Select categorySearch = new Select(searchDropdown);
    	 categorySearch.selectByVisibleText(categoryname);
    	 
    }
    
    // Verify if the category header is displayed
    public boolean isCategoryHeaderDisplayed()
    {
    	return categoryHeader.isDisplayed();
    }
    
}
