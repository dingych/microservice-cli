package com.yonyou.cloud.project.biz.name;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

import com.spring4all.swagger.EnableSwagger2Doc;
/**
 * 
 * @author daniell
 *
 */
@SpringBootApplication
@EnableSwagger2Doc
@EnableDiscoveryClient
@EnableFeignClients
@EnableEurekaClient
public class CloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudApplication.class, args);
	}
}
