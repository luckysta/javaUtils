package com.minisun.javautils;

import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author yp-tc-m-7151
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,MybatisAutoConfiguration.class})
public class JavaUtilsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaUtilsApplication.class, args);
	}

}
