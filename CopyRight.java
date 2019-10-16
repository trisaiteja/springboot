package com;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CopyRight {
	int authorId() default 51774026;

	String authorName() default "Trisaiteja Narina";

	String value() default "Copyright © 2019, All rights reserved by Trisaiteja Narina.";

	boolean required() default true;

	String[] info() default { "Must be used in all programs", "This annotation was created for testing purpose" };
}
