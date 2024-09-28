package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Homepage;
import pageobjects.Loginpage;
import pageobjects.ProductDetailsPage;
import testbase.Baseclass;

public class ProductDetailsTest extends Baseclass {
	
 	@Test(enabled=false)
	public void Verify_Display_Of_Product_Images()
	{
		logger.info("**** Starting Verify_Display_Of_Product_Images *****");
		logger.debug("capturing application debug logs....");
		
		try 
		{
		// Create an instance of the Homepage
		Homepage hp=new Homepage(driver);
		
		logger.info("Click on Sign-in button");
		hp.clickSignInButton();
		
		logger.info("Entering valid email and click on continue button ..");
	 	 
		// Create an instance of the Loginpage
		Loginpage LP= new Loginpage(driver);
		
		// Enter the valid email
		LP.enterEmail(p.getProperty("username"));
		
		 // Click on the continue button
		LP.clickContinueButton();
		
        logger.info("Entering valid password and click on sign-in button ..");
      
        // Enter the password
        LP.enterPassword(p.getProperty("password"));
        
        // Click on sign-in button
        LP.clickSignInButton();
        
        // Create an instance of the ProductDetailsPage
        ProductDetailsPage PD= new ProductDetailsPage(driver);
     		  
        logger.info("Clicking on a product displayed on home page..");
        PD.ClickOnProduct();
        
		logger.info("Checking if the product images are displayed..");
		boolean productimages = PD.isProductImagesDisplayed();
       
		if(productimages==true)
		 {
			 logger.info("Images of the product are displayed");
			 Assert.assertTrue(true);;
		 }
		 else
		 {
			 logger.info("Images of the product are not displayed");
			 Assert.fail();
		 }
       }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_Display_Of_Product_Images  ****");

	} 
	
	
 	@Test(enabled=false)
	public void Verify_Display_Of_Product_Price()
	{
		logger.info("**** Starting Verify_Display_Of_Product_Price *****");
		logger.debug("capturing application debug logs....");
		
		try 
		{
		// Create an instance of the Homepage
		Homepage hp=new Homepage(driver);
		
		logger.info("Click on Sign-in button");
		hp.clickSignInButton();
		
		logger.info("Entering valid email and click on continue button ..");
	 	 
		// Create an instance of the Loginpage
		Loginpage LP= new Loginpage(driver);
		
		// Enter the valid email
		LP.enterEmail(p.getProperty("username"));
		
		 // Click on the continue button
		LP.clickContinueButton();
		
        logger.info("Entering valid password and click on sign-in button ..");
      
        // Enter the password
        LP.enterPassword(p.getProperty("password"));
        
        // Click on sign-in button
        LP.clickSignInButton();
        
        // Create an instance of the ProductDetailsPage
        ProductDetailsPage PD= new ProductDetailsPage(driver);
     		  
        logger.info("Clicking on a product displayed on home page..");
        PD.ClickOnProduct();
        
		logger.info("Checking if the product price is displayed..");
		boolean productprice = PD.isProductPriceDisplayed();
       
		if(productprice==true)
		 {
			 logger.info("Product price is displayed");
			 Assert.assertTrue(true);;
		 }
		 else
		 {
			 logger.info("Product price is not displayed");
			 Assert.fail();
		 }
       }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_Display_Of_Product_Price  ****");

	} 
	
