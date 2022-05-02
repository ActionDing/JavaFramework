package xyz.actionding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Actionding
 * @create 2022-05-02 10:14
 */
@Controller
//@RequestMapping("/test") // 文.件[/test/WEB-INF/jsp/annotation1.jsp] 未找到
public class AnnotationController {

    @RequestMapping(path = "/test1", method = {RequestMethod.POST, RequestMethod.GET})
    public ModelAndView test1(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("hello", "Hello, Annotation way.");
        mav.setViewName("annotation1");
        return mav;
    }

    @RequestMapping({"/test2", "/test3"})
    public ModelAndView test2(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("name", "Hello, Annotation 2.");
        mav.setViewName("annotation2");
        return mav;
    }
}
