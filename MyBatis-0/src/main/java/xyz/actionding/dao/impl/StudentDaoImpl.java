package xyz.actionding.dao.impl;

/**
 * @author Actionding
 * @create 2022-05-02 17:00
 */
public class StudentDaoImpl /*implements StudentDao */{
    /*

    private SqlSession sqlSession;

    @Override
    public void insertStudent(Student student) {
        // 使用 MyBatisUtil
        try (SqlSession sqlSession = MyBatisUtil.getSqlSession()){
            sqlSession.insert("insertStudent", student);
            System.out.println(student);
            sqlSession.commit();
        }
        // before
//        try {
//            InputStream in = Resources.getResourceAsStream("mybatis.xml");
//            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
//            sqlSession = sqlSessionFactory.openSession();
//            sqlSession.insert("insertStudent", student);
//            sqlSession.commit();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (sqlSession != null) {
//                sqlSession.close();
//            }
//        }
    }

    @Override
    public void deleteStudent(int id) {
        try (SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
            sqlSession.delete("deleteStudent", id);
            sqlSession.commit();
        }
    }

    @Override
    public void updateStudent(Student student) {
        try (final SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
            sqlSession.update("updateStudent", student);
            sqlSession.commit();
        }
    }

    @Override
    public List<Student> selectAllStudents() {
        List<Student> result = null;

        try (final SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
            result = sqlSession.selectList("selectAllStudents");
        }

        return result;
    }

    @Override
    public Student selectStudentById(int id) {
        Student student = null;

        try (final SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
            student = sqlSession.selectOne("selectStudentById", id);
        }

        return student;
    }

    @Override
    public List<Student> selectStudentByName(String name) {
        List<Student> result = null;

        try (final SqlSession sqlSession = MyBatisUtil.getSqlSession()) {
            result = sqlSession.selectList("selectStudentByName", name);
        }

        return result;
    }
     */
}
