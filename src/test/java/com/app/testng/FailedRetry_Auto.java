package com.app.testng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class FailedRetry_Auto implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation annotation, 
			Class testClass, Constructor testConstructor, 
			Method testMethod) {
		annotation.setRetryAnalyzer(FaildeRetryLogic.class);
	
	}
}
