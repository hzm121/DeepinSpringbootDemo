package com.deep.chap2.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
@ComponentScan(value = "com.deep.chap2.*",excludeFilters = {@ComponentScan.Filter(classes = {Service.class})})
public class AppConfig {
//    @Bean(name = "user")
//    public User initUser(){
//        User user = new User();
//        user.setId(1L);
//        user.setNote("note_1");
//        user.setUserName("user_name_1");
//        return user;
//    }


}
