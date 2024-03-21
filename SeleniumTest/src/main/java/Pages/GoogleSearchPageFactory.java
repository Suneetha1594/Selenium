package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPageFactory {
	 WebDriver driver;
	 
	 
	 public GoogleSearchPageFactory(WebDriver driver1) {
		 
		 this.driver=driver1;
		 PageFactory.initElements(driver, this);	
		 //PageFactory.initElements-- looks for all elements in Page and create WebElements for that instance
		 
	 }
	 //@FindBy(name="q") WebElement searchbox;
	 @FindBy(how=How.NAME, using="q") WebElement searchbox;
	 
	 public void NavigateGoogleSearchPage() {
		 driver.get("https://www.google.com");
	 }
	 
	 public void typeSearchKeyword(String Keyword) {
		 searchbox.click();
		 searchbox.sendKeys(Keyword);
		 searchbox.sendKeys(Keys.ENTER);
	 }
}
