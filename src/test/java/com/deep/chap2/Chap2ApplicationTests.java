package com.deep.chap2;

import com.deep.chap2.config.AppConfig;
import com.deep.chap2.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chap2ApplicationTests {
private final Logger logger = LoggerFactory.getLogger(Chap2Application.class);
    @Test
    public void iocTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = context.getBean(User.class);
        logger.info("Bean名称:"+user.getUserName());
    }

}
