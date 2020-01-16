package cn.blackbulb;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author wangcan
 */
@Configuration
@ComponentScan("cn.blackbulb")
@EnableAspectJAutoProxy
public class Config {
}
