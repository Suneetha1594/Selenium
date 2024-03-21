package TestNgTesting;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utlities.ReadCSVFileExample;
import Utlities.ReadExcelSheetExample;

public class CsvFileTest {

	 @DataProvider(name = "csvData")
	    public Object[][] provideData() throws IOException {
		 ReadCSVFileExample read= new ReadCSVFileExample();
	    	Object[][] data = read.ReadCsv();
	    	//System.out.println(data[1][1]);
	    	
			return data;
	    }
	    
	    @Test (dataProvider="csvData")
	    public void testcase1(String Name, String Age) {
	    	
	    	System.out.println("UserName "+ Name);
	    	//System.out.println("Password "+ Password);
	    	System.out.println("Age "+ Age);
	    }
}

