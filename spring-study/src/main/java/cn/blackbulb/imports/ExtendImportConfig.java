package cn.blackbulb.imports;

import cn.blackbulb.anno.EnableImportConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

/**
 * @author wangcan
 */
public class ExtendImportConfig implements ImportAware {
	private String name;
	private String code;
	@Value("${extend.config.name}")
	private String sourcceName;

	@Override
	public void setImportMetadata(AnnotationMetadata importMetadata) {
		Map<String, Object> annotationAttributes = importMetadata.getAnnotationAttributes(EnableImportConfig.class.getName());
		this.name = (String) annotationAttributes.get("name");
		this.code = (String) annotationAttributes.get("code");
	}

	@Override
	public String toString() {
		return "ExtendImportConfig{" + "name='" + name + '\'' + ", code='" + code + '\'' + ", sourcceName='" + sourcceName + '\'' + '}';
	}
}
