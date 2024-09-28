package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage {
	
	WebDriver driver;
	
	public Homepage(WebDriver driver) 
	{
		super (driver);
    }
	
	// capture WebElement using page factory approach

    // Locator for the sign-in button
    @FindBy(id = "nav-link-accountList-nav-line-1") WebElement signInButton;
	
	// capture the action methods

    // Clicks on the sign-in button
    public void clickSignInButton() {
        signInButton.click();
    }
    
}
