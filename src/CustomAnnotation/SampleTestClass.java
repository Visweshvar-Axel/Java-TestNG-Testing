package CustomAnnotation;

import java.lang.reflect.Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestClass {
    
    @SmokeTest
    @Test
    public void sampleTest1() {
        System.out.println("Smoke TestNG annotation");
    }

    @RegressionTest
    @Test
    public void sampleTest2() {
        System.out.println("Regression TestNG annotation");
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

    @Test
    public void runSmokeTests() throws Exception {
        Class<SampleTestClass> obj = SampleTestClass.class;
        SampleTestClass testObj = new SampleTestClass();
        
        for (Method method : obj.getDeclaredMethods()) {
            if (method.isAnnotationPresent(SmokeTest.class)) {
                method.invoke(testObj);
            }
        }
    }

    @Test
    public void runRegressionTests() throws Exception {
        Class<SampleTestClass> obj = SampleTestClass.class;
        SampleTestClass testObj = new SampleTestClass();
        
        for (Method method : obj.getDeclaredMethods()) {
            if (method.isAnnotationPresent(RegressionTest.class)) {
                method.invoke(testObj);
            }
        }
    }
}
