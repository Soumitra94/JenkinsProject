package Practice;

import org.testng.annotations.Test;

public class TestScript_04 
{
	@Test(groups="smoke")
	public void TS()
	{
		System.out.println("Test Script for smoke is running");
	}

	@Test(groups="regression")
	public void TS1()
	{
		System.out.println("Test Script regression is running");
	}
	
}
