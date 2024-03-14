package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("Iphone");
		Thread.sleep(7000);
		
		List<WebElement> item = driver.findElements(By.xpath("//div[contains(@class,'_2VHNef')]"));
		
		System.out.println(item.size());
		
		for(WebElement items: item)
		{
			//if(items.getText().contains("Iphone 13"))
			//{
				System.out.println(items.getText());
				//items.click();
			//}
		}
		

	}

}
