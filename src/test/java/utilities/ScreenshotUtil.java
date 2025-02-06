package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class ScreenshotUtil  {
	public static void takeScreenshot(WebDriver driver, String screenshotName) {
	
	TakesScreenshot ts = (TakesScreenshot) driver;
    File source = ts.getScreenshotAs(OutputType.FILE);
    
    // Define the destination path
    File destination = new File("screenshots/" + screenshotName + ".png");
   
    
    try {
        // Copy the screenshot to the destination
        FileUtils.copyFile(source, destination);
        System.out.println("Screenshot taken: " + screenshotName);
    } catch (IOException e) {
        System.out.println("Error while taking screenshot: " + e.getMessage());
    }

	}

}
