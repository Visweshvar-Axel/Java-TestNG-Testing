package TestNGAnnotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AnnotationSequence {
	
  @DataProvider(name = "productData")
  public Object[][] createProductData() {
      return new Object[][] {
          {"Watch", "Black", "AX-500", "2024"},
          {"Watch", "White", "AX-505", "2023"},
          {"Laptop", "Silver", "AX-506", "2022"},
          {"Phone", "Gold", "AX-507", "2021"}
      };
  }
  
  @Test(dataProvider = "productData")
  public void testProduct(String name, String color, String code, String make) {
      System.out.println("Product " + name + " is adding Items to Cart");
      System.out.println("Color: " + color);
      System.out.println("Product Code: " + code);
      System.out.println("Make: " + make);
  }
	  
  @Parameters({"Product Name", "Color", "Product Code", "Make"})
  @Test
  public void f1(String name, String color, String code, String make) {
  	System.out.println("Product "+name+" is adding Items to Cart");
  	System.out.println(color);
  	System.out.println(code);
  	System.out.println(make);
  }
  @Test
  public void f2() {
  	System.out.println("Deleting Items to Cart");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Launch Browser, Login to Flipkart");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Close Browse:");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Fetch Data from xml");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Clears Data from the cache");
  }
  @BeforeSuite
  public void BeforeSuite() {
	  System.out.println("Create Log Files, Create obj ect3 for Reporting");
  }
  @AfterSuite
  public void AfterSuite() {
	  System.out.println("Close log Files objects for Reporting");
  }
  @Parameters({"Product Name"})
  @Test
  public void testingParameters(String ItemName) {
	  System.out.println("The product name is: "+ItemName);
  }

  
//  @Test
//  public void f1() {
//	  System.out.println("In Test1");
//  }
//  @Test
//  public void f2() {
//	  System.out.println("In Test2");
//  }
//  @BeforeMethod
//  public void beforeMethod() {
//	  System.out.println("@BeforeMethod");
//  }
//  
//  @AfterMethod
//  public void afterMethod() {
//	  System.out.println("@AfterMethod");
//  }
//  
//  @BeforeTest
//  public void beforeTest() {
//	  System.out.println("@BeforeTest");
//  }
//  
//  @AfterTest
//  public void afterTest() {
//	  System.out.println("@AfterTest");
//  }
//  @BeforeSuite
//  public void BeforeSuite() {
//	  System.out.println("@BeforeSuite");
//  }
//  @AfterSuite
//  public void AfterSuite() {
//	  System.out.println("@AfterSuite");
//  }
//  @BeforeClass
//  public void BeforeClass() {
//	  System.out.println("@BeforeClass");
//  }
//  @AfterClass
//  public void AfterClass() {
//	  System.out.println("@AfterClass");
//  }
/**
@BeforeSuite
@BeforeTest
@BeforeClass
@BeforeMethod
In Test1
@AfterMethod
@BeforeMethod
In Test2
@AfterMethod
@AfterClass
@AfterTest
PASSED: f1
PASSED: f2

===============================================
    Default test
    Tests run: 2, Failures: 0, Skips: 0
===============================================

@AfterSuite

===============================================
Default suite
Total tests run: 2, Passes: 2, Failures: 0, Skips: 0
===============================================

 * */
}
