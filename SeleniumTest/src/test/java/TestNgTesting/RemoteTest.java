package TestNgTesting;

import java.net.MalformedURLException;
import java.net.URI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RemoteTest {
	
	@Test
	public void remotetest() throws MalformedURLException {
		ChromeOptions options = new ChromeOptions(); 
		  options.addArguments("--start-maximized"); 
		  options.setBrowserVersion("115"); 
		
		/*
		 * DesiredCapabilities caps = new DesiredCapabilities();
		 * caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		 * caps.setCapability(CapabilityType.BROWSER_VERSION, "121");
		 * caps.setCapability(ChromeOptions.CAPABILITY, options);
		 */
		//WebDriver driver = new ChromeDriver(options);
		//driver.get("https://www.google.com");
		
		WebDriver driver = null;
		driver = new RemoteWebDriver(URI.create("https://172.31.9.190.4444").toURL(),options);
		driver.get("https://www.google.com");
		/*
		 * try { driver = new
		 * RemoteWebDriver(URI.create("https://172.31.9.190.4444").toURL(),options);
		 * driver.get("https://www.google.com"); } catch (MalformedURLException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 */
		
	}

}
