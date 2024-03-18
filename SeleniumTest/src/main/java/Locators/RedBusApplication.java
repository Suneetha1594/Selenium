package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusApplication {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.id("src"));
		source.sendKeys("Hyderabad");
		
		WebElement destination = driver.findElement(By.id("dest"));
		
		destination.sendKeys("Kanindada");
		
		WebElement date = driver.findElement(By.id("onwardCal"));
		date.click();
		
		driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div[2]/div/div/div[3]/div/span/div/span[text()='28']")).click();
		WebElement serachbutton = driver.findElement(By.xpath("//*[@id=\"search_button\"]"));
		serachbutton.click();
		

	}

}
