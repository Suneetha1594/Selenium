package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");

		WebElement uploadfile = driver.findElement(By.id("file-upload"));

		uploadfile.sendKeys("C:\\Users\\Administrator\\Pictures\\Capture.Png");
		driver.findElement(By.id("file-submit")).click();
		String fileName = driver.findElement(By.id("uploaded-files")).getText();

		if(fileName.contains("Capture.Png"))
		{
			System.out.println("File got uploaded successfully " + fileName);
		}
		else
		{
			System.out.println("File not uploaded successfully " + fileName);
		}
		/*
		 * File uploadFile = new File("src/test/resources/selenium-snapshot.png");
		 * 
		 * WebElement fileInput =
		 * driver.findElement(By.cssSelector("input[type=file]"));
		 * fileInput.sendKeys(uploadFile.getAbsolutePath());
		 * driver.findElement(By.id("file-submit")).click();
		 * 
		 * WebElement fileName = driver.findElement(By.id("uploaded-files"));
		 * Assertions.assertEquals("selenium-snapshot.png", fileName.getText());
		 */
	}

}
