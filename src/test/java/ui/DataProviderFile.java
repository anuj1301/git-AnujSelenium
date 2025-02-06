package ui;

import org.testng.annotations.DataProvider;

public class DataProviderFile {
	@DataProvider(name ="create")
	public Object[][] dataset()
	{
	Object[][] dataset = {{"standard_user","secret_sauce"},{"locked_out_user","secret_sauce"},{"problem_user","secret_sauce"}, {"performance_glitch_user","secret_sauce"}};
	
	return dataset;
	}

}
