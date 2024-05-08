package DataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersPractice {

	@Test(dataProvider = "data")
	public void bookTickeTest(String source,String dest) {
		System.out.println("From :"+source+" TO "+dest);
	}
	@DataProvider
	public Object[][] data(){
		Object[][] obj=new Object[3][2];
		obj[0][0]="Hyd";
		obj[0][1]="Goa";
		
		obj[1][0]="Hyd";
		obj[1][1]="Tirupathi";
		
		obj[2][0]="Hyd";
		obj[2][1]="Kashi";
		
		return obj;
	}
}