 	@Test(enabled=false)
	public void Verify_Display_Of_Product_Reviews()
	{
		logger.info("**** Starting Verify_Display_Of_Product_Reviews *****");
		logger.debug("capturing application debug logs....");
		
		try 
		{
		// Create an instance of the Homepage
		Homepage hp=new Homepage(driver);
		
		logger.info("Click on Sign-in button");
		hp.clickSignInButton();
		
		logger.info("Entering valid email and click on continue button ..");
	 	 
		// Create an instance of the Loginpage
		Loginpage LP= new Loginpage(driver);
		
		// Enter the valid email
		LP.enterEmail(p.getProperty("username"));
		
		 // Click on the continue button
		LP.clickContinueButton();
		
        logger.info("Entering valid password and click on sign-in button ..");
      
        // Enter the password
        LP.enterPassword(p.getProperty("password"));
        
        // Click on sign-in button
        LP.clickSignInButton();
        
        // Create an instance of the ProductDetailsPage
        ProductDetailsPage PD= new ProductDetailsPage(driver);
     		  
        logger.info("Clicking on a product displayed on home page..");
        PD.ClickOnProduct();
        
		logger.info("Checking if the product reviews are displayed..");
		boolean productReviews = PD.isProductReviewsDisplayed();
       
		if(productReviews==true)
		 {
			 logger.info("Product reviews are displayed");
			 Assert.assertTrue(true);;
		 }
		 else
		 {
			 logger.info("Product reviews are not displayed");
			 Assert.fail();
		 }
       }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_Display_Of_Product_Reviews  ****");

	} 
	
 	@Test(enabled=false)
	public void Verify_Display_Of_Product_Specifications()
	{
		logger.info("**** Starting Verify_Display_Of_Product_Specifications *****");
		logger.debug("capturing application debug logs....");
		
		try 
		{
		// Create an instance of the Homepage
		Homepage hp=new Homepage(driver);
		
		logger.info("Click on Sign-in button");
		hp.clickSignInButton();
		
		logger.info("Entering valid email and click on continue button ..");
	 	 
		// Create an instance of the Loginpage
		Loginpage LP= new Loginpage(driver);
		
		// Enter the valid email
		LP.enterEmail(p.getProperty("username"));
		
		 // Click on the continue button
		LP.clickContinueButton();
		
        logger.info("Entering valid password and click on sign-in button ..");
      
        // Enter the password
        LP.enterPassword(p.getProperty("password"));
        
        // Click on sign-in button
        LP.clickSignInButton();
        
        // Create an instance of the ProductDetailsPage
        ProductDetailsPage PD= new ProductDetailsPage(driver);
     		  
        logger.info("Clicking on a product displayed on home page..");
        PD.ClickOnProduct();
        
		logger.info("Checking if the product specifications are displayed..");
		boolean productSpecs = PD.isProductSpecsDisplayed();
       
		if(productSpecs==true)
		 {
			 logger.info("Product specifications are displayed");
			 Assert.assertTrue(true);;
		 }
		 else
		 {
			 logger.info("Product specifications are not displayed");
			 Assert.fail();
		 }
       }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_Display_Of_Product_Specifications ****");

	} 
	
 	@Test(enabled=false)
	public void Verify_Display_Of_Stock_Information()
	{
		logger.info("**** Starting Verify_Display_Of_Stock_Information *****");
		logger.debug("capturing application debug logs....");
		
		try 
		{
		// Create an instance of the Homepage
		Homepage hp=new Homepage(driver);
		
		logger.info("Click on Sign-in button");
		hp.clickSignInButton();
		
		logger.info("Entering valid email and click on continue button ..");
	 	 
		// Create an instance of the Loginpage
		Loginpage LP= new Loginpage(driver);
		
		// Enter the valid email
		LP.enterEmail(p.getProperty("username"));
		
		 // Click on the continue button
		LP.clickContinueButton();
		
        logger.info("Entering valid password and click on sign-in button ..");
      
        // Enter the password
        LP.enterPassword(p.getProperty("password"));
        
        // Click on sign-in button
        LP.clickSignInButton();
        
        // Create an instance of the ProductDetailsPage
        ProductDetailsPage PD= new ProductDetailsPage(driver);
     		  
        logger.info("Clicking on a product displayed on home page..");
        PD.ClickOnProduct();
        
		logger.info("Checking if stock information are displayed..");
		boolean stockInfo = PD.isStcokInfoDisplayed();
       
		if(stockInfo==true)
		 {
			 logger.info("Stock information are displayed");
			 Assert.assertTrue(true);;
		 }
		 else
		 {
			 logger.info("Stock information are not displayed");
			 Assert.fail();
		 }
       }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_Display_Of_Stock_Information ****");

	} 
	
