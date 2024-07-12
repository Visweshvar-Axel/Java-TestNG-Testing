package BeforeTest_BeforeClass;

import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

import com.beust.jcommander.internal.Lists;

public class Class1 extends BeforeTestAndBeforeClassTest {
//	  public static void main(String[] args) {
//		  TestNG testing = new TestNG();
//		  List<String> suites = Lists.newArrayList();
//		  suites.add("C:\\Users\\VISWA\\eclipse-workspace\\TestNGProject\\testng.xml");
//		  testing.setTestSuites(suites);
//		  testing.run();
//	  }
	  @Test
	  public void f1() {
		  System.out.println("In Test3");
	  }
	  @Test
	  public void f2() {
		  System.out.println("In Test4");
	  }
}
