package cn.springboot.text;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
@MapperScan({"cn.springboot.text.dao","cn.springboot.text.alipay.mapper"})
public class TextApplication {

    public static void main(String[] args) {
        SpringApplication.run(TextApplication.class, args);
    }

}
