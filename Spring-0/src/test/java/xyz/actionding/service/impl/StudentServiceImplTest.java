package xyz.actionding.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.actionding.service.StudentService;

/**
 * @author Actionding
 * @create 2022-05-01 11:34
 */
class StudentServiceImplTest {

    @Test
    void study() {
//        // before
//        StudentService beforeService = new StudentServiceImpl();
//        beforeService.study();

        // now
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService nowService = (StudentService) context.getBean("studentService");
        nowService.study();

//        // or
//        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
//        reader.loadBeanDefinitions(new FileSystemResource("D:\\Development\\code\\JavaFramework\\Spring-0\\src\\main\\resources\\applicationContext.xml"));
//        StudentService orService = (StudentService) factory.getBean("studentService");
//        orService.study();
    }

    @Test
    void initAndDestroy() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = (StudentService) context.getBean("studentService");

        studentService.study();
        ((ClassPathXmlApplicationContext) context).close();
    }
}