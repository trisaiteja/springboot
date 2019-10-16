package com;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@CopyRight
public class CopyRightsLogic {

	public static void main(String[] args) {
		// Get all the annotations are linked to Test class
		System.out.println("****************Annotations used in Test class******************");
		Annotation[] annotations = CopyRightsLogic.class.getAnnotations();
		for (Annotation annotation : annotations) {
			System.out.println(annotation);
		}

		// Get all the methods defined in Test class
		System.out.println("\n****************Methods used in Test class******************");
		Method[] methods = CopyRightsLogic.class.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
	}
}
