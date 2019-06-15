package com.example.demo;

import com.example.demo.mymodule.entity.User;
import com.example.demo.mymodule.mapper.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;
import java.util.List;

@SpringBootApplication
@MapperScan("com.example.demo")
public class DemoMybatisplusApplication {

	
	
	@Resource
    private UserMapper userMapper;

    @Bean
    public void ss() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(DemoMybatisplusApplication.class, args);
	}

}
