package TestNgTesting;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utlities.ReadExcelSheetExample;

public class ExcelFileTest {
	
	
	@DataProvider(name="test1")
	public Object[][] CreateData1() throws IOException {
		ReadExcelSheetExample read = new ReadExcelSheetExample();
		Object[][] data = read.readexceldata();
		return data;		
	}
   @Test(dataProvider ="test1")
   public void verifydata(String n1, String n2, String n3)
   {
	   System.out.println(n1+" "+n2+" "+n3);
   }
}
