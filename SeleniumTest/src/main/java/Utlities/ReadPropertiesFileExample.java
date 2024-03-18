package Utlities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFileExample {
	
	public Properties readfile() throws IOException
	{
		File src = new File("./Configuration.properties");
		
		FileInputStream fis = new FileInputStream(src);
		Properties prop = new Properties();
		prop.load(fis);
		
		return prop;
	}

}
