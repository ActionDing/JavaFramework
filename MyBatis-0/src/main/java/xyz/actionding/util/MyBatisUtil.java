package xyz.actionding.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Actionding
 * @create 2022-05-02 17:50
 */
public class MyBatisUtil {
    private static volatile SqlSessionFactory factory;

    public static SqlSession getSqlSession() {
        try {
            if (factory == null) {
                InputStream in = Resources.getResourceAsStream("mybatis.xml");
                synchronized (MyBatisUtil.class) {
                    if (factory == null) {
                        factory = new SqlSessionFactoryBuilder().build(in);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return factory.openSession();
    }
}
