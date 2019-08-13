package com.smart4j.chapter2.service;

import com.smart4j.chapter2.model.Customer;
import com.smart4j.chapter2.util.DatabaseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * @author dingsheng
 * @date 2019-08-12 20:10
 */
public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    /**
     * 获取客户列表
     * @param
     * @return
     */
    public List<Customer> getCustomerList() {
        String sql = "select * from customer";
        List<Customer> customerList = DatabaseUtil.queryEntityList(Customer.class, sql);
        return customerList;
    }

    /**
     * 获取客户
     * @param id
     * @return
     */
    public Customer getCustomer(Long id) {
        String sql = "select * from customer where id=?";
        return DatabaseUtil.queryEntity(Customer.class, sql, id);
    }

    /**
     * 创建客户
     * @param fieldMap
     * @return
     */
    public boolean createCustomer(Map<String, Object> fieldMap) {
        return DatabaseUtil.insertEntity(Customer.class, fieldMap);
    }

    /**
     * 更新客户
     * @param id
     * @param fieldMap
     * @return
     */
    public boolean updateCustomer(Long id, Map<String, Object> fieldMap) {
        return DatabaseUtil.updateEntity(Customer.class, id, fieldMap);
    }

    /**
     * 删除客户
     * @param id
     * @return
     */
    public boolean deleteCustomer(Long id) {
        return DatabaseUtil.deleteEntity(Customer.class, id);
    }

}
