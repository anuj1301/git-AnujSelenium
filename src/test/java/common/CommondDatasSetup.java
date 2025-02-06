package common;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommondDatasSetup {
	
	@BeforeSuite
	public void datasetup() {
		System.out.println("Before executing the test suite:");
		}
	
	@AfterSuite
	public void datateardown() {
		System.out.println("Test suite executed:");
	}

}
