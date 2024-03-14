package Utlities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshot {
	
	//public static String CaptureScreenshot(WebDriver driver, String screenshotname) {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		String timestamp = new SimpleDateFormat("YYYYMMDD-HHMMSS").format(new Date());
		System.out.println(timestamp);
		//convert Webdriver object to take screenshot
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination ="./Screenshots/"+"testing"+"-"+timestamp+".png";
		try
		{
			FileUtils.copyFile(source, new File(destination));
			System.out.println("Screenshot Captured And saved to :" + destination);
		}catch(IOException e) {
			System.out.println("Failed to Capture Screenshot:"+ e.getMessage());
		}
		
		//return destination;
	}

}
