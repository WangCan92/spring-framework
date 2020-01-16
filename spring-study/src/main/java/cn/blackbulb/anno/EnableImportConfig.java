package cn.blackbulb.anno;

import cn.blackbulb.imports.ExtendImportConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author wangcan
 */
@Retention(RetentionPolicy.RUNTIME)
@Import(ExtendImportConfig.class)
public @interface EnableImportConfig {
	String name() default "admin";

	String code() default "code";

}
