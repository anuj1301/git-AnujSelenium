package ui;

import org.testng.annotations.Test;

public class ExampleTest {

	@Test(priority =1,description ="Login text")
	public void loginTest()
	{
		System.out.println("Test login is sucessful");
	}

	@Test(priority =2,description ="Logout text")
	public void logoutTest()
	{
		System.out.println("Test logout is sucessful");
	}

	
}

