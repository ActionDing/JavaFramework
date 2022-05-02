package xyz.actionding.service;

/**
 * @author Actionding
 * @create 2022-05-01 18:23
 */
public interface UserService {
    void addUser();

    void selectUserById(int id);

    int updateUser();

    void deleteUser();

    void selectUser();
}
