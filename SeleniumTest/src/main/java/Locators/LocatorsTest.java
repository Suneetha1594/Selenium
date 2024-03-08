package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTest {

	public static void main(String[] args) {

      WebDriver driver = new ChromeDriver();
      driver.get("https://www.selenium.dev/selenium/web/web-form.html");
      
      driver.manage().window().maximize();
      String title =driver.getTitle();
      System.out.println("Titel of the webcome is :"+ title);
      
      driver.findElement(By.id("my-text-id")).click();
      driver.findElement(By.id("my-text-id")).sendKeys("Suneetha");
      
      driver.findElement(By.name("my-password")).click();
      driver.findElement(By.name("my-password")).sendKeys("Devisha3012@");
      //driver.findElement(By.name("my-password")).sendKeys(Keys.RETURN);
      
      //driver.findElement(By.className(".btn.btn-outline-primary.mt-3")).click();
      
     
      
      driver.findElement(By.name("my-textarea")).sendKeys("This is my first selenium testing project");
      
      driver.findElement(By.id("my-check-1")).click();
      
      driver.findElement(By.cssSelector(".form-check-input#my-check-2")).click();
      
      //driver.findElement(By.cssSelector(".btn.btn-outline-primary.mt-3")).click();
      driver.findElement(By.xpath("//input[@id=\"my-radio-2\"]")).click();
      
      //driver.findElement(By.linkText("Return to index")).click();
      
      //driver.switchTo().defaultContent();
      
      
      
      
      //driver.quit();
    		  

	}

}
