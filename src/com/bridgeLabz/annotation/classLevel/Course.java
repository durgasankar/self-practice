package com.bridgeLabz.annotation.classLevel;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Custom annotation for class level
 * 
 * @author Durgasankar Mishra
 * @created 2020-01-06
 * @version 1.8
 */
@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Course {

	/**
	 * -> Annotations are only metadata and do not contain any business logic.
	 * Annotations only provide information about the attribute
	 * (class/method/package/field) on which it is defined.
	 * 
	 * @Documented – A simple market annotation that tells whether to add an
	 *             annotation in the Java doc or not.
	 * 
	 * @Retention – Defines how long the annotation should be kept.
	 * 
	 *            -> RetentionPolicy.SOURCE – Discard during the compile. These
	 *            annotations don’t make any sense after the compile has completed,
	 *            so they aren’t written to the bytecode.
	 *            Examples: @Override, @SuppressWarnings
	 * 
	 *            -> RetentionPolicy.CLASS – Discard during class load. Useful when
	 *            doing bytecode-level post-processing.
	 * 
	 *            -> RetentionPolicy.RUNTIME – Do not discard. The annotation should
	 *            be available for reflection at runtime.
	 * 
	 * @Target – Where annotation can be placed. If you don’t specify this,
	 *         annotation can be placed anywhere. The following are valid values.
	 *         One important point here is that it’s inclusive only, which means if
	 *         you want annotation on 7 attributes and just want to exclude only one
	 *         attribute, you need to include all 7 while defining the target.
	 * 
	 * @Inherited – Controls whether the annotation should affect the subclass.
	 */

	String cId() default "MTH-011";

	String cName() default "xyz";

	int cCost() default 10000;

}
