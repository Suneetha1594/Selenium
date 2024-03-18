package TestNgTesting;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Utlities.ReadPropertiesFileExample;

public class ReadFileTest {
	
	@Test
	public void testcase1() throws IOException {
		ReadPropertiesFileExample read = new ReadPropertiesFileExample();
		Properties prop = read.readfile();
		System.out.println(prop.getProperty("Name"));
		
		
	}

}
