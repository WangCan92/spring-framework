package cn.blackbulb.imports;

import cn.blackbulb.anno.EnableMyImportDao;
import cn.blackbulb.dao.ImportDaoImpl;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author wangcan
 */

public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		if (importingClassMetadata.getMetaAnnotationTypes(EnableMyImportDao.class.getName()) != null) {
			return new String[] {ImportDaoBeanPostProcessor.class.getName()};
		}
		else return new String[0];
	}
}
