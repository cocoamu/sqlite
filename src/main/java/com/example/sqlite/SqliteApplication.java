package com.example.sqlite;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// 下面这一行为新增数据库关联注解
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.example.sqlite.Mapper")
public class SqliteApplication {

    public static void main(String[] args) {
        SpringApplication.run(SqliteApplication.class, args);
    }

}
