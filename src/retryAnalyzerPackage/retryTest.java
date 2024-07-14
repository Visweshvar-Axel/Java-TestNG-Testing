package retryAnalyzerPackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import org.testng.internal.junit.ArrayAsserts;

import com.beust.jcommander.internal.Lists;

public class retryTest {
	@Test
	public void Login1() {
		Assert.fail();
	}
	
	 @Test(retryAnalyzer = FailedTestRetry.class) public void Login2 () {
	 Assert.fail(); }
	 
	 @Test(retryAnalyzer = FailedTestRetry.class) public void Login3 () {
	 Assert.fail(); }
	 @AfterSuite
	 public void cleanResults(ITestContext testContext) {
		 List<ITestResult> testToeemoved = new ArrayList<>();
		 
		 int failedTestID , skippedTestID, passedTestID = 0;
		 Set<Integer> passedTestIDs = new HashSet<>();
		 Set<Integer> skippedTestIDs = new HashSet<>();
		 Set<Integer> failedTestIDs = new HashSet<>();
		 
		 for (ITestNGMethod pssedtest : testContext.getPassedTests().getAllMethods()) {
//			passedTestIDs.add();
		}
	 }
}
