package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Homepage;
import pageobjects.Loginpage;
import testbase.Baseclass;

public class HomePageTests extends Baseclass {

  	@Test(enabled=false)
	public void Verify_Display_Of_Homepage_AfterLogin()
	{
		logger.info("**** Starting Verify_Display_Of_Homepage_AfterLogin  *****");
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
        
        // Capture Page Title
		System.out.println(driver.getTitle());
		
		logger.info("Checking if homepage is displayed after login..");
        if(driver.getTitle().contains("Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more"))
		 {
			 logger.info("Homepage is displayed after login");
			 Assert.assertTrue(true);;
		 }
		 else
		 {
			 logger.info("homepage is not displayed after login");
			 Assert.fail();
		 }
       }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_Display_Of_Homepage_AfterLogin  ****");
		  
	} 
	

		@Test(enabled=false)
	public void Verify_Display_Of_Username_On_Homepage()
	{
		logger.info("**** Starting Verify_Display_Of_Username_On_Homepage  *****");
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
		
		logger.info("Checking if username is displayed on homepage..");
		
		boolean Username = LP.isUserNameDisplayed();
		if(Username==true)
		 {
			 logger.info("Username is displayed on the homepage");
			 Assert.assertTrue(true);;
		 }
		 else
		 {
			 logger.info("Username is not displayed on the homepage");
			 Assert.fail();
		 }
       }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_Display_Of_Username_On_Homepage  ****");
		  
	} 
	
	
	@Test(enabled=false)
	public void Verify_Display_Of_FeaturedProducts_On_Homepage()
	{
		logger.info("**** Starting Verify_Display_Of_FeaturedProducts_On_Homepage  *****");
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
		
		logger.info("Checking if featured products are displayed on homepage..");
		boolean featuredproducts = LP.isFeaturedProductsDisplayed();
		if(featuredproducts==true)
		 {
			 logger.info("Featured products are displayed on the homepage");
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 logger.info("Featured products are not displayed on the homepage");
			 Assert.fail();
		 }
		
       }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_Display_Of_FeaturedProducts_On_Homepage  ****");
		  
	} 
	
      @Test(enabled=false)
	public void Verify_Display_Of_SearchFunctionality_On_Homepage()
	{
		logger.info("**** Starting Verify_Display_Of_SearchFunctionality_On_Homepage  *****");
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
        
        
		
		logger.info("Checking if search functionality is displayed on homepage..");
		boolean search = LP.isSearchFunctionalityDisplayed();
		if(search==true)
		 {
			 logger.info("Search functionality is displayed on the homepage");
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 logger.info("Search functionality is not displayed on the homepage");
			 Assert.fail();
		 }
		
       }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_Display_Of_SearchFunctionality_On_Homepage  ****");
		  
	} 
	
	@Test(enabled=false)
	public void Verify_Display_Of_Same_Homepage_On_Different_Browsers() //edge, firefox
	{
		logger.info("**** Starting Verify_Display_Of_Same_Homepage_On_Different_Browsers  *****");
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
        
        // Capture Page Title
		System.out.println(driver.getTitle());
		
		logger.info("Checking if homepage is displayed after login..");
        if(driver.getTitle().contains("Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more"))
		 {
			 logger.info("Homepage is displayed on different browsers");
			 Assert.assertTrue(true);;
		 }
		 else
		 {
			 logger.info("homepage is not displayed on different browsers");
			 Assert.fail();
		 }
       }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_Display_Of_Same_Homepage_On_Different_Browsers  ****");
		  
	} 
	
	@Test(enabled=false)
	public void Verify_Product_On_Homepage_Is_Clickable()
	{
		logger.info("**** Starting Verify_Product_On_Homepage_Is_Clickable  *****");
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
        
        logger.info("Checking if products are displayed on homepage..");
		boolean featuredproducts = LP.isFeaturedProductsDisplayed();
		if(featuredproducts==true)
		 {
			 logger.info("Products are displayed on the homepage");
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 logger.info("Products are not displayed on the homepage");
			 Assert.fail();
		 }
        
		  logger.info("Clicking on the first product..");
		  LP.clickFirstProduct();
		  
		  logger.info("Checking if product is redirected to product specification page after clicking on the product..");
		  boolean productTitle = LP.isProductTitleDisplayed();
		  if(productTitle==true)
		  {
			  logger.info("Product is redirected to product specification page");
				 Assert.assertTrue(true);
		  }
		  else
			 {
				 logger.info("Products is not redirected to product specification page");
				 Assert.fail();
			 }
       }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_Product_On_Homepage_Is_Clickable  ****");
		  
	} 
	

	@Test(enabled=false)
	public void Verify_Display_Of_User_Profile_Section_On_Homepage()
	{
		logger.info("**** Starting Verify_Display_Of_User_Profile_Section_On_Homepage  *****");
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
		
		logger.info("Clicking on the username that is displayed on the homepage..");
		LP.clickUserName();
		
		logger.info("Checking if user profile is displayed..");
		boolean userProfile = LP.isUserProfileDisplayed();
		if(userProfile==true)
		 {
			 logger.info("User profile is displayed on the homepage");
			 Assert.assertTrue(true);;
		 }
		 else
		 {
			 logger.info("User profile is not displayed on the homepage");
			 Assert.fail();
		 }
       }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_Display_Of_User_Profile_Section_On_Homepage  ****");
		  
	} 
	

	@Test(enabled=false)
	public void Verify_Products_Categories_On_Homepage()
	{
		logger.info("**** Starting Verify_Products_Categories_On_Homepage  *****");
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
		
		logger.info("Checking if products on the homepage are categorised..");
		boolean productcategories = LP.isProductcategoriesDisplayed();
		if(productcategories==true)
		 {
			 logger.info("Products are categorised on the homepage");
			 Assert.assertTrue(true);;
		 }
		 else
		 {
			 logger.info("Products are not categorised on the homepage");
			 Assert.fail();
		 }
       }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_Products_Categories_On_Homepage  ****");
		  
	} 
	
	@Test(enabled=false)
	public void Verify_Presence_Of_Logo_On_Homepage()
	{
		logger.info("**** Starting Verify_Presence_Of_Logo_On_Homepage  *****");
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
		
		logger.info("Checking if logo is displayed on the homepage after login..");
		boolean logo = LP.isLogoDisplayed();
		if(logo==true)
		 {
			 logger.info("Logo is displayed on the homepage");
			 Assert.assertTrue(true);;
		 }
		 else
		 {
			 logger.info("Logo is not displayed on the homepage");
			 Assert.fail();
		 }
       }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_Presence_Of_Logo_On_Homepage  ****");
		  
	} 
   

	


}
