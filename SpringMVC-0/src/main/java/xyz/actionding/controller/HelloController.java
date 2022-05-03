package xyz.actionding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Actionding
 * @create 2022-05-02 16:23
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public ModelAndView hello() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("hello", "Hello, my first springmvc.");
        mav.setViewName("hello");
        return mav;
    }
}
