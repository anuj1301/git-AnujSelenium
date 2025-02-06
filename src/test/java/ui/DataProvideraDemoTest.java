package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProvideraDemoTest {
	
	@Test(dataProvider ="create")
	public void test(String username, String password) 
	{
		System.out.println(username+ " has password " +password);
	}
	
	@Test(dataProvider ="create",priority =1)
	public void tes1t(String username, String password) 
	{
		System.out.println(username+ " has password " +password);
	}
	
	@DataProvider(name ="create")
	public Object[][] dataset()
	{
	Object[][] dataset = new Object[4][2];
	
	dataset[0][0] ="user1";
	dataset[0][1] ="pass1";
	dataset[1][0] ="user2";
	dataset[1][1] ="pass2";
	dataset[2][0] ="user3";
	dataset[2][1] ="pass3";
	dataset[3][0] ="user4";
	dataset[3][1] ="pass4";
	
	return dataset;
	}

}
