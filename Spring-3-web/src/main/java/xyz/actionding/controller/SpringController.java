package xyz.actionding.controller;

import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Actionding
 * @create 2022-05-01 19:49
 */
public class SpringController extends HttpServlet {

/**
 * @param config
 */
public void init(ServletConfig config) {
    SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
            config.getServletContext());
}

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

    }
}
