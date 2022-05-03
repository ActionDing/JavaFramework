package xyz.actionding.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import xyz.actionding.bean.Student;
import xyz.actionding.dao.StudentDao;
import xyz.actionding.util.MyBatisUtil;

import java.util.List;

/**
 * @author Actionding
 * @create 2022-05-02 17:27
 */
class StudentDaoImplTest {
    private StudentDao studentDao;
    private SqlSession sqlSession;

    @BeforeEach
    public void initStudentDao() {
//        studentDao = new StudentDaoImpl();
        // 动态代理Mapper
        sqlSession = MyBatisUtil.getSqlSession();
        studentDao = sqlSession.getMapper(StudentDao.class);
    }

    @AfterEach
    public void closeSession() {
        if (sqlSession != null) {
            sqlSession.close();
        }
    }

    @Test
    void insertStudent() {
        studentDao.insertStudent(new Student("Tom", 32, 88.5));
    }

    @Test
    void deleteStudent() {
        studentDao.deleteStudent(3);
    }

    @Test
    void updateStudent() {
        Student tony = new Student(2, "Tony", 23, 100);
        studentDao.updateStudent(tony);

    }

    @Test
    void selectAllStudents() {
        List<Student> students = studentDao.selectAllStudents();
        students.forEach(System.out::println);
    }

    @Test
    void selectStudentById() {
        Student student = studentDao.selectStudentById(2);
        System.out.println(student);
    }

    @Test
    void selectStudentByName() {
        List<Student> students = studentDao.selectStudentByName("om");
        students.forEach(System.out::println);
    }
}