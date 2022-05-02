package xyz.actionding.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.actionding.service.UserService;

/**
 * @author Actionding
 * @create 2022-05-01 18:27
 */
class UserServiceImplTest {

    /**
     * test DI
     *
     */
    @Test
    void addUser() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.addUser();

        System.out.println("============");
        userService.updateUser();
    }
}