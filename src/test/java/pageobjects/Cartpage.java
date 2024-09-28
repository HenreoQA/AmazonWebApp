package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Cartpage extends Basepage {

WebDriver driver;
	
	public Cartpage(WebDriver driver) 
	{
		super (driver);
    }
	
	// capture WebElement using page factory approach

    // Locator for 'Added to basket' confirmation message
    @FindBy(xpath ="//h1[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']") 
    WebElement AddToBasketConfirm;
    
    // Locator to continue shopping for another product
    @FindBy(xpath="//img[@alt='Echo Show 10 (3rd generation) | HD smart display with motion and Alexa, Glacier White Fabric']")
    WebElement continueShopping;
    
    // Locator for product title
    @FindBy(xpath="//span[@id='productTitle']") WebElement productTitle;
    
    // Navigating to the cart
    @FindBy(xpath="//span[@id='nav-cart-count']") WebElement cartBtn;
    
    // Locataor for dropdown for quantity
    @FindBy(xpath="//select[@name='quantity']") WebElement QtydropDown;
    
    // Locator for the added quantity
    @FindBy(xpath="//span[@id='nav-cart-count']") WebElement increasedQty;
    
    // Locator for total amount of the item in the cart
    @FindBy(xpath="//span[@id='sc-subtotal-amount-activecart']//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'][text()='£149.99']")
    WebElement totalAmt;
    
    // Locator for proceed to checkout button
    @FindBy(xpath="//input[@name='proceedToRetailCheckout']") WebElement proceedToCheckout;
    
    // Locator for use this address button
    @FindBy(xpath="//input[@aria-labelledby='orderSummaryPrimaryActionBtn-announce']")
    WebElement addressBtn;
    
    // Locator for see details
    @FindBy(xpath="//a[normalize-space()='See details.']") WebElement seeDetails;
    
    // Locator for VAT
    @FindBy(xpath="//td[normalize-space()='£25.83']") WebElement VAT;
    
    // Locator for shipping charges
    @FindBy(xpath="//td[normalize-space()='£4.16']") WebElement shippingCharges;
    
    // Locator for beyond limit confirmation message
    @FindBy(xpath="//div[@id='sc-important-message-alert']//div[@class='a-box-inner a-alert-container']") 
    WebElement beyondLimit;
    
    // Locator to delete item from the cart
    @FindBy(xpath="//input[@value='Delete']") WebElement deleteItem;
    
    // Locator for empty cart
    @FindBy(xpath="//h2[normalize-space()='Your Amazon Cart is empty.']") WebElement emptyCart;
    

    
    // capture the action methods
    
    // Add to basket confirmation message
    public boolean AddToBasketConfirmMsg()
    {
    	return AddToBasketConfirm.isDisplayed();
    }
    
    // Clicking on another product to continue shopping
    public void ClickAnotherProduct()
    {
    	continueShopping.click();
    }
    
    // Check display of product title 
    public boolean isProductTitleDisplayed()
    {
    	return productTitle.isDisplayed();
    }
    
    // Clicking on cart button
    public void ClickOnCartBtn()
    {
    	cartBtn.click();
    }
    
    // Selecting more quantity from the dropdown
    public void SelectingQty(String quantity)
    {
    	Select QtySelect = new Select(QtydropDown);
    	QtySelect.selectByVisibleText(quantity);
    }
    
    // Checking the added quantity
    public String getQty()
    {
    	return increasedQty.getText();
    }
    
    // Checking total amount of the item in the cart
    public boolean isTotalAmtDisplayed()
    {
    	return totalAmt.isDisplayed();
    }
    
    // Clicking on proceed to checkout
    public void ClickProceedToCheckout()
    {
    	proceedToCheckout.click();
    }
    
    // Clicking on use this address button
    public void ClickUseThisAddress()
    {
    	addressBtn.click();
    }
    
    // Clicking on see details
    public void ClickSeeDetails()
    {
    	seeDetails.click();
    }
    
    // Checking if VAT is included in total amount
    public boolean isVATDisplayed()
    {
    	return VAT.isDisplayed();
    }
    
    // Checking if shipping charges are included in the total amount
    public boolean isShippingChargeDisplayed()
    {
    	return shippingCharges.isDisplayed();
    }
    
    // Checking the display of beyond limit confirmation message
    public boolean isBeyondLimitMsg()
    {
    	return beyondLimit.isDisplayed();
    }
    
    // Clicking on delete button to remove item from cart
    public void ClickOnDelete()
    {
    	deleteItem.click();
    }
    
    // Checking empty cart confirmation message
    public boolean EmptyCartConfirmMsg()
    {
    	return emptyCart.isDisplayed();
    }
    
  
    
    
    
    
    
    
}
