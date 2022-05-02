package xyz.actionding.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Actionding
 * @create 2022-05-02 8:32
 */
public class HelloSpringMVC implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("hello", "Hello, my first Spring MVC.");
        modelAndView.setViewName("/WEB-INF/jsp/first.jsp");
        return modelAndView;
    }
}
