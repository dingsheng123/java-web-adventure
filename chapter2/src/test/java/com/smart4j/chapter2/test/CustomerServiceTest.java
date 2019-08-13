package com.smart4j.chapter2;

import com.smart4j.chapter2.model.Customer;
import com.smart4j.chapter2.service.CustomerService;
import com.smart4j.chapter2.util.DatabaseUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dingsheng
 * @date 2019-08-12 20:16
 */
public class CustomerServiceTest {

    private final CustomerService customerService;

    public CustomerServiceTest() {
        customerService = new CustomerService();
    }

    @Before
    public void init() throws IOException {
        DatabaseUtil.executeSqlFile("sql/customer_init.sql");
    }

    @Test
    public void getCustomerListTest() {
        List<Customer> customerList = customerService.getCustomerList();
        System.out.println(customerList);
        Assert.assertEquals(2, customerList.size());
    }

    @Test
    public void getCustomerTest() {
        Long id = 1L;
        Customer customer = customerService.getCustomer(id);
        System.out.println(customer);
        Assert.assertNotNull(customer);
    }

    @Test
    public void CreateCustomerTest() {
        Map<String, Object> fieldMap = new HashMap<>();
        fieldMap.put("name", "customer100");
        fieldMap.put("contact", "John");
        fieldMap.put("telphone", "13577777777");

        boolean result = customerService.createCustomer(fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void updateCustomerTest() {
        Long id = 1L;
        Map<String, Object> fieldMap = new HashMap<>();
        fieldMap.put("contact", "Eric");

        boolean result = customerService.updateCustomer(id, fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void deleteCustomerTest() {
        Long id = 1L;
        boolean result = customerService.deleteCustomer(id);
        Assert.assertTrue(result);
    }
}
