package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocators {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\Administrator\\git\\SamplePage.html");

		WebElement FName = driver.findElement(By.xpath("//input[@id=\"fname\"]"));

		String FirstName= FName.getAttribute("Value");

		System.out.println("FirstName is :" + FirstName);

		WebElement LName = driver.findElement(By.xpath("//input[@id=\"lname\"]"));

		LName.clear();

		LName.sendKeys("Devisha");
		
		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





	}

}
