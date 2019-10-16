package com;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@CopyRight
public class RefelectionAPITest {

	int a, b;

	public void m1() {

	}

	public void m2() {
		m3();
	}

	private void m3() {

	}

	public static void main(String[] args) {
		Annotation[] annotations = RefelectionAPITest.class.getAnnotations();
		for (Annotation annotation : annotations) {
			System.out.println(annotation);
		}

		Method[] methods = RefelectionAPITest.class.getMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
	}
}
