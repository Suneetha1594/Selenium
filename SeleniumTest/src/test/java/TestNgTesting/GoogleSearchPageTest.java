package TestNgTesting;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.GoogleSearchPage;
import Pages.GoogleSearchPageFactory;
import Utlities.ReadExcelSheetExample;

public class GoogleSearchPageTest {

	WebDriver driver;
	
	@DataProvider(name="Exceldata")
	public Object[][] CreateData1() throws IOException {
		ReadExcelSheetExample read = new ReadExcelSheetExample();
		Object[][] data = read.readexceldata("./Data1.xlsx","Sheet2");
		return data;		
	}
	@BeforeTest
	public void SetUp() {
		driver = new ChromeDriver();
		
	}
	@Test(dataProvider ="Exceldata")
	public void Testcase1(String Keyword) {
		
		//GoogleSearchPage Browser = new GoogleSearchPage(driver);
		GoogleSearchPageFactory Browser = new GoogleSearchPageFactory(driver);
		Browser.NavigateGoogleSearchPage();
		Browser.typeSearchKeyword(Keyword);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
