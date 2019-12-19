package Package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases {

	
	@Test
	public void TC_01() {
		
		System.out.println("TC_01 Execution Started");
		Assert.assertEquals("Gmail", "Gmail");
	}
	
	@Test
	public void TC_02() {
		System.out.println("TC_02 Execution Started");
		Assert.assertEquals("facebook", "facebook");
	}
	
	@Test
	public void TC_03() {
		System.out.println("TC_03 Execution Started");
		Assert.assertEquals("yahoo", "yahoo");
	}
}
