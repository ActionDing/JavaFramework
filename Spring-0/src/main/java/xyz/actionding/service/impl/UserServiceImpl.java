package xyz.actionding.service.impl;

import org.springframework.stereotype.Service;
import xyz.actionding.dao.UserDao;
import xyz.actionding.service.UserService;

/**
 * @author Actionding
 * @create 2022-05-01 18:24
 */
@Service("userService")
public class UserServiceImpl implements UserService {

//    @Autowired
//    @Qualifier("userDao")
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser() {
        System.out.println("Service addUser()...");
    }

    @Override
    public void selectUserById(int id) {
        System.out.println("Service selectUserById()...");
    }

    @Override
    public int updateUser() {
        System.out.println("Service updateUser()...");
        return -1;
    }

    @Override
    public void deleteUser() {
        System.out.println("Service deleteUser()...");
    }

    @Override
    public void selectUser() {
        System.out.println("Service selectUser()...");
    }
}
