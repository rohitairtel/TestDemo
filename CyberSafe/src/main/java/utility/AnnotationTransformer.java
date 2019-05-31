/**
 * 
 */
package utility;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
 
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author A1SKIVA4
 *
 */
public class AnnotationTransformer implements IAnnotationTransformer {
	 
    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        annotation.setRetryAnalyzer(Retry.class);
    }
}
