package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLogin {
	WebDriver driver;
	
	@FindBy(id = "email")
    private WebElement emailField;
	
	@FindBy(id ="pass")
    private WebElement password;
	
	@FindBy(id = "loginbutton")
    private WebElement loginButton;
	
	public FbLogin(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Initialize elements
	}
        
        public void enterEmail(String email)
        {
        	emailField.sendKeys(email);
        }
        
        public void enterPassword(String pass)
        {
        	password.sendKeys(pass);
        }
        
        public void clickLoginButton()
        {
        	loginButton.click();
        }
        
        
    }

	
	


