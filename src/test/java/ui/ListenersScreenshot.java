package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.BaseTest;

public class ListenersScreenshot extends BaseTest{
	@Test
	public void launchapp()
	{
		driver.get("https://ebay.com");
		Assert.assertTrue(false);
	}

}
