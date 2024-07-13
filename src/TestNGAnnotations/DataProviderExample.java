package TestNGAnnotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	@Test(dataProvider = "fetchData")
	public void displayData(String UserName, String Password) {
		System.out.println(UserName);		
		System.out.println(Password);		
	}
	@DataProvider(name = "fetchData")
	public Object[][] test1() {
		return new Object[][] {{"User1","Pwd1"},{"User2","Pwd2"}};		
	}
}
