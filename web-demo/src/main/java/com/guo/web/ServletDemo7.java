package com.guo.web;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * urlPattern:一个Servlet可以配置多个访问路径
 */
@WebServlet(urlPatterns = {"/demo7","/demo8"})
public class ServletDemo7 extends MyHttpServlet{
    @Override
    protected void doGet(ServletRequest servletRequest, ServletResponse servletResponse) {
        System.out.println("demo7 get...");
    }

    @Override
    protected void doPost(ServletRequest servletRequest, ServletResponse servletResponse) {

    }
}
