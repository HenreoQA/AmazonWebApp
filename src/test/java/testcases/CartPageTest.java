package testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Cartpage;
import pageobjects.Homepage;
import pageobjects.Loginpage;
import pageobjects.ProductDetailsPage;
import testbase.Baseclass;

public class CartPageTest extends Baseclass {
   
  	@Test(enabled=false)
	public void Verify_Adding_Product_To_Cart()
	{
		logger.info("**** Starting Verify_Adding_Product_To_Cart *****");
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
       
        logger.info("Clicking on add to basket..");
        PD.ClickOnAddToBasket();
        
        Thread.sleep(3000);
        
        logger.info("Close the pop up..");
        PD.ClosePopup();
        
        
        // Create an instance of the Cartpage
        Cartpage CP= new Cartpage(driver);
        
		logger.info("Checking if the product is added to cart/basket..");
		boolean confirmMsg = CP.AddToBasketConfirmMsg();
       
		if(confirmMsg==true)
		 {
			 logger.info("Product is added to basket");
			 Assert.assertTrue(true);;
		 }
		 else
		 {
			 logger.info("Product is not added to basket");
			 Assert.fail();
		 }
       }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_Adding_Product_To_Cart  ****");

	} 
	
 
  	@Test (enabled=false)
	public void Verify_User_Continues_Shopping_After_Adding_Product_To_Cart()
	{
		logger.info("**** Starting Verify_User_Continues_Shopping_After_Adding_Product_To_Cart *****");
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
       
        logger.info("Clicking on add to basket..");
        PD.ClickOnAddToBasket();
        
        Thread.sleep(3000);
        
        logger.info("Close the pop up..");
        PD.ClosePopup();
        
        
        // Create an instance of the Cartpage
        Cartpage CP= new Cartpage(driver);
        
		logger.info("Clicking on another product to check if user can continue shopping..");
		CP.ClickAnotherProduct();
		boolean continueShopping = CP.isProductTitleDisplayed();
       
		if(continueShopping==true)
		 {
			 logger.info("User can continue shopping after adding product to cart");
			 Assert.assertTrue(true);;
		 }
		 else
		 {
			 logger.info("User cannot continue shopping after adding product to cart");
			 Assert.fail();
		 }
       }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_User_Continues_Shopping_After_Adding_Product_To_Cart  ****");

	} 
  	
	
    @Test (enabled=false)
	public void Verify_User_Can_Increase_Product_Quantity()
	{
		logger.info("**** Starting Verify_User_Can_Increase_Product_Quantity *****");
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
       
        logger.info("Clicking on add to basket..");
        PD.ClickOnAddToBasket();
        
        Thread.sleep(3000);
        
        logger.info("Close the pop up..");
        PD.ClosePopup();
        
        
        // Create an instance of the Cartpage
        Cartpage CP= new Cartpage(driver);
        
		logger.info("Clicking on cart button..");
		CP.ClickOnCartBtn();
		
		logger.info("Selecting more quantity..");
		CP.SelectingQty("3");
		
		Thread.sleep(3000);
		
		logger.info("Checking if the quantity of the product is increased..");
		String increasedQty = CP.getQty();
		
       if(increasedQty.equals("3"))
		 {
			 logger.info("Quantity of the product is increased");
			 Assert.assertTrue(true);;
		 }
		 else
		 {
			 logger.info("Quantity of the product is not increased");
			 Assert.fail();
		 }
       }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_User_Can_Increase_Product_Quantity  ****");

	} 
    
	
 	@Test (enabled=false)
	public void Verify_Total_Amount_Of_Item_In_The_Cart()
	{
		logger.info("**** Starting Verify_Total_Amount_Of_Item_In_The_Cart *****");
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
       
        logger.info("Clicking on add to basket..");
        PD.ClickOnAddToBasket();
        
        Thread.sleep(3000);
        
        logger.info("Close the pop up..");
        PD.ClosePopup();
        
        
        // Create an instance of the Cartpage
        Cartpage CP= new Cartpage(driver);
        
		logger.info("Clicking on cart button..");
		CP.ClickOnCartBtn();
		
		logger.info("Checking the total amount of the item in the cart..");
		boolean totalAmt = CP.isTotalAmtDisplayed();
		
       if(totalAmt==true)
		 {
			 logger.info("Total amount of the item in the cart is displayed");
			 Assert.assertTrue(true);;
		 }
		 else
		 {
			 logger.info("Total amount of the item in the cart is not displayed");
			 Assert.fail();
		 }
       }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_Total_Amount_Of_Item_In_The_Cart  ****");

	} 
 	
 	
 
 	@Test (enabled=false)
	public void Verify_Inclusion_Of_VAT_And_Shippingcharges_In_Total_Amount()
	{
		logger.info("**** Starting Verify_Inclusion_Of_VAT_And_Shippingcharges_In_Total_Amount *****");
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
       
        logger.info("Clicking on add to basket..");
        PD.ClickOnAddToBasket();
        
        Thread.sleep(3000);
        
        logger.info("Close the pop up..");
        PD.ClosePopup();
        
        
        // Create an instance of the Cartpage
        Cartpage CP= new Cartpage(driver);
        
		logger.info("Clicking on cart button and proceed to checkout button..");
		CP.ClickOnCartBtn();
		CP.ClickProceedToCheckout();
		
		logger.info("Clicking on use this address button and see details..");
		CP.ClickUseThisAddress();
		CP.ClickSeeDetails();
		
		logger.info("Checking if VAT and shipping charges are included in the total amount..");
		boolean VAT = CP.isVATDisplayed();
		boolean shippingCharge = CP.isShippingChargeDisplayed();
		
       if(VAT && shippingCharge==true)
		 {
			 logger.info("VAT and shipping charges are included in the total amount");
			 Assert.assertTrue(true);;
		 }
		 else
		 {
			 logger.info("VAT and shipping charges are not included in the total amount");
			 Assert.fail();
		 }
       }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_Inclusion_Of_VAT_And_Shippingcharges_In_Total_Amount  ****");

	} 
 	
 	
	@Test (enabled=false)
	public void Verify_User_Cannot_Add_Item_Beyond_Certain_Limit()
	{
		logger.info("**** Starting Verify_User_Cannot_Add_Item_Beyond_Certain_Limit *****");
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
       
        logger.info("Clicking on add to basket..");
        PD.ClickOnAddToBasket();
        
        Thread.sleep(3000);
        
        logger.info("Close the pop up..");
        PD.ClosePopup();
        
        
        // Create an instance of the Cartpage
        Cartpage CP= new Cartpage(driver);
        
		logger.info("Clicking on the cart button..");
		CP.ClickOnCartBtn();
		
		logger.info("Selecting 5 items from the dropdown..");
		CP.SelectingQty("5");
		
		logger.info("Checking if beyond limit confirmation message is displayed..");
		boolean confirmMsg = CP.isBeyondLimitMsg();
       
		if(confirmMsg==true)
		 {
			 logger.info("Product is not added to basket");
			 Assert.assertTrue(true);;
		 }
		 else
		 {
			 logger.info("Product is added to basket");
			 Assert.fail();
		 }
       }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_User_Cannot_Add_Item_Beyond_Certain_Limit  ****");

	} 
	
	
	@Test(enabled=false)
	public void Verify_User_Can_Remove_Item_From_Cart()
	{
		logger.info("**** Starting Verify_User_Can_Remove_Item_From_Cart *****");
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
       
        logger.info("Clicking on add to basket..");
        PD.ClickOnAddToBasket();
        
       Thread.sleep(3000);
        
        logger.info("Close the pop up..");
        PD.ClosePopup();
        
        
        // Create an instance of the Cartpage
        Cartpage CP= new Cartpage(driver);
        
		logger.info("Clicking on the cart button..");
		CP.ClickOnCartBtn();
		
		logger.info("Removing item from the cart..");
		CP.ClickOnDelete();
		
		logger.info("Checking if empty cart confirmation message is displayed..");
		boolean emptyCart = CP.EmptyCartConfirmMsg();
       
		if(emptyCart==true)
		 {
			 logger.info("Item is removed from cart");
			 Assert.assertTrue(true);;
		 }
		 else
		 {
			 logger.info("Item is not removed from cart");
			 Assert.fail();
		 }
       }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_User_Can_Remove_Item_From_Cart  ****");

	} 
	
	
	
	@Test(enabled=false)
	public void Verify_Presence_Of_Item_in_Cart_When_User_Logout_And_Login_Again()
	{
		logger.info("**** Starting Verify_Presence_Of_Item_in_Cart_When_User_Logout_And_Login_Again *****");
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
       
        logger.info("Clicking on add to basket..");
        PD.ClickOnAddToBasket();
        
       Thread.sleep(3000);
        
        logger.info("Close the pop up..");
        PD.ClosePopup();
        
        Thread.sleep(3000);
        
        
		logger.info("Moving the mouse cursor over the account list and click on signout..");
		WebElement list = PD.hoverOverAccountList();
		Actions actions = new Actions(driver);
	    actions.moveToElement(list).build().perform();
		
		PD.ClickSignOut();
		
		logger.info("Log in again..");
		LP.enterEmail(p.getProperty("username"));
	    LP.clickContinueButton();
		LP.enterPassword(p.getProperty("password"));
		LP.clickSignInButton();
		      
		
		logger.info("Checking if the item is still present in cart..");
		boolean iteminCart = PD.isItemInCart();
		
		if(iteminCart==true)
		 {
			 logger.info("Item is present in cart");
			 Assert.assertTrue(true);;
		 }
		 else
		 {
			 logger.info("Item is not present in cart");
			 Assert.fail();
		 }
       }
		catch(Exception e)
		{
			logger.error("test failure..");
		}
		
		 logger.debug("Application debug logs ends...");
		 logger.info("**** Finished Verify_Presence_Of_Item_in_Cart_When_User_Logout_And_Login_Again  ****");

	} 

 	

}
