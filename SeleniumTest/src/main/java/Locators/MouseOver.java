package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class MouseOver {

	public static void main(String[] args) {
		/*
		 * WebDriver driver = new ChromeDriver(); Actions action =new Actions(driver);
		 * driver.get("https://www.selenium.dev/selenium/web/mouseOver.html");
		 * WebElement redbox = driver.findElement(By.id("redbox")); String color =
		 * redbox.getCssValue("background-color"); Color redboxcolor =
		 * Color.fromString(color); //System.out.println(redboxcolor.asRgb());
		 * System.out.println(redboxcolor.asHex());
		 * 
		 * action.moveToElement(redbox).build().perform();
		 * 
		 * redboxcolor = Color.fromString(color);
		 * System.out.println(redboxcolor.asHex());
		 */
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/mouseOver.html");
		
		Actions action=new Actions(driver);
		WebElement redbox=driver.findElement(By.id("redbox"));
		
		String color=redbox.getCssValue("background-color");
		Color redboxcolour = Color.fromString(color);
		System.out.println(redboxcolour.asHex());
		
		action.moveToElement(redbox).build().perform();
		
		 redboxcolour = Color.fromString(color);
		System.out.println(redboxcolour.asHex());
	}

}
