package com.smart4j.chapter2.controller;

import com.smart4j.chapter2.model.Customer;
import com.smart4j.chapter2.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author dingsheng
 * @date 2019-08-13 18:38
 */
@WebServlet("/customer")
public class CustomerServlet extends HttpServlet {
    private static final long serialVersionUID = -6740889746180599141L;

    private CustomerService customerService;

    @Override
    public void init() {
        customerService = new CustomerService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = customerService.getCustomerList();
        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("/WEB-INF/view/customer.jsp").forward(request, response);

    }
}
