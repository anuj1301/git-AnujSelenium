package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//import org.testng.asserts.SoftAssert;

public class VerifyTitlleAndText2 {
	@Test
	public void titletest() {
		SoftAssert softassert = new SoftAssert();
		WebDriver driver = new FirefoxDriver();
		String expectedTitle = "TestNG Documentation";
		String expectedText = "Search";
		driver.get("https://ebay.com/");
		String actualTitle= driver.getTitle();
		//Assert.assertEquals(actualTitle, expectedTitle,"title verification");
		softassert.assertEquals(actualTitle, expectedTitle,"title verification");
		@SuppressWarnings("deprecation")
		String actualText = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		//Assert.assertEquals(actualText, expectedText,"Text verification");
		softassert.assertEquals(actualText, expectedText,"Text verification");
		softassert.assertAll();
		

	}
	
}
