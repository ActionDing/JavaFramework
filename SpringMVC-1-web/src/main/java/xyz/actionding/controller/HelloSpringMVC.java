package xyz.actionding.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Actionding
 * @create 2022-05-02 8:32
 */
//@org.springframework.stereotype.Controller
public class HelloSpringMVC implements Controller {
//    @RequestMapping("/hello")
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("hello", "Hello, my first Spring MVC.");
//        modelAndView.setViewName("WEB-INF/jsp/first.jsp");
        // 配置视图解析器后
        modelAndView.setViewName("first");
        return modelAndView;
    }
}
