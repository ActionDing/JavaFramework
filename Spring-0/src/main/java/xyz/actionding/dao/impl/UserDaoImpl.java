package xyz.actionding.dao.impl;

import org.springframework.stereotype.Component;
import xyz.actionding.dao.UserDao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Actionding
 * @create 2022-05-01 18:22
 */
@Component("userDao")
//@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("add a user");
    }

    @PostConstruct
    public void before() {
        System.out.println("before() method...初始化");
    }

    @PreDestroy
    public void after() {
        System.out.println("after() method...销毁");
    }
}
