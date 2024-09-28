package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends Basepage {
	
WebDriver driver;
	
	public ProductDetailsPage(WebDriver driver) 
	{
		super (driver);
    }
	
	// capture WebElement using page factory approach

    // Locator for displayed product
    @FindBy(xpath ="//span[contains(text(),'Echo Show 8 | 3rd ge…')]") WebElement productDisplayed;
    
    // Locator for the images of the product
    @FindBy(xpath = "//li[@class='a-spacing-small item imageThumbnail a-declarative']")
    List<WebElement> productImages;
    
    // Locator for the display of product price
    @FindBy(xpath="//div[@id='apex_desktop_qualifiedBuybox']//span[@class='a-price-whole']")
    WebElement productPrice;
    
    // Locator for the display of product reviews
    @FindBy(xpath="//i[@class='a-icon a-icon-star a-star-4-5 cm-cr-review-stars-spacing-big']")
    WebElement productReviews;
    
    // Locator for the display of product specifications
    @FindBy(xpath="//div[@class='content-grid-row-wrapper ']//tr//td")
    List<WebElement> ProductSpecs;
    
    // Locator for stock information
    @FindBy(xpath="//div[@id='availabilityInsideBuyBox_feature_div']//span[@class='a-size-medium a-color-success'][normalize-space()='In stock']")
    WebElement stockInfo;
    
    // Locator for seller ratings
    @FindBy(xpath="//span[@id='acrCustomerReviewText']") WebElement sellerRatings;
    
    // Locator for product variation
    @FindBy(xpath="//ul[@class='a-unordered-list a-nostyle a-button-list a-declarative a-button-toggle-group a-horizontal a-spacing-top-micro swatches swatchesSquare imageSwatches']//li")
    List<WebElement> productVariation;
    
    // Locator for product shipping information
    @FindBy(xpath="//div[@class='a-section a-spacing-none']//span[@data-csa-c-type='element']")
    List<WebElement> productShippingInformation;
    
    // Locator for the display of related products
    @FindBy(xpath="//div[@class='a-cardui-body']//li") WebElement relatedProducts;
    
    // Locator for the display of 'Add to Basket' button
    @FindBy(xpath="//input[@id='add-to-cart-button']") WebElement AddToBasketbtn;
    
    // Locator for the display of 'Buy now' button
    @FindBy(xpath="//input[@id='buy-now-button']") WebElement buyNowBtn;
    
    // Locator to close pop-up
    @FindBy(xpath= "//i[@class='a-icon a-icon-close']") WebElement closePopup;
    
    // Locator for the item in the cart
    @FindBy(xpath = "//span[@id='nav-cart-count']")WebElement cartCount;
    
    // Locator for account dropdown
    @FindBy(id="nav-link-accountList") WebElement accountList;
     
     // Locator for signout button
     @FindBy(xpath="//span[normalize-space()='Sign Out']") WebElement signoutBtn;
     

    
    
    
    
    // capture the action methods
    
    //Click on the product
    public void ClickOnProduct()
    {
    	productDisplayed.click();
    }
    
    // Checking if the product images are displayed
    public boolean isProductImagesDisplayed()
    {
    	return !productImages.isEmpty();
    }
    
     // Check the display of product price
    public boolean isProductPriceDisplayed()
    {
    	return productPrice.isDisplayed();
    } 
    
    // Check the display of product reviews
    public boolean isProductReviewsDisplayed()
    {
    	return productReviews.isDisplayed();
    }
    
    // Checking if the product specs are displayed
    public boolean isProductSpecsDisplayed()
    {
    	return !ProductSpecs.isEmpty();
    }
    
    // Check the display of stock information
    public boolean isStcokInfoDisplayed()
    {
    	return stockInfo.isDisplayed();
    } 
    
    // Check the display of seller ratings
    public boolean isSellerRatingsDisplayed()
    {
    	return sellerRatings.isDisplayed();
    }
    
    // Check the display of product variation
    public boolean isProductVariationDisplayed()
    {
    	return !productVariation.isEmpty();
    }
    
    // Checking the display of product shipping information
    public boolean isShippingInfoDisplayed()
    {
    	return !productShippingInformation.isEmpty();
    }
    
    // Checking if related products are displayed
    public boolean isRelatedProductDisplayed()
    {
    	return relatedProducts.isDisplayed();
    }
    
    // Checking if 'Add to basket' button is displayed
    public boolean isAddToBasketBtnDisplayed()
    {
    	return AddToBasketbtn.isDisplayed();
    }
    
    // Checking if 'Buy now' button is displayed
    public boolean isBuyNowBtnDisplayed()
    {
    	return buyNowBtn.isDisplayed();
    }
    
    // Clicking on 'Add to Basket' button
    public void ClickOnAddToBasket()
    {
    	AddToBasketbtn.click();
    }
    
    // Close the popup
    public void ClosePopup()
    {
    	closePopup.click();
    }
    
    // Checking the quantity of item in cart
    public boolean isItemInCart() 
    {
        return Integer.parseInt(cartCount.getText()) > 0;
    }
    
    // Moving mouse cursor over account list and clicking on signout button
    public WebElement hoverOverAccountList() 
    {
    	return accountList;
    }
    
    // Click on signout button
   public void ClickSignOut()
    {
    	 signoutBtn.click();
    }
    
   
   
	
	

}






