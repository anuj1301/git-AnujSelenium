package ui;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import common.FbLogin;
import utilities.DataProviderFileFb;

public class FbLoginTest {
     WebDriver driver;
	FbLogin fblogin;
	
	
	
	
	public WebDriver setBrowser(String browser)
	{
		if (browser.equalsIgnoreCase("chrome")) {
			driver =new ChromeDriver();
			return driver ;
		} 
		else if (browser.equalsIgnoreCase("firefox")) 
		{
			driver = new FirefoxDriver();
			return driver ;
		} 
		else 
		{
			throw new IllegalArgumentException("Unsupported browser: " + browser);
		}

	}
	
	public WebDriver getdriver()
	{
		return driver;
	}

	
	@Parameters("browser")  // Parameter from TestNG XML
    @BeforeMethod
    public void setup(@Optional("chrome") String browser) { // Default to Chrome if no parameter
        driver = setBrowser(browser);
        driver.manage().window().maximize();
        driver.get("https://facebook.com/login/");
        fblogin = new FbLogin(driver);
    }
	
	@Test(dataProvider = "TestFBLogin", dataProviderClass = DataProviderFileFb.class)
    public void testValidLogin(String email, String password) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		fblogin.enterEmail(email);
		fblogin.enterPassword(password);
		fblogin. clickLoginButton();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement element1 = driver.findElement(By.xpath("//span[contains(text(),\"Anuj Garg\")]"));
		wait.until(ExpectedConditions.elementToBeClickable(element1));
		Assert.assertTrue(element1.isDisplayed(), "Element is not visible!");
	}   
//        @AfterClass
//        public void tearDown() {
//            if (driver != null) {
//                driver.close();
//            }
//        }
}


	