 	@Test(enabled=false)
	public void Verify_Display_Of_Seller_Ratings()
	{
		logger.info("**** Starting Verify_Display_Of_Seller_Ratings *****");
		logger.debug("capturing application debug logs....");
		
		try 
		{
		// Create an instance of the Homepage
		Homepage hp=new Homepage(driver);
		
		logger.info("Click on Sign-in button");
		hp.clickSignInButton();
		
		logger.info("Entering valid email and click on continue button ..");
	 	 
		// Create an instance of the Loginpage
		Loginpage LP= new Loginpage(driver);
		
		// Enter the valid email
		LP.enterEmail(p.getProperty("username"));
		
		 // Click on the continue button
		LP.clickContinueButton();
		
        logger.info("Entering valid password and click on sign-in button ..");
      
        // Enter the password
        LP.enterPassword(p.getProperty("password"));
        
        // Click on sign-in button
        LP.clickSignInButton();
        
        // Create an instance of the ProductDetailsPage
        ProductDetailsPage PD= new ProductDetailsPage(driver);
     		  
        logger.info("Clicking on a product displayed on home page..");
        PD.ClickOnProduct();
        
		logger.info("Checking if seller rating is displayed..");
		boolean sellerRatings = PD.isSellerRatingsDisplayed();
       
		if(sellerRatings==true)
		 {
			 logger.info("Seller ratings are displayed");
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 logger.info("Seller ratings are not displayed");
			 Assert.fail();
		 }
       }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_Display_Of_Seller_Ratings ****");

	} 
	

 	@Test(enabled=false)
	public void Verify_Display_Of_Product_Variation()
	{
		logger.info("**** Starting Verify_Display_Of_Product_Variation *****");
		logger.debug("capturing application debug logs....");
		
		try 
		{
		// Create an instance of the Homepage
		Homepage hp=new Homepage(driver);
		
		logger.info("Click on Sign-in button");
		hp.clickSignInButton();
		
		logger.info("Entering valid email and click on continue button ..");
	 	 
		// Create an instance of the Loginpage
		Loginpage LP= new Loginpage(driver);
		
		// Enter the valid email
		LP.enterEmail(p.getProperty("username"));
		
		 // Click on the continue button
		LP.clickContinueButton();
		
        logger.info("Entering valid password and click on sign-in button ..");
      
        // Enter the password
        LP.enterPassword(p.getProperty("password"));
        
        // Click on sign-in button
        LP.clickSignInButton();
        
        // Create an instance of the ProductDetailsPage
        ProductDetailsPage PD= new ProductDetailsPage(driver);
     		  
        logger.info("Clicking on a product displayed on home page..");
        PD.ClickOnProduct();
        
		logger.info("Checking if product variation is displayed..");
		boolean productVariation = PD.isProductVariationDisplayed();
       
		if(productVariation==true)
		 {
			 logger.info("Product variation is displayed");
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 logger.info("Product variation is not displayed");
			 Assert.fail();
		 }
       }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_Display_Of_Product_Variation ****");

	} 
	

