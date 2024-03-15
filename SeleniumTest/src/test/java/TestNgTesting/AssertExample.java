package TestNgTesting;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertExample {
	
	@Test(priority=0)
	public void softAssert() {
		SoftAssert softassertion = new SoftAssert();
		System.out.println("Soft Assertion method was started");
		softassertion.assertEquals("test", "test1");
		System.out.println("Soft Assertion method was Executed");
		softassertion.assertAll();
		
	}
	@Test(priority=1)
	public void hardAssert() {
		System.out.println("Hard Assertion method was started");
		Assert.assertEquals("test", "test1");
		System.out.println("Hard Assertion method was Executed");
	}

}
