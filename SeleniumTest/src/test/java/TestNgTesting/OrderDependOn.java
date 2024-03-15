package TestNgTesting;

import org.testng.annotations.Test;

public class OrderDependOn {
	@Test(dependsOnMethods = {"OpenBrowser"})
	
	public void SignIn() {
		System.out.println("this will execute second (SignIn)");
	}
	
	@Test
	
	public void OpenBrowser() {
		System.out.println("this will execute first (OpenBrowser)");
	}
	
	@Test(dependsOnMethods = {"SignIn"})
	
	public void logout() {
		System.out.println("this will execute third (logout)");
	}

}
