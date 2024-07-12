package BeforeTest_BeforeClass;

import org.testng.annotations.Test;

public class Class2 extends BeforeTestAndBeforeClassTest {
	  @Test
	  public void f1() {
		  System.out.println("In Test5");
	  }
	  @Test
	  public void f2() {
		  System.out.println("In Test6");
	  }
}
