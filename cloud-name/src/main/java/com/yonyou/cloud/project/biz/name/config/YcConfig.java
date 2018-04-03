package com.yonyou.cloud.project.biz.name.config;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 * 
 * @author daniell
 *
 */
@Configuration
@ComponentScan(basePackages="com.yonyou.cloud")
@ServletComponentScan(basePackages="com.yonyou.cloud")
public class YcConfig {

}
