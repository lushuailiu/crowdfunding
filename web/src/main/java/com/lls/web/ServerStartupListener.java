package com.lls.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServerStartupListener implements ServletContextListener {


    @Override
    public void contextInitialized(ServletContextEvent sce) {

        //把Web应用名称保存到application作用域中
        ServletContext servletContext = sce.getServletContext();
        String contextPath = servletContext.getContextPath();
        servletContext.setAttribute("APP_PATH",contextPath);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
