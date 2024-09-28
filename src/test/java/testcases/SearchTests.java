package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Homepage;
import pageobjects.Loginpage;
import pageobjects.Searchpage;
import testbase.Baseclass;

public class SearchTests extends Baseclass {

 	@Test(enabled=false)
	public void Verify_Searchfield_Accepts_Alphabets_Numbers_Symbols()
	{
		logger.info("**** Starting Verify_Searchfield_Accepts_Alphabets_Numbers_Symbols  *****");
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
		
		logger.info("Verify the search field accepts alphabets, numbers, and symbols..");
		
		// Create an instance for the searchpage
		Searchpage sp= new Searchpage(driver);

        // Test input with alphabets
		String alphabetsearchField = sp.searchTextBox("Product");
		if(alphabetsearchField.contains("Product"))
		{
			logger.info("Search field accepts alphabets");
			 Assert.assertTrue(true);
		}
		 else
		 {
			 logger.info("Search field does not accept alphabets");
			 Assert.fail();
		 }
		
		// Test input with numbers
		String numbersearchField = sp.searchTextBox("12345");
		if(numbersearchField.contains("12345"))
		{
			logger.info("Search field accepts numbers");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Search field does not accept numbers");
			Assert.fail();
		}
       
          // Test input with symbols
		String symbolsearchField = sp.searchTextBox("!@#$%^&*()");
		if(symbolsearchField.contains("!@#$%^&*()"))
		{
			logger.info("Search field accepts symbols");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Search field does not accept symbols");
			Assert.fail();
		}
       
       }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_Searchfield_Accepts_Alphabets_Numbers_Symbols  ****");
		  
	} 
	

 	@Test(enabled=false)
	public void Verify_Product_Search_Result()
	{
		logger.info("**** Starting Verify_Product_Search_Result  *****");
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
		
	   // Create an instance for the searchpage
		Searchpage sp= new Searchpage(driver);
		
        logger.info("Entering search text..");
        sp.searchTextBox("laptop");
        
        logger.info("Clicking on search icon..");
        sp.clickSearchicon();
        
        logger.info("Verifying search result..");
		if(driver.getTitle().contains("Amazon.co.uk : laptop"))
		{
			logger.info("Search is performed according to search text provided by user");
			 Assert.assertTrue(true);
		}
		else
		{
			logger.info("Search is not performed according to search text provided by user");
			Assert.fail();
		}
		
		
       }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_Product_Search_Result  ****");
		  
	} 
 	
	
 	@Test(enabled=false)
	public void Verify_Product_Search_Based_On_Specification()
	{
		logger.info("**** Starting Verify_Product_Search_Based_On_Specification  *****");
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
		
	   // Create an instance for the searchpage
		Searchpage sp= new Searchpage(driver);
		
        logger.info("Entering search text..");
        sp.searchTextBox("HP 250 G9 Laptop Intel Core i7-1255U 16GB RAM 512GB SSD 15.6\" Full HD Windows 11 Home");
        
        logger.info("Clicking on search icon..");
        sp.clickSearchicon();
        
        logger.info("Verifying product search result based on product name, brand name or specification..");
		boolean product = sp.isSearchedProductDisplayed();
        if(product==true)
		{
		 logger.info("User was able to perform search based on product name, brand name or product specification");
			 Assert.assertTrue(true);
		}
		else
		{
			logger.info("User was not able to perform search based on product name, brand name or product specification");
			Assert.fail();
		}
		
	}
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_Product_Search_Based_On_Specification  ****");
		  
	} 
	
	
 	@Test(enabled=false)
	public void Verify_Presence_Of_Filters_After_Search()
	{
		logger.info("**** Starting Verify_Filters_After_Search  *****");
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
		
	   // Create an instance for the searchpage
		Searchpage sp= new Searchpage(driver);
		
        logger.info("Entering search text..");
        sp.searchTextBox("phone");
        
        logger.info("Clicking on search icon..");
        sp.clickSearchicon();
        
        logger.info("Verifying the presence of the product filter after search..");
		boolean brands = sp.isBrandFilterDisplayed();
		boolean review = sp.isCustomerReviewFilterDisplayed();
		boolean rating = sp.isCustomerRatingFilterDisplayed();
		boolean price = sp.isPriceFilterDisplayed();
        
		if(brands && review && rating && price==true)
		{
		 logger.info("Product filters are present");
			 Assert.assertTrue(true);
		}
		else
		{
			logger.info("Product filters are not present");
			Assert.fail();
		}
		
	}
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_Filters_After_Search  ****");
		  
	} 
	

 	@Test(enabled=false)
	public void Verify_Presence_Of_Sorting_Options_After_Search()
	{
		logger.info("**** Starting Verify_Presence_Of_Sorting_Options_After_Search  *****");
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
		
	   // Create an instance for the searchpage
		Searchpage sp= new Searchpage(driver);
		
        logger.info("Entering search text..");
        sp.searchTextBox("phone");
        
        logger.info("Clicking on search icon..");
        sp.clickSearchicon();
        
        logger.info("Clicking on sorting options dropdown..");
        sp.clickSortingDropdown();
        
        logger.info("Verifying the presence of the sorting options after search..");
		boolean lowtohigh = sp.isLowToHighDisplayed();
		boolean hightolow= sp.isHighTolowDisplayed();
		boolean AvgcustomerReview = sp.isAvgCustomerReviewDisplayed();
		boolean bestsellers = sp.isBestSellersDisplayed();
		boolean newestarrivals = sp.isNewestArrivalsDisplayed();
		
		if(lowtohigh && hightolow && AvgcustomerReview && bestsellers && newestarrivals==true)
		{
		 logger.info("Sorting options are present");
			 Assert.assertTrue(true);
		}
		else
		{
			logger.info("Sorting options are not present");
			Assert.fail();
		}
		
	}
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_Presence_Of_Sorting_Options_After_Search  ****");
		  
	} 
	
	
 	@Test(enabled=false)
	public void Verify_Display_Of_Specific_Number_Of_Search_Results()
	{
		logger.info("**** Starting Verify_Display_Of_Specific_Number_Of_Search_Results *****");
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
		
	   // Create an instance for the searchpage
		Searchpage sp= new Searchpage(driver);
		
        logger.info("Entering search text..");
        sp.searchTextBox("shoe");
        
        logger.info("Clicking on search icon..");
        sp.clickSearchicon();
        
        logger.info("Checking the search result on the page..");
        boolean searchresults = sp.issearchResultDisplayed();
		
        if(searchresults==true)
		{
		 logger.info("Specific number of search results is displayed on one page");
			 Assert.assertTrue(true);
		}
		else
		{
			logger.info("Search results is not displayed on page");
			Assert.fail();
		}
		
	}
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_Display_Of_Specific_Number_Of_Search_Results  ****");
		  
	} 
	
	
 	@Test(enabled=false)
	public void Verify_Presence_Of_Navigation_Buttons()
		{
			logger.info("**** Starting Verify_Presence_Of_Navigation_Buttons *****");
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
			
		   // Create an instance for the searchpage
			Searchpage sp= new Searchpage(driver);
			
	        logger.info("Entering search text..");
	        sp.searchTextBox("watch");
	        
	        logger.info("Clicking on search icon..");
	        sp.clickSearchicon();
	        
	        logger.info("Checking the presence of navigation buttons on the search result page..");
	        boolean nextbutton = sp.isNextButtonDisplayed();
	        boolean previousbutton = sp.isPreviousButtonDisplayed();
			
	        if(nextbutton && previousbutton==true)
			{
			 logger.info("Navigation buttons are present on the search result page");
				 Assert.assertTrue(true);
				 
			}
			else
			{
				logger.info("Navigation buttons are not present on the search result page");
				Assert.fail();
			}
			
		}
			catch(Exception e)
			{
				logger.error("test failure..");
			}
			
			 logger.debug("Application debug logs ends...");
			 logger.info("**** Finished Verify_Presence_Of_Navigation_Buttons  ****");
			  
		} 
	
	

 	@Test(enabled=false)
	public void Verify_Search_In_Different_Categories()
		{
			logger.info("**** Starting Verify_Search_In_Different_Categories *****");
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
			
		   // Create an instance for the searchpage
			Searchpage sp= new Searchpage(driver);
			
	        logger.info("Selecting different category..");
	        sp.searchinCategories("Books");
	       
	        logger.info("Clicking on search icon..");
	        sp.clickSearchicon();
	        
	        logger.info("Checking if the selected category is displayed..");
	        boolean categoryheader = sp.isCategoryHeaderDisplayed();
	        
	        if(categoryheader==true)
			{
			 logger.info("Selected category is displayed on the result page");
				 Assert.assertTrue(true);
			}
			else
			{
				logger.info("Selected category is not displayed on the result page");
				Assert.fail();
			}
			
		}
			catch(Exception e)
			{
				logger.error("test failure..");
			}
			
			 logger.debug("Application debug logs ends...");
			 logger.info("**** Finished Verify_Search_In_Different_Categories  ****");
			  
		} 


}
