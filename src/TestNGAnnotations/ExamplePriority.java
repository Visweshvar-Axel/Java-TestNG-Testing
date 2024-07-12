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

public class ExamplePriority {
  @Test(priority = 4)
  public void f1() {
  	System.out.println("Adding Items to Cart");
  }
  @Test(priority = 5)
  public void f2() {
  	System.out.println("Deleting Items to Cart");
  }
  @Test(priority = 3)
  public void beforeMethod() {
	  System.out.println("Launch Browser, Login to Flipkart");
  }

  @Test(priority = 6)
  public void afterMethod() {
	  System.out.println("Close Browse:");
  }

  @Test(priority = 2)
  public void beforeTest() {
	  System.out.println("Fetch Data from xml");
  }

  @Test(priority = 8)
  public void afterTest() {
	  System.out.println("Clears Data from the cache");
  }
  @Test(priority = 1)
  public void BeforeSuite() {
	  System.out.println("Create Log Files, Create obj ect3 for Reporting");
  }
  @Test(priority = 7)
  public void AfterSuite() {
	  System.out.println("Close log Files objects for Reporting");
  }

}
