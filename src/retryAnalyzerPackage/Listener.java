package retryAnalyzerPackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class Listener implements IAnnotationTransformer{
	@Override
	public void transform(
		      ITestAnnotation annotation,
		      Class testClass,
		      Constructor testConstructor,
		      Method testMethod,
		      Class<?> occurringClazz) {
		Class<? extends IRetryAnalyzer> retryAnalyzer = annotation.getRetryAnalyzerClass();
		System.out.println(retryAnalyzer);
		
		if (retryAnalyzer == null) {
			annotation.setRetryAnalyzer(FailedTestRetry.class);
		}
		System.out.println("IAnnotationTransformer");
	}
}
