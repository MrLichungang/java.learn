package com.guo.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
/**
 * Servlet方法介绍
 */
@WebServlet(urlPatterns = "/demo3",loadOnStartup = 1)
public class ServletDemo3 implements Servlet {
    private ServletConfig config;
    /**
     * 初始化方法
     * 1.调用时机：默认情况下，servlet被第一次访问时，调用
     * 2.调用次数：一次
     *  loadOnStartup
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.config = servletConfig;
        System.out.println("init...");
    }

    /**
     * 提供服务
     * 1.调用时机：每一次servlet被访问时
     * 2.调用次数：多次
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet hello world~");
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    /**
     * 销毁方法
     * 1.调用时机：内存释放或者服务器关闭时，servlet对象会被销毁
     * 2.调用次数：一次
     */
    @Override
    public void destroy() {
        System.out.println("destroy...");

    }


    @Override
    public ServletConfig getServletConfig() {
        return config;
    }
}
