package xyz.actionding.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author Actionding
 * @create 2022-05-01 19:17
 */
public class MyAspect {

    public void before() {
        System.out.println("MyAspect before()...前置通知");
    }

    public void after() {
        System.out.println("MyAspect after()...最终通知");
    }

    public void afterThrowing(Exception e) {
        System.out.println("MyAspect before()...异常通知" + e);
    }

    public void afterReturning(int result) {
        System.out.println("MyAspect before()...后置通知" + result);
    }

    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("MyAspect around before()...环绕通知=前");
        Object proceed = pjp.proceed();
        System.out.println("MyAspect around after()...环绕通知=后");
        return proceed;
    }

}
