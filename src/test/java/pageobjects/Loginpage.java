package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Basepage {
		
		WebDriver driver;
		
		public Loginpage(WebDriver driver) 
		{
			super (driver);
	    }
		
		// capture WebElement using page factory approach
		
		// Locator for the email/phone number input field
	    @FindBy(id = "ap_email") WebElement emailField;

	    // Locator for the continue button
	    @FindBy(id = "continue") WebElement continueButton;
	    
       // Locator for the password input field
	    @FindBy(id = "ap_password") WebElement passwordField;

	    // Locator for the sign-in button
	    @FindBy(id = "signInSubmit") WebElement signInButton;
	    
	    // Locator for the username on the homepage
	    @FindBy(xpath="//span[text()='Hello, Henry']") WebElement userName;
	    
	    // Locator for the featured products on the homepage
	    @FindBy(xpath="//div[@class='a-section a-spacing-none aok-relative']//div//img") List<WebElement> featuredProducts;
	    
	    // Locator for the first product
	    @FindBy(xpath="//div[@class='a-image-container a-dynamic-image-container _quad-multi-asin-card-v2_style_quadrantImageContainer__2QeUm']//img[@alt='Echo Show 8 | 3rd generation (2023 release), HD smart touchscreen with spatial audio, smart home hub and Alexa, Charcoal']")
	    WebElement firstProduct;
	    
	    // Locator for the first product title
	    @FindBy(xpath="//span[@id='productTitle']") WebElement firstProductTitle;
	   
	    // Locator for the search bar
	    @FindBy(xpath = "//div[@id='nav-search']") WebElement searchFunctionality;
	    
	    // Locator for user profile on the homepage
	    @FindBy(xpath="//h1[contains(text(),'Your Account')]") WebElement userProfile;
	    
	    // Locator for categorised products
	    @FindBy(xpath="//div[@class='a-section a-spacing-none aok-relative']//h2") 
	    List<WebElement> productCategories;
	    
	    // Locator for Logo on the homepage
	    @FindBy(xpath="//a[@id='nav-logo-sprites']") WebElement homepageLogo;
	    
	 // capture the action methods
	    
	    // Enter the email/phone number
	    public void enterEmail(String email) {
	        emailField.sendKeys(email);
	    }

	    // Click on the continue button
	    public void clickContinueButton() {
	        continueButton.click();
	    }
	    
	    // Enter the password
	    public void enterPassword(String password) {
	        passwordField.sendKeys(password);
	    }

	    // Click on the sign-in button
	    public void clickSignInButton() {
	        signInButton.click();
	    }

	    // Check if the username is displayed on the homepage
	    public boolean isUserNameDisplayed() {
	        return userName.isDisplayed();
	    }
	    
	    // Verify if the featured products section is displayed on the homepage
	    public boolean isFeaturedProductsDisplayed() {
	        return !featuredProducts.isEmpty();
	    }
	    
	    // Click on the first product
	    public void clickFirstProduct()
	    {
	    	firstProduct.click();
	    }
	    
	    // Verify first product title
	    public boolean isProductTitleDisplayed()
	    {
	    	return firstProductTitle.isDisplayed();
	    }
	    
	 // Check if the Search functionality is displayed on the homepage
	    public boolean isSearchFunctionalityDisplayed() {
	        return searchFunctionality.isDisplayed();
	    }
	    
	    // Click on the username displayed on the homepage
	    public void clickUserName() {
	        userName.click();	    
	    }
	    
	    // Verify if user profile section is displayed on the homepage
	    public boolean isUserProfileDisplayed() {
	        return userProfile.isDisplayed();
	    }
	    
	    // Verify that the products displayed on homepage are categorised
	    public boolean isProductcategoriesDisplayed() {
	    	for (WebElement category : productCategories) 
	    	{
	            System.out.println("Product Category: " + category.getText());
	        }
	        return !productCategories.isEmpty();
	    }
	    
	    // Verify the presence of logo on the homepage after login
	    public boolean isLogoDisplayed()
	    {
	    	return homepageLogo.isDisplayed();
	    }

	
}
