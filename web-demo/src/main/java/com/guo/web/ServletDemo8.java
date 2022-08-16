package com.guo.web;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * urlPattern:
 * 精确匹配
 */
@WebServlet(urlPatterns = "/user/select")
public class ServletDemo8 extends MyHttpServlet{
    @Override
    protected void doGet(ServletRequest servletRequest, ServletResponse servletResponse) {
        System.out.println("demo8 get...");
    }

    @Override
    protected void doPost(ServletRequest servletRequest, ServletResponse servletResponse) {

    }
}
