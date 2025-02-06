package ui;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupTests {

	@BeforeClass
	public void atest()
	{
		System.out.println("These are test cases from atest starting");
	}
	
	@AfterClass
	public void aatest()
	{
		System.out.println("These are test cases from atest ending");
	}
	
	@BeforeGroups(value="reg")
	public void areg()
	{
		System.out.println("Reg group from atest are getting executed");
	}
	
	@AfterGroups(value="reg")
	public void aareg()
	{
		System.out.println("Reg group from atest got executed");
	}
	
	@Test(groups={"reg" ,"integ"})
	public void atest1()
	{
		System.out.println("atest1");
	}
	
	@Test(groups={"integ"})
	public void atest2()
	{
		System.out.println("atest2");
	}
	
	@Test(groups={"reg" })
	public void atest3()
	{
		System.out.println("atest3");
	}
	
	@Test(groups={"reg" ,"integ"})
	public void atest4()
	{
		System.out.println("atest4");
	}

	
	
}

class NewGroup{
	@BeforeClass
	public void btest()
	{
		System.out.println("These are test cases from btest starting");
	}
	
	@AfterClass
	public void aatest()
	{
		System.out.println("These are test cases from btest ending");
	}
	@BeforeGroups(value="reg")
	public void breg()
	{
		System.out.println("Reg group from btest are getting executed");
	}
	
	@AfterGroups(value="reg")
	public void bbreg()
	{
		System.out.println("Reg group from btest got executed");
	}
	@Test(groups={"integ"})
	public void btest1()
	{
		System.out.println("btest1");
	}
	
	@Test(groups={"integ"})
	public void btest2()
	{
		System.out.println("btest2");
	}
	
	@Test(groups={"reg" })
	public void btest3()
	{
		System.out.println("btest3");
	}
	
	@Test(groups={"reg" ,"integ"})
	public void btest4()
	{
		System.out.println("btest4");
	}
	
}
