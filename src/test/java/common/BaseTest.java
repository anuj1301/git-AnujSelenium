package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BaseTest {
	
	public static WebDriver driver = null;
	
	@BeforeSuite
	public void launchdriver()
	{
		System.out.println("Launch");
		driver= new FirefoxDriver();
	}
	
	@AfterSuite
	public void closedriver()
	{
		System.out.println("Closed");
		driver.close();
	}

}
