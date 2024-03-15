package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		Actions action =new Actions(driver);
		driver.get("https://www.stqatools.com/demo/doubleclick.php");
		
		WebElement clickbutton=driver.findElement(By.xpath("//button[contains(text(),'Click Me')]"));
		clickbutton.click();
		//action.doubleClick(clickbutton).click(clickbutton).contextClick().build().perform();
		action.doubleClick(clickbutton).pause(Duration.ofSeconds(2)).build().perform();
		action.doubleClick(clickbutton).click(clickbutton).build().perform();

	}

}
