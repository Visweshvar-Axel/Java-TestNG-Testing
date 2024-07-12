package BeforeTest_BeforeClass;

import org.testng.annotations.Test;

public class Class1 extends BeforeTestAndBeforeClassTest {
//	  public static void main(String[] args) {
//		  TestNG testing = new TestNG();
//		  List<String> suites = Lists.newArrayList();
//		  suites.add("C:\\Users\\VISWA\\eclipse-workspace\\TestNGProject\\testng.xml");
//		  testing.setTestSuites(suites);
//		  testing.run();
//	  }
//	  @Test(timeOut = 2000)
	  @Test(enabled = false)
	  public void f1() {
		  System.out.println("In Test3");
		  for (int i = 0; i < 4; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	  }
	  @Test
	  public void f2() {
		  System.out.println("In Test4");
	  }
}
