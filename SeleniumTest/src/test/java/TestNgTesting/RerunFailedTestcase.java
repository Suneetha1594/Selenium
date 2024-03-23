package TestNgTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RerunFailedTestcase {
	
	@Test
	  public void test2() {
	    Assert.fail();
		//  Assert.assert
	  }
	  @Test
	  public void test1() {
		  Assert.fail();
	  }

}
