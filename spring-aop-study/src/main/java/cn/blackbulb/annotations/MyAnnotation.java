package cn.blackbulb.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author wangcan
 */
@Target({ElementType.METHOD,ElementType.FIELD,ElementType.TYPE} )
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
}
