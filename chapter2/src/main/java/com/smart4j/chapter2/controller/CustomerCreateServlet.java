package com.smart4j.chapter2.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author dingsheng
 * @date 2019-08-12 20:07
 */
@WebServlet("/customer_create")
public class CustomerCreateServlet extends HttpServlet {
    private static final long serialVersionUID = -4282142966505110023L;

    /**
     * 进入创建客户界面
     * @param request
     * @param response
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

    }

    /**
     * 处理创建客户请求
     * @param request
     * @param response
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }
}
