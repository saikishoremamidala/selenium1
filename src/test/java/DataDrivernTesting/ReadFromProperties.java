package DataDrivernTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperties {

	public static void main(String[] args) throws IOException {
		//step 1:Convert physical file into java readable objects
		//new FileInputStream() --> throws FileNotFoundException
		FileInputStream fis=new FileInputStream("./src/test/resources/data.properties");
		
		//step 2:Create an instance for Properties class
		Properties property=new Properties();
		
		//step 3:Load all key-value pairs from fis to Properties object
		//property.load(fis)==>throws IOException
		property.load(fis);
		
		//step 4:Fetch data
		System.out.println(property.getProperty("url"));
		System.out.println(property.getProperty("timeouts"));
		System.out.println(property.getProperty("username"));
		System.out.println(property.getProperty("password"));

	}

}
