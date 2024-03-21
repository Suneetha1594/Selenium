package Utlities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class ReadXMLFileExample {
	public static void main(String args[]) throws FileNotFoundException, DocumentException {
		//File src = new File("./objRepo1.xml");
		File src = new File("./objRepo.xml");
		FileInputStream fis = new FileInputStream(src);
		
		SAXReader saxReader = new SAXReader();
		Document doc = saxReader.read(fis);
		
		//String sourceID = doc.selectSingleNode("//Bus_Search/source").getText();
		//System.out.println(sourceID);
		
		//System.out.println(doc.selectNodes("//Bus_Search/source").size());
		System.out.println(doc.selectNodes("//login_detail/username").size());
		System.out.println(doc.selectNodes("//login_detail/username").get(0).getText());
		System.out.println(doc.selectNodes("//login_detail/username").get(1).getText());
		System.out.println(doc.selectSingleNode("//login_detail/password").getText());
	}

}