 	@Test(enabled=false)
	public void Verify_Display_Of_Product_Shipping_Information()
	{
		logger.info("**** Starting Verify_Display_Of_Product_Shipping_Information *****");
		logger.debug("capturing application debug logs....");
		
		try 
		{
		// Create an instance of the Homepage
		Homepage hp=new Homepage(driver);
		
		logger.info("Click on Sign-in button");
		hp.clickSignInButton();
		
		logger.info("Entering valid email and click on continue button ..");
	 	 
		// Create an instance of the Loginpage
		Loginpage LP= new Loginpage(driver);
		
		// Enter the valid email
		LP.enterEmail(p.getProperty("username"));
		
		 // Click on the continue button
		LP.clickContinueButton();
		
        logger.info("Entering valid password and click on sign-in button ..");
      
        // Enter the password
        LP.enterPassword(p.getProperty("password"));
        
        // Click on sign-in button
        LP.clickSignInButton();
        
        // Create an instance of the ProductDetailsPage
        ProductDetailsPage PD= new ProductDetailsPage(driver);
     		  
        logger.info("Clicking on a product displayed on home page..");
        PD.ClickOnProduct();
        
		logger.info("Checking if product shipping information is displayed..");
		boolean productShippingInfo = PD.isShippingInfoDisplayed();
       
		if(productShippingInfo==true)
		 {
			 logger.info("Product shipping information is displayed");
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 logger.info("Product shipping information is not displayed");
			 Assert.fail();
		 }
       }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_Display_Of_Product_Shipping_Information ****");

	} 
	
	
 	@Test(enabled=false)
	public void Verify_Display_Of_AddToBasket_And_BuyNow_Buttons()
	{
		logger.info("**** Starting Verify_Display_Of_AddToBasket_And_BuyNow_Buttons *****");
		logger.debug("capturing application debug logs....");
		
		try 
		{
		// Create an instance of the Homepage
		Homepage hp=new Homepage(driver);
		
		logger.info("Click on Sign-in button");
		hp.clickSignInButton();
		
		logger.info("Entering valid email and click on continue button ..");
	 	 
		// Create an instance of the Loginpage
		Loginpage LP= new Loginpage(driver);
		
		// Enter the valid email
		LP.enterEmail(p.getProperty("username"));
		
		 // Click on the continue button
		LP.clickContinueButton();
		
        logger.info("Entering valid password and click on sign-in button ..");
      
        // Enter the password
        LP.enterPassword(p.getProperty("password"));
        
        // Click on sign-in button
        LP.clickSignInButton();
        
        // Create an instance of the ProductDetailsPage
        ProductDetailsPage PD= new ProductDetailsPage(driver);
     		  
        logger.info("Clicking on the product displayed on home page..");
        PD.ClickOnProduct();
        
		logger.info("Checking if 'add to basket' and 'buy now' buttons are displayed..");
		boolean addToBasket = PD.isAddToBasketBtnDisplayed();
		boolean buyNow = PD.isBuyNowBtnDisplayed();
		
       if(addToBasket==true)
		 {
			 logger.info("Add to basket button is displayed");
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 logger.info("Add to basket button is not displayed");
			 Assert.fail();
		 }
       
       if(buyNow==true)
		 {
			 logger.info("Buy now button is displayed");
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 logger.info("Buy now button is not displayed");
			 Assert.fail();
		 }
       }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_Display_Of_AddToBasket_And_BuyNow_Buttons ****");

	} 
	

    @Test(enabled=false)
	public void Verify_Display_Of_Related_Products()
	{
		logger.info("**** Starting Verify_Display_Of_Related_Products *****");
		logger.debug("capturing application debug logs....");
		
		try 
		{
		// Create an instance of the Homepage
		Homepage hp=new Homepage(driver);
		
		logger.info("Click on Sign-in button");
		hp.clickSignInButton();
		
		logger.info("Entering valid email and click on continue button ..");
	 	 
		// Create an instance of the Loginpage
		Loginpage LP= new Loginpage(driver);
		
		// Enter the valid email
		LP.enterEmail(p.getProperty("username"));
		
		 // Click on the continue button
		LP.clickContinueButton();
		
        logger.info("Entering valid password and click on sign-in button ..");
      
        // Enter the password
        LP.enterPassword(p.getProperty("password"));
        
        // Click on sign-in button
        LP.clickSignInButton();
        
        // Create an instance of the ProductDetailsPage
        ProductDetailsPage PD= new ProductDetailsPage(driver);
     		  
        logger.info("Clicking on the product displayed on home page..");
        PD.ClickOnProduct();
        
		logger.info("Checking if related products are displayed..");
		boolean relatedProducts = PD.isRelatedProductDisplayed();
       
		if(relatedProducts==true)
		 {
			 logger.info("Related products are displayed");
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 logger.info("Related products are not displayed");
			 Assert.fail();
		 }
       }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_Display_Of_Related_Products ****");

	} 
	


}
