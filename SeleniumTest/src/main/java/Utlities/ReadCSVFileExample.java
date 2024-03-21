package Utlities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSVFileExample {

	public Object[][] ReadCsv() throws IOException {
		
		String CsvFile ="ReadCsv.csv";
		BufferedReader br = null;
		String line ="";
		String CsvSplit =",";
		 List<Object[]> data = new ArrayList<Object[]>();
		
		try
		{
			br = new BufferedReader(new FileReader(CsvFile));
			//System.out.println(br.readLine());
			while((line = br.readLine())!= null)
			{
				String[] rowData = line.split(CsvSplit);
				data.add(rowData);
			}
			
		}
		finally 
		{
			if(br!=null) 
			{
				br.close();	
		}
		}
			
			return data	.toArray(new Object[0][]);
		}
		

	}


