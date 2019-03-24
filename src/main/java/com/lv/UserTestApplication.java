package com.lv;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lv.mapper")
public class UserTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserTestApplication.class, args);
	}

}
