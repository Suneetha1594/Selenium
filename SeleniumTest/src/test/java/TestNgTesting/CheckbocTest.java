package TestNgTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utlities.Screenshot;

public class CheckbocTest {
     WebDriver driver;
     WebElement checkbox;
     @BeforeClass
     public void setup() 
     {
    	 driver = new ChromeDriver();
    	 driver.manage().window().maximize(); 
     }
     @Test
     public void testcase1() 
     {
    	driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");
    	String title = driver.getTitle();
    	//System.out.println(title);
    	String Expectedtitle ="Selenium Easy - Checkbox demo for automation using selenium"	;
    	Assert.assertEquals(title,Expectedtitle);
     }
     
     @Test
     public void testcase2() {
    	 checkbox = driver.findElement(By.cssSelector("#isAgeSelected"));
    	 checkbox.click();
    	 System.out.println("After select: "+ checkbox.isSelected());
    	 Assert.assertTrue(checkbox.isSelected());
     }
     
     @Test
     public void testcase3() {
    	 checkbox.click();
    	 System.out.println("After Unselect: "+ checkbox.isSelected());
    	 //Assert.assertTrue(checkbox.isSelected());
    	 Assert.assertFalse(checkbox.isSelected());
     }

		/*
		 * @AfterMethod public void screenshottest() {
		 * Screenshot.CaptureScreenshot(driver, "checkboxtesting"); }
		 */
     @AfterClass
     public void teardown() 
     {
    	 driver.quit();
     }
}
