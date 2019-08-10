package cn.blackbulb.conf;

import cn.blackbulb.service.ServiceTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;

/**
 * @author wangcan
 */
//@ImportResource("classpath:spring-aop.xml")
@ImportResource("classpath:factorybean.xml")
@ComponentScan("cn.blackbulb")
//@EnableAspectJAutoProxy
@EnableAspectJAutoProxy(proxyTargetClass = true)
//@ComponentScan(value = "cn.blackbulb",excludeFilters = {@ComponentScan.Filter(type = FilterType.REGEX,pattern = "cn.blackbulb.service.*")},includeFilters = {@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,value = ServiceTest.class)})
public class AppConfig {
}
