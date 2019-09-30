package com.deep.chap2.config;

import com.deep.chap2.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "user")
    public User initUser(){
        User user = new User();
        user.setId(1L);
        user.setNote("note_1");
        user.setUserName("user_name_1");
        return user;
    }
}
