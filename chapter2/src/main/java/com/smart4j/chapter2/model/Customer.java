package com.smart4j.chapter2.model;

import lombok.Data;

/**
 * @author dingsheng
 * @date 2019-08-12 18:53
 */
@Data
public class Customer {

    private Long id;

    private String name;

    private String contact;

    private String telphone;

    private String email;

    private String remark;
}
