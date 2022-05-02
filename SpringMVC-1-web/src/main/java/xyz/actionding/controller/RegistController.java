package xyz.actionding.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Actionding
 * @create 2022-05-02 11:22
 */
@Controller
public class RegistController {
    @RequestMapping(path = "/regist")
    public ModelAndView regist(String username, int age) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("username", username);
        mav.addObject("age", age);
        mav.setViewName("result");
        return mav;
    }
}
