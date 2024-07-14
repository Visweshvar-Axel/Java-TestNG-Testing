package retryAnalyzerPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class retryTest {
	@Test(retryAnalyzer = FailedTestRetry.class)
	public void Login1 () {
		Assert.fail();
	}
	@Test(retryAnalyzer = FailedTestRetry.class)
	public void Login2 () {
		Assert.fail();
	}
	@Test(retryAnalyzer = FailedTestRetry.class)
	public void Login3 () {
		Assert.fail();
	}
}
