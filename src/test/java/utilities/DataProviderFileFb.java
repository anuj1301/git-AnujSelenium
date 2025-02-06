package utilities;

import org.testng.annotations.DataProvider;

public class DataProviderFileFb {
	@DataProvider(name ="TestFBLogin" ,parallel=true)
	public Object[][] getLoginData()
	{
	return new Object[][] {
				{"agarwalanuj132001@gmail.com","Virat@254"},
				{"agarwalanuj132001@gmail.com","Golu@254"}
		};	
	
	
	}

}
