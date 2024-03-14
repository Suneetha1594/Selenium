package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		// switch to frame
		
	//driver.switchTo().frame("mce_0_ifr");
		//driver.switchTo().frame(0);
		WebElement iframe = driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(iframe);
		WebElement inputTxt = driver.findElement(By.id("tinymce"));
		inputTxt.clear();
		inputTxt.sendKeys("Selenium");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.partialLinkText("Selenium")).click();
		
		
		
		

	}

}
