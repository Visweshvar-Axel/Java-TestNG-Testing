package TestNGAnnotations;

import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestClass {
	
	//ctrl +shift + o -- to resolve dependencies
	@Test
	public void sampleTest1() {
		System.out.println("this is TestNG annotation1");
	}
	@BeforeTest
	public void sampleTest2() {
		System.out.println("this is TestNG annotation2");
	}
	@AfterTest
	public void sampleTest3() {
		System.out.println("this is TestNG annotation3");
	}
	@Test
	public void sampleTest4() throws Exception {
		System.out.println("this is TestNG annotation4");
		throw new Exception("Failure");
	}
	@Test
	public void sampleTest5() throws Exception {
		System.out.println("this is TestNG annotation4");
		throw new SkipException("Failure");
	}
}
