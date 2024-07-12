package BeforeTest_BeforeClass;

import org.testng.annotations.Test;

public class Class1 extends BeforeTestAndBeforeClassTest {
	  @Test
	  public void f1() {
		  System.out.println("In Test3");
	  }
	  @Test
	  public void f2() {
		  System.out.println("In Test4");
	  }
}
