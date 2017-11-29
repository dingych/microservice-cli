# 微服务骨架项目
你是否觉得每次新建工程都是很麻烦，要去理清依赖配置pom，新建mybatis的配置，新建各种三方依赖，包结构，那么恭喜你现在可以解脱了
我们将提供使用两种脚手架(for boot 和 for cloud 项目)，秒建新工程，目前已经把骨架上传到了公司内网私有库上。

增加一个remote的配置即可 http://210.13.111.26:10160/nexus/service/local/repositories/snapshots/content/archetype-catalog.xml

## 项目的特色
忘记基础配置，提高生产力

## 如何使用

## 默认依赖哪些库


当然 你也可以用下面的无脑拷贝版
## 无脑拷贝的模板（D.4版本）
```
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  
	<modelVersion>4.0.0</modelVersion>
	
	<groupId>com.yonyou.cloud</groupId>
	<artifactId>microservice-server-eureka</artifactId>
	<version>0.0.1-SNAPSHOT</version>

	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>1.5.8.RELEASE</version>
		<relativePath /> <!-- lookup parent from repository -->
	</parent>

	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
		<java.version>1.8</java.version>
		<spring-cloud.version>Dalston.SR4</spring-cloud.version>
	</properties>

	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>
	
	<dependencyManagement>
		<dependencies>
			<dependency>
				<groupId>org.springframework.cloud</groupId>
				<artifactId>spring-cloud-dependencies</artifactId>
				<version>${spring-cloud.version}</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
		</dependencies>
	</dependencyManagement>

	<build>
	    <plugins>
		<plugin>
		    <groupId>org.springframework.boot</groupId>
		    <artifactId>spring-boot-maven-plugin</artifactId>
		    <executions>
			<execution>
			    <goals>
				<goal>build-info</goal>
			    </goals>
			</execution>
		    </executions>
		</plugin>
	    </plugins>
	</build>
		
</project>

```

## eureka相关

```
		<!--eureka服务端 -->
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-eureka-server</artifactId>
		</dependency>
		
		<!--eureka客户端 -->
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-eureka</artifactId>
		</dependency>
```

## feign

```
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-feign</artifactId>
		</dependency>

```

## config 相关

```
		<!-- cloud-config -->
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-config-client</artifactId>
		</dependency>
```

## monitor 相关

```

		<!-- monitor -->
		<dependency>
			<groupId>de.codecentric</groupId>
			<artifactId>spring-boot-admin-starter-client</artifactId>
			<version>1.3.6</version>
		</dependency>
		
```

## swagger 

```
		<!-- rest api -->
		<dependency>
			<groupId>com.spring4all</groupId>
			<artifactId>spring-boot-starter-swagger</artifactId>
			<version>1.5.1.RELEASE</version>
		</dependency>
		
```

## 连接池

```
		<!-- 连接池 -->
		<!--通过starter简化配置 -->
		<dependency>
			<groupId>com.alibaba</groupId>
			<artifactId>druid-spring-boot-starter</artifactId>
			<version>1.1.4</version>
		</dependency>
```

## spring boot admin 

```
		<dependency>
			<groupId>de.codecentric</groupId>
			<artifactId>spring-boot-admin-server</artifactId>
			<version>1.5.5</version>
		</dependency>
		<dependency>
			<groupId>de.codecentric</groupId>
			<artifactId>spring-boot-admin-server-ui</artifactId>
			<version>1.5.5</version>
		</dependency>
		
		
		
		<build>
		    <plugins>
			<plugin>
			    <groupId>org.springframework.boot</groupId>
			    <artifactId>spring-boot-maven-plugin</artifactId>
			    <executions>
				<execution>
				    <goals>
					<goal>build-info</goal>
				    </goals>
				</execution>
			    </executions>
			</plugin>
		    </plugins>
		</build>
		
```

## actuator

```
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>
```


## rabbitmq
```
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-amqp</artifactId>
		</dependency>
```

## jackson

```

		 <dependency>
		       <groupId>org.codehaus.jackson</groupId>
		       <artifactId>jackson-mapper-asl</artifactId>
		       <version>1.9.8</version>
        	</dependency>
```

## 启动脚本

https://github.com/yonyou-auto-dev/mircoservice-cli/blob/master/service.sh


## 超时相关
https://mp.weixin.qq.com/s/CvksAP25pv3qiKM3D4tJNw
