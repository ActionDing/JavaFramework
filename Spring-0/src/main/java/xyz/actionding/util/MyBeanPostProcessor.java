package xyz.actionding.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Actionding
 * @create 2022-05-01 12:01
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("before");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("after");

        if ("studentService".equals(beanName)) {
            InvocationHandler handler = (proxy, method, args) -> {
                if ("study".equals(method.getName())) {
                    System.out.println("study before");
                    Object invoke = method.invoke(bean, args);
                    System.out.println("study after");

                    return invoke;
                }
                return method.invoke(bean, args);
            };

            Object proxy = Proxy.newProxyInstance(bean.getClass().getClassLoader(),
                    bean.getClass().getInterfaces(),
                    handler);

            System.out.println("postProcessBeforeInitialization");
            return proxy;
        }

        return bean;
    }
}
