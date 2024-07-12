package TestNGAnnotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Groups {
	  @Test(groups = {"AddItems"})
	  public void f1() {
	  	System.out.println("Adding Items to Cart");
	  }
	  @Test
	  public void f2() {
	  	System.out.println("Deleting Items to Cart");
	  }
	  @BeforeMethod(groups = {"AddItems"})
	  public void beforeMethod() {
		  System.out.println("Launch Browser, Login to Flipkart");
	  }

	  @AfterMethod(groups = {"AddItems"})
	  public void afterMethod() {
		  System.out.println("Close Browse:");
	  }

	  @BeforeTest(groups = {"AddItems"})
	  public void beforeTest() {
		  System.out.println("Fetch Data from xml");
	  }

	  @AfterTest(groups = {"AddItems"})
	  public void afterTest() {
		  System.out.println("Clears Data from the cache");
	  }
	  @BeforeSuite(groups = {"AddItems"})
	  public void BeforeSuite() {
		  System.out.println("Create Log Files, Create obj ect3 for Reporting");
	  }
	  @AfterSuite(groups = {"AddItems"})
	  public void AfterSuite() {
		  System.out.println("Close log Files objects for Reporting");
	  }
}
