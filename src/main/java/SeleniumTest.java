import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTest {

	public static void main(String[] args) throws IOException
	{
		WebDriver driver = new FirefoxDriver();

        // Open Salesforce Signup Page
        driver.get("https://developer.salesforce.com/signup");
        driver.manage().window().maximize();

        // Locate Country Dropdown
        WebElement countryDropdown = driver.findElement(By.xpath("//select[@name='country']"));

        // Scroll to Dropdown
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", countryDropdown);

        // Explicit Wait Until Dropdown is Clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(countryDropdown));

        // Click the Dropdown (Optional, only needed if it doesn't auto-expand)
        countryDropdown.click();

        // Select 5th Option in Country Dropdown (Index starts at 0, so index 5 = 6th option)
        Select select = new Select(countryDropdown);
        select.selectByIndex(5);

        // Take Screenshot After Selection
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("./screenshots/spd.png")); // Save Screenshot

        // Close Browser (Optional)
        driver.quit();
		//WebElement searchbox =driver.findElement(By.xpath("//div[@class='a4bIc']//child::textarea"));
		//searchbox.click();
		//searchbox.sendKeys("cricbuzz khol de");
	//	searchbox.sendKeys(Keys.ENTER);
		
	}
}