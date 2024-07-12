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
	  @Test(groups = {"DeleteItems"})
	  public void f2() {
	  	System.out.println("Deleting Items to Cart");
	  }
	  @BeforeMethod(groups = {"AddItems","DeleteItems"})
	  public void beforeMethod() {
		  System.out.println("Launch Browser, Login to Flipkart");
	  }

	  @AfterMethod(groups = {"AddItems","DeleteItems"})
	  public void afterMethod() {
		  System.out.println("Close Browse:");
	  }

	  @BeforeTest(groups = {"AddItems","DeleteItems","DataPrep"})
	  public void beforeTest() {
		  System.out.println("Fetch Data from xml");
	  }

	  @AfterTest(groups = {"AddItems","DeleteItems"})
	  public void afterTest() {
		  System.out.println("Clears Data from the cache");
	  }
	  @BeforeSuite(groups = {"AddItems","DeleteItems","DataPrep"})
	  public void BeforeSuite() {
		  System.out.println("Create Log Files, Create obj ect3 for Reporting");
	  }
	  @AfterSuite(groups = {"AddItems","DeleteItems"})
	  public void AfterSuite() {
		  System.out.println("Close log Files objects for Reporting");
	  }
	  
	  @AfterTest(groups = {"Email"})
	  public void openGmail() {
		  System.out.println("Opening Gmail");
	  }
	  @AfterTest(groups = {"Email"}, dependsOnMethods = "openGmail")
	  public void composeEmail() {
		  System.out.println("Compose Email");
	  }
	  @AfterTest(groups = {"Email"}, dependsOnMethods = "composeEmail")
	  public void sendEmail() {
		  System.out.println("Send Email");
	  }
}
