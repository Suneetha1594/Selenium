package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
 WebDriver driver;
 
 By Searchbox = By.name("q");
 public GoogleSearchPage(WebDriver driver1) {
	 //System.out.println(driver);
	 this.driver=driver1;
	 //System.out.println(driver1);	 
 }
 public void NavigateGoogleSearchPage() {
	 driver.get("https://www.google.com");
 }
 
 public void typeSearchKeyword(String Keyword) {
	 driver.findElement(Searchbox).click();
	 driver.findElement(Searchbox).sendKeys(Keyword);
		driver.findElement(Searchbox).sendKeys(Keys.ENTER);
 }
}
