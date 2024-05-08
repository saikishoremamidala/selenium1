package DataDrivernTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritingInPropertiesFile {

	public static void main(String[] args) throws IOException {
		//Step 1:Convert physical file into java readable object
		FileInputStream fis=new FileInputStream("./src/test/resources/data.properties");
		//step 2:create an instance of properties class
		Properties property=new Properties();
		
		//step 3:load all the key-value pairs into properties object
		property.load(fis);
		
		//Step 4: Write to Properties Object
		property.put("user2", "trainee");
		property.put("pwd2", "trainee");
		
		//Step 5:Save the file
		FileOutputStream fos=new FileOutputStream("./src/test/resources/data.properties");
		property.store(fos, "Updated Successfully");
	}

}
