package com.wyh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//扫描同级包及子包
@MapperScan(basePackages = {"com.wyh.mapper"})//在mapper中不用添加注解，在此处指明要扫描的mapper所在的包路径。通过反射技术读取该包下面的所有类
public class SpringbootKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootKafkaApplication.class, args);
	}

}
