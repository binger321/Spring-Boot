package com.zby.ssmspringboot2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement//开启事务管理
@MapperScan("com.zby.ssmspringboot2.dao")//与dao层的@Mapper二选一写上即可(主要作用是扫包)
public class Ssmspringboot2Application {

	public static void main(String[] args) {
		SpringApplication.run(Ssmspringboot2Application.class, args);
	}
}
