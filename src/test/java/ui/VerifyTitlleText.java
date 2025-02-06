package ui;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyTitlleText {
	WebDriver driver ;
	WebDriverWait wait ;
	@SuppressWarnings("deprecation")
	@BeforeTest(groups={"cricbuzz"})
	public void init()
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
	}
	
	@AfterTest(groups={"cricbuzz"})
	public void quit()
	{
		driver.quit();
	}
	@Test
	public void titletest() {
		
		String expectedTitle = "TestNG Documentation";
		driver.get("https://testng.org/");
		String actualTitle= driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

	}
	
	@Test(groups={"cricbuzz"})
	public void verifyCricbuzzPlus()
	{
		driver.get("https://cricbuzz.com/");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title ='Gulf Giants v Dubai Capitals - 10th Match']")));
		WebElement crplusbutton =driver.findElement(By.xpath("//a[@id ='cricbuzz-plus-main-menu']"));
		crplusbutton.click();
	}
	
	@Test(groups={"cricbuzz"})
	public void verifyMatch10()
	{
		driver.get("https://cricbuzz.com/");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title ='Gulf Giants v Dubai Capitals - 10th Match']")));
		
	
	
	}
}
