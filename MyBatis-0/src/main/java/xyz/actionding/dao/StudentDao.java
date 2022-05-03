package xyz.actionding.dao;

import xyz.actionding.bean.Student;

import java.util.List;

/**
 * @author Actionding
 * @create 2022-05-02 16:59
 */
public interface StudentDao {

    void insertStudent(Student student);

    void deleteStudent(int id);

    void updateStudent(Student student);

    List<Student> selectAllStudents();

    Student selectStudentById(int id);

    List<Student> selectStudentByName(String name);
}
