package xyz.actionding.service.impl;

import xyz.actionding.service.StudentService;

/**
 * @author Actionding
 * @create 2022-05-01 11:31
 */
public class StudentServiceImpl implements StudentService {
    @Override
    public void study() {
        System.out.println("good good study, day day up.");
    }

    public void init() {
        System.out.println("init() method");
    }

    public void destroy() {
        System.out.println("destroy() method");
    }
}
