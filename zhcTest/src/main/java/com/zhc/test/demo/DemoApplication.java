package com.zhc.test.demo;

import com.zhc.test.demo.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

    @Value("${user.userName}")
    private String userName;
    @Value("${user.id}")
    private String id;
    @Value("${user.sex}")
    private String sex;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping("/")
    public String home(){

        User user = new User();
        user.setId(Long.valueOf(id));
        user.setUserName(userName);
        user.setSex(sex);

        return user.toString();
    }
}
