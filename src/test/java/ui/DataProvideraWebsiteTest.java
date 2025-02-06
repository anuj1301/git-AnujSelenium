package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProvideraWebsiteTest extends DataProviderFile {
	
	@Test(dataProvider ="create")
	public void test(String username, String password) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://saucedemo.com/");
		System.out.println(username+ " has password " +password);
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		driver.close();
	}
	
	
	
	

}
