package Locators;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Conirm {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		Wait<WebDriver> wait= new WebDriverWait(driver, Duration.ofSeconds(2));
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
		
		driver.findElement(By.linkText("See a sample confirm")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		
		String text= alert.getText();
		
		System.out.println(text);
		
		alert.dismiss();

	}

}
