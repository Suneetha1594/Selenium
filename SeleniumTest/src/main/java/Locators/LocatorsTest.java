package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

		WebElement disabled = driver.findElement(By.name("my-disabled"));
		Boolean isenabled = disabled.isEnabled();

		System.out.println("Disabled input field is Enabled or Disabled"+","+"if enabled true or else false : "+isenabled );
		
		//WebElement Readonly = driver.findElement(By.xpath("//input[@name=\"my-readonly\"]"));
		
		//String name = Readonly.getAttribute("value");
		
		//System.out.println("Value of the Readonly field is :"+ name);

		driver.findElement(By.name("my-textarea")).sendKeys("This is my first selenium testing project");

		WebElement Checkbox1= driver.findElement(By.id("my-check-1"));

		Boolean isSelected = Checkbox1.isSelected();

		System.out.println("Checkbox1 is slected by default(true/false): " + isSelected);

		driver.findElement(By.cssSelector(".form-check-input#my-check-2")).click();

		WebElement Radiobutton1 = driver.findElement(By.cssSelector(".form-check-input#my-radio-1"));

		Boolean isDisplayed = Radiobutton1.isDisplayed();

		System.out.println("Radiobutton1 is Displayed or not(true/false): "+ isDisplayed);

		driver.findElement(By.xpath("//input[@id=\"my-radio-2\"]")).click();

		//driver.findElement(By.linkText("Return to index")).click();


		//driver.findElement(By.cssSelector(".btn.btn-outline-primary.mt-3")).click();





		//driver.quit();


	}

}
